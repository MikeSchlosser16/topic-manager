package com.mikeschlosser16.topicmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TopicManagerApplication {


    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

	public static void main(String[] args) {
		SpringApplication.run(TopicManagerApplication.class, args);
	}
}
