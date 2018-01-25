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
		entityManagerFactoryRef="oneEntityManagerFactory",
        transactionManagerRef="oneTransactionManager",
        basePackages= {"com.example.demo.repository.datasourceone" } )
public class DataSourceOne {

    @Autowired
    private JpaProperties jpaProperties;
    
    @Autowired
    @Qualifier("oneDataSource")
    private DataSource oneDataSource;
    
    @Bean(name = "oneEntityManagerFactoryBean")
    public LocalContainerEntityManagerFactoryBean userEntityManagerFactoryBean(EntityManagerFactoryBuilder builder) {
           return builder
                   .dataSource(oneDataSource)
                   .properties(getVendorProperties(oneDataSource))
                   .packages("com.example.demo.entity.one") //设置实体类所在位置
                   .persistenceUnit("onePersistenceUnit")
                   .build();
           //.getObject();//不要在这里直接获取EntityManagerFactory
   }
    
    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }
    
    @Bean(name = "oneEntityManagerFactory")
    @Primary
    public EntityManagerFactory userEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return this.userEntityManagerFactoryBean(builder).getObject();
    }
    
    @Bean(name = "oneTransactionManager")
    @Primary
    public PlatformTransactionManager writeTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(userEntityManagerFactory(builder));
    }

}
