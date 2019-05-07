package robinpractice.springboot_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @ResponseBody
    @RequestMapping("/hello")
    public String helloHandle() {
        System.out.println("hello");
        return "Hello World!";
    }
}
