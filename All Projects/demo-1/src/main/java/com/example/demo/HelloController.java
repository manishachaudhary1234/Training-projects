package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@Autowired
	HelloService obj;
	
    @RequestMapping("/")
    public String index() {
        return "Hii";
    }
    @RequestMapping("/greeting")
    public String index1() {
        return obj.greeting();
    }
}
    