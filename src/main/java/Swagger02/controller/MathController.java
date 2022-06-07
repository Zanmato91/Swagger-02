package Swagger02.controller;
import Swagger02.entity.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {
        @GetMapping()
        @ApiOperation(value = "Prints a welcome message to the user as API response")
        public String getWelcomeMath(){
            return "Welcome to the math path!";
        }
    @GetMapping("/division-info")
    @ApiOperation(value = "Division description")
    public ArithmeticOperation division(){
            String[] properties = {"Not possible /0", "If /1 return the number", "etc."};
            return new ArithmeticOperation("Division", 2, "Division Arithmetic Operation", properties);
    }
    @GetMapping("/multiplication")
    @ApiOperation(value = "Required two integers.")
    public int multiplication(
            @ApiParam(value = "First integer") @RequestParam int ope1,
            @ApiParam(value = "Second Integer")@RequestParam int ope2){
            return ope1*ope2;
    }
    @GetMapping("/square{n}")
    @ApiOperation(value = "Return the square of the insert number")
    public int square(
            @ApiParam(value = "The integer number")@PathVariable int n){
            return n*n;
    }
}
