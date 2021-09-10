package com.avm.UserManagement;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2	
public class SpringFoxConfig {

	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.avm"))
	                .paths(PathSelectors.any())
	                .build().apiInfo(getApiInfo());
	    }
	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder()
				.title("User management Services")
				.description("This is the service which is used for user creation and login purpose")
				.build();
	}
}
