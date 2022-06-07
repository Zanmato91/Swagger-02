package Swagger02.controller;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class DefaultController {
    @GetMapping()
    @ApiModelProperty(value = "Welcome message.")
    public String hello(){
        return "Welcome on the second swagger test!\nVisit http://localhost:5050/swagger-ui/";
    }
}
