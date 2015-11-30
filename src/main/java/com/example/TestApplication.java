package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ComponentScan("com.example")
@EnableAutoConfiguration
@Controller
public class TestApplication {
	
	@Autowired
	 teste2 teste2;
	
	@ResponseBody
	@RequestMapping("/test")
	String entry(){
		
		return teste2.msg();	
	}

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
