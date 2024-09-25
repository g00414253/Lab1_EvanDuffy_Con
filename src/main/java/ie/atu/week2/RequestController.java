package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/person")
public class RequestController {
@GetMapping("/sayHello")
    public String sayHello(){
        return "Hi There";
    }

    @GetMapping("/greet/{name}")
    public  String getUser(@PathVariable String name ){
    return "Greetings " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String Name,@RequestParam int Age){
    return "Name: " + Name + "\n Age: " + Age;
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
        int Result;

        if (operation.equals("add")) {
            Result = num1 + num2;
            return "Num1:" + num1 + "\nNum2: " + num2 + "\nOperation: " + operation + "\nResult:" + Result;
        }else if (operation.equals("subtract")) {
            Result = num1 - num2;
            return "Num1:" + num1 + "\nNum2: " + num2 + "\nOperation: " + operation + "\nResult:" + Result;
        }else if (operation.equals("multiply")) {
            Result = num1 * num2;
            return "Num1:" + num1 + "\nNum2: " + num2 + "\nOperation: " + operation + "\nResult:" + Result;
        }if (operation.equals("divide")) {
            Result = num1 / num2;
            return "Num1:" + num1 + "\nNum2: " + num2 + "\nOperation: " + operation + "\nResult:" + Result;
        }
        else{
            return "Invalid Entry" + operation;
        }
    }
}
