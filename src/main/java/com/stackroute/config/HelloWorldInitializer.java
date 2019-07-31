package com.stackroute.config;

import org.springframework.web.servlet.support.*;
//this registers a spring dispatcher servlet and creates a web application context
public class HelloWorldInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {//redirects to root configuration
        return new Class[]{HelloWorldConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override//used for mapping incoming requests to controller
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
