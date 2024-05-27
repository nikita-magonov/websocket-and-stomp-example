package ru.hse.software.design.websocketandstomp.example;

public class GreetingMessage {

    public GreetingMessage() {
    }

    public GreetingMessage(String content) {
        this.content = content;
    }

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
