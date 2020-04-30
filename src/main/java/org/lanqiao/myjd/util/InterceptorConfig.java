package org.lanqiao.myjd.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Configuration
public class InterceptorConfig {
    public void addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new CheckRegInterceptor()).addPathPatterns("/**");
        interceptorRegistration.addPathPatterns("/**");
        interceptorRegistration.excludePathPatterns("/Register.html");
        interceptorRegistration.excludePathPatterns("/checkphone");
        interceptorRegistration.excludePathPatterns("/checkname");
        interceptorRegistration.excludePathPatterns("/checkemail");
        interceptorRegistration.excludePathPatterns("/insertAccount");

        interceptorRegistration.excludePathPatterns("/login/checkAccount");
        interceptorRegistration.excludePathPatterns("/index.html");


        interceptorRegistration.excludePathPatterns("/css/*.css");
        interceptorRegistration.excludePathPatterns("/images/register/*.jpg");
        interceptorRegistration.excludePathPatterns("/images/register/*.png");
        interceptorRegistration.excludePathPatterns("/js/*.js");


    }

}

