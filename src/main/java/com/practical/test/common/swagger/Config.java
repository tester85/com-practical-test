package com.practical.test.common.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; 

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;  

@Configuration  
@Slf4j
@EnableSwagger2
public class Config {
    
    @Bean
    public Docket api(){
        log.info("Inside Docket Api");

        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.practical.test"))
        .apis(RequestHandlerSelectors.any())        
        .paths(PathSelectors.any())
        .build(); 
    } 
  
}
