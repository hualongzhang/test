package com.example.demo.config;

import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef="twoEntityManagerFactory",
        transactionManagerRef="twoTransactionManager",
        basePackages= {"com.example.demo.repository.datasourcetwo" } )
public class DataSourceTwo {

	@Autowired
    private JpaProperties jpaProperties;
    
    @Autowired
    @Qualifier("twoDataSource")
    private DataSource twoDataSource;
    
    @Bean(name = "twoEntityManagerFactoryBean")
    public LocalContainerEntityManagerFactoryBean userEntityManagerFactoryBean(EntityManagerFactoryBuilder builder) {
           return builder
                   .dataSource(twoDataSource)
                   .properties(getVendorProperties(twoDataSource))
                   .packages("com.example.demo.entity.two") //设置实体类所在位置
                   .persistenceUnit("twoPersistenceUnit")
                   .build();
           //.getObject();//不要在这里直接获取EntityManagerFactory
   }
    
    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }
    
    @Bean(name = "twoEntityManagerFactory")
    //@Primary
    public EntityManagerFactory userEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return this.userEntityManagerFactoryBean(builder).getObject();
    }
    
    @Bean(name = "twoTransactionManager")
    @Primary
    public PlatformTransactionManager writeTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(userEntityManagerFactory(builder));
    }
}
