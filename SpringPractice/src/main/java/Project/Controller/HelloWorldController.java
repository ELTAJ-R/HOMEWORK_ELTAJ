package Project.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;



@RequestMapping("/welcome")
@RestController

public class HelloWorldController {

    @GetMapping("/hello/")
    public String Hello() {
        return "HELLO";
    }




    @GetMapping("/*")
    public String redirect(){
        return "forward/:hello";
    }
}
