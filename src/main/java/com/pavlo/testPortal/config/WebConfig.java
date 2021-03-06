package com.pavlo.testPortal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.pavlo.testPortal.*")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {

        resourceHandlerRegistry.addResourceHandler("/css/**")
                .addResourceLocations("/static/styles/");
        resourceHandlerRegistry.addResourceHandler("/bootstrap/**")
                .addResourceLocations("/static/styles/");
        resourceHandlerRegistry.addResourceHandler("/js/**")
                .addResourceLocations("/static/js/");
        resourceHandlerRegistry.addResourceHandler("/images/**")
                .addResourceLocations("/static/images");
        resourceHandlerRegistry.addResourceHandler("/userViews/**")
                .addResourceLocations("/static/js/userJS/");
        resourceHandlerRegistry.addResourceHandler("/bookViews/js/")
                .addResourceLocations("/static/js/bookJS/");
        resourceHandlerRegistry.addResourceHandler("/answerViews/**")
                .addResourceLocations("/static/js/answerJS/");
        resourceHandlerRegistry.addResourceHandler("/articleViews/**")
                .addResourceLocations("/static/js/articleJS/");
    }
}
