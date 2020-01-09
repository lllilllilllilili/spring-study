package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration //설정파일이 있을 때 무조건 붙여줘야함
@EnableSwagger2 //Swagger기능을 사용하기 위해 붙여줌
public class SwaggerConfig {
	
	@Bean //@Bean은 설정파일
	public Docket api() {		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Qna Management")	// select a spec
				.apiInfo(info())
				.select()//Initiates a builder for api selection.
				.apis(RequestHandlerSelectors.basePackage("com.controller"))
				//.paths(PathSelectors.any())
				//.paths(PathSelectors.ant("/customers/**"))
				.build();

	}

	private ApiInfo info() {
		return new ApiInfoBuilder().title("Qna Management API")
				.description("<h1>Qna Management Management</h1>")
				.license("ssafy")
				.version("2.0")
				.build();
	}
}
