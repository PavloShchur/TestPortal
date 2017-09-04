package com.pavlo.testPortal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class MailConfig extends AbstractProperties {

    AbstractProperties abstractProperties = new AbstractProperties();

    @Bean
    public JavaMailSender javaMailService() throws IOException {

        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost("smtp.gmail.com");
        javaMailSender.setPort(587);
        javaMailSender.setUsername(
                abstractProperties.abstractPropertiesMethod().get("email"));
        javaMailSender.setPassword(abstractProperties.abstractPropertiesMethod().get("password"));

        Properties properties = new Properties();
        properties = javaMailSender.getJavaMailProperties();
        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.debug", "true");

        return javaMailSender;
    }

}
