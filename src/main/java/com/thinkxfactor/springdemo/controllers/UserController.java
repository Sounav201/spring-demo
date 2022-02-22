package com.thinkxfactor.springdemo.controllers;
     
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.thinkxfactor.springdemo.entity.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController{
    int count = 0;
    @GetMapping("/count")
    public String counter(){
        count++;
        return "Count: " + count;

    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello there!";
    }


    // @GetMapping("/getUser")
    // public User getUser()
    // {
    //     User us1 = new User();
    //     us1.setName("Raj");
    //     us1.setDepartment("CSE");
    //     us1.setAge(25);
    //     return us1;
    // }
    
    @GetMapping("/getUsers")
    public List<User> getUsers(){

        List<User> users = new ArrayList<>();
        
        User us1 = new User();
        us1.setName("Raj");
        us1.setDepartment("CSE");
        us1.setAge(25);
        
        users.add(us1);
        User us2 = new User();
        us2.setName("Sounav");
        us2.setDepartment("CSE");
        us2.setAge(21);
        
        users.add(us2);
        

        return users;


    }


    //Get hold of the parameters passed at the endpoint
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name)
    {
        return "Hello " + name + "!!";
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam String name, @RequestParam String department, @RequestParam int age){

        User user = new User();
        user.setName(name);
        user.setDepartment(department);
        user.setAge(age);


        return user;

    }

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){

        user.setId(UUID.randomUUID().toString());


        
        return user;
    
    }


}