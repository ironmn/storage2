package edu.dhu.storage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("pages/index");
        registry.addViewController("").setViewName("pages/index");
        registry.addViewController("/index.html").setViewName("pages/index");
        registry.addViewController("/login.html").setViewName("pages/login");
        registry.addViewController("/main.html").setViewName("pages/main");
        registry.addViewController("/items.html").setViewName("pages/items");
        registry.addViewController("/add.html").setViewName("pages/add");
        registry.addViewController("/register.html").setViewName("pages/register");
    }

}
