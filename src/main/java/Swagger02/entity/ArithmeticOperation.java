package Swagger02.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArithmeticOperation {
    @ApiModelProperty(value = "The name of the operation.", example = "Sum")
    private String name;
    @ApiModelProperty(value = "The minimum number of operands you need.", example = "2")
    private int minNumberOfOperands;
    @ApiModelProperty(value = "The description of the operation.", example = "the total amount resulting from the addition of two or more numbers.")
    String description;
    @ApiModelProperty(value = "NOT DEFINED", example = "NOT DEFINED")
    private String[] properties;

}