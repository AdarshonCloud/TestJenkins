package com.testjenkins;

import com.testjenkins.Greeting;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class HelloService {

    public Greeting getDetailedGreeting(String name) {
        // Generate the greeting message
        String message = "Hello, " + name + "!\n" +
                         "Welcome to our simple Spring Boot application.";
                         
        // Manually instantiate the Greeting class and pass the message
        return new Greeting(message);
    }
}
