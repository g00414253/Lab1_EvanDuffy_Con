package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
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
}
