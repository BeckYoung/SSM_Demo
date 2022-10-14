package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"org.example.controller", "org.example.config"})
@EnableWebMvc // json与实体自动装配，功能不仅仅如此
public class SpringMvcConfig {
}
