package Swagger02.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.Collections;

@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        ApiInfo apiInfo = new ApiInfo(
                "Swagger-02",
                "A simple swagger example.",
                "1.0.0",
                "https://it.wikipedia.org/wiki/Licenza_MIT",
                new Contact("Alessandro Marinelli", "http://develhope.co", "alessandro@gmail.com"),
                "MIT",
                "http://www.mitservices.com/termsandconditions.html",
                Collections.emptyList()
        );
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo).tags(
                        new Tag("DefaultController", "Simple GET controller to see the path for SpringFox"),
                        new Tag("MathController", "Simple GET controller to use three arithmetic operations"));
    }
}
