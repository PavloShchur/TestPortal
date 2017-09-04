package com.pavlo.testPortal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by User on 03.06.2017.
 */
@Configuration
@EnableWebSecurity
public class SecurityInit extends AbstractSecurityWebApplicationInitializer{
}
