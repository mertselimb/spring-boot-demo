package com.pluralsight.conferancedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/first-spring-boot-app");
        builder.password("254127");
        builder.username("artidokuz");
        System.out.println("Custom datasource has been set!");
        return builder.build();
    }

}
