package com.knoldusMockService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Configuration for all(/some) of your Swagger needs. Your generated documentation will live at
 * http://localhost:8080/swagger-ui/index.html when running locally.
 *
 * @author Anshuman Shukla
 */
@Configuration
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket api() {
        var apiInfo = new ApiInfoBuilder()
                .title("Knoldus_mock_service")
                .version("1.0")
                .license(null)
                .licenseUrl(null)
                .termsOfServiceUrl(null)
                .description("The Knoldus_mock_service is responsible to send the dummy data .")
                .build();

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.knoldusMockService"))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

}
