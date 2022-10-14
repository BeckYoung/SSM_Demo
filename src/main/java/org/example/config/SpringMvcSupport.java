package org.example.config;

import org.example.controller.interceptor.ProjectInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Resource
    private ProjectInterceptor projectInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/users", "/users/*");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 不拦截的路径
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }
}
