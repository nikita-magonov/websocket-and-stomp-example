package ru.hse.software.design.websocketandstomp.example;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingMessage greeting(HelloMessage helloMessage) {
        return new GreetingMessage("Hello, " + helloMessage.getName() + "!");
    }
}
