//package com.cm.cmks.cmks.config;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


//@Configuration
//public class InterceptConfig extends WebMvcConfigurationSupport {
//
//
//    @Autowired
//    private JwtInterceptor jwtInterceptor;
//
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(jwtInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/**/login");
//    }
//}
