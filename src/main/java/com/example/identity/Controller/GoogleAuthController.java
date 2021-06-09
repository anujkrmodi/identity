package com.example.identity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleAuthController {

    @GetMapping("/hello")
    public String helloworld() {
        return "Hello World";
    }

    @GetMapping("/restriction")
    public String restricted() {
        return "to see this text you need to be logged in!";
    }

    @GetMapping("/")
    public  String home() {
        return  ("<h1>Welcome User</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin() { return  ("<h1>Welcome Admin</h1>"); }
}
