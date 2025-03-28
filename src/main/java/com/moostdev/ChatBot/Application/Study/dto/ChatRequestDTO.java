package com.moostdev.ChatBot.Application.Study.dto;

import java.util.List;

public class ChatRequestDTO {
    private String model;
    private List<Message> messages;
    private double temperature;

    // No-args constructor
    public ChatRequestDTO() {}

    // Full constructor
    public ChatRequestDTO(String model, List<Message> messages, double temperature) {
        this.model = model;
        this.messages = messages;
        this.temperature = temperature;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public double getTemperature() {
        return temperature;
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Nested Message class
    public static class Message {
        private String role;
        private String content;

        // No-args constructor
        public Message() {}

        // Full constructor
        public Message(String role, String content) {
            this.role = role;
            this.content = content;
        }

        // Getters
        public String getRole() {
            return role;
        }

        public String getContent() {
            return content;
        }

        // Setters
        public void setRole(String role) {
            this.role = role;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}