package com.ead.course.configs;

import net.kaczmarzyk.spring.data.jpa.web.SpecificationArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Configuration
public class ResolverConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new SpecificationArgumentResolver());
        argumentResolvers.add(new PageableHandlerMethodArgumentResolver());
        super.addArgumentResolvers(argumentResolvers);
    }

}

// Se quiser usar a configuração global de data (DateConfig) com Specification para não dar conflito
//@Configuration
//public class ResolverConfig implements WebMvcConfigurer {
//
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//        argumentResolvers.add(new SpecificationArgumentResolver());
//
//
//        PageableHandlerMethodArgumentResolver resolver = new PageableHandlerMethodArgumentResolver();
//        argumentResolvers.add(resolver);
//    }
//}
