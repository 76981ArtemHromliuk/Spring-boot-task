package com.example.demo;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> helloJson() {

        Map<String, Object> response = new HashMap<>();

        response.put("message", "Hello Spring Boot");
        response.put("name", "Artem");
        response.put("indexes", List.of(76981));

        return response;
    }


}
}