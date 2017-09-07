package com.pavlo.testPortal.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
@EnableJpaRepositories("com.pavlo.testPortal.dao")
@EnableTransactionManagement
public class DataConfig {

    AbstractProperties abstractProperties = new AbstractProperties();

    @Bean
    public DataSource dataSource() throws IOException {

        DriverManagerDataSource managerDataSource = new DriverManagerDataSource();
        managerDataSource.setDriverClassName(
                abstractProperties.abstractPropertiesMethod().get("driver"));
        managerDataSource.setUrl(
                abstractProperties.abstractPropertiesMethod().get("url"));
        managerDataSource.setUsername(
                abstractProperties.abstractPropertiesMethod().get("user"));
        managerDataSource.setPassword(
                abstractProperties.abstractPropertiesMethod().get("password"));

        return managerDataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
        hibernateJpaVendorAdapter.setShowSql(true);

        return hibernateJpaVendorAdapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws IOException {

        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean =
                new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSource());
        localContainerEntityManagerFactoryBean.setPackagesToScan("com.pavlo.testPortal.entity");
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());

        Properties properties = new Properties();
        properties.put("hibernate.hbm2ddl.auto", "update");
        localContainerEntityManagerFactoryBean.setJpaProperties(properties);
        
        return localContainerEntityManagerFactoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }
}
