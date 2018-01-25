package com.example.demo.config;

import javax.servlet.MultipartConfigElement;
import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;


@Configuration
public class FileUploadMvcConfiguration {

	 @Bean
	 public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
	    // 设置文件大小限制 ,超出设置页面会抛出异常信息，
	    // 这样在文件上传的地方就需要进行异常信息的处理了;
        factory.setMaxFileSize("1024KB"); // KB,MB
	    /// 设置总上传数据总大小
        factory.setMaxRequestSize("1024KB");
	    // Sets the directory location where files will be stored.
	    // factory.setLocation("路径地址");
        return factory.createMultipartConfig();
    }
	 
	 @Primary
	 @Bean(name="oneDataSource")
	 @ConfigurationProperties("spring.datasource.druid.one")
	 public DataSource dataSourceOne(){
		    return DruidDataSourceBuilder.create().build();
	 }
	 
	 
	 @Bean(name="twoDataSource")
	 @ConfigurationProperties("spring.datasource.druid.two")
	 public DataSource dataSourceTwo(){
	     return DruidDataSourceBuilder.create().build();
	 }
}
