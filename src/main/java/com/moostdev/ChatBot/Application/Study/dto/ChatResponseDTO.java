package com.moostdev.ChatBot.Application.Study.dto;

import java.util.List;

public class ChatResponseDTO {
    private List<Choice> choices;

    // Getter
    public List<Choice> getChoices() {
        return choices;
    }

    // Setter
    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    // Nested Choice class
    public static class Choice {
        private Message message;

        // Getter
        public Message getMessage() {
            return message;
        }

        // Setter
        public void setMessage(Message message) {
            this.message = message;
        }

        // Nested Message class
        public static class Message {
            private String content;

            // Getter
            public String getContent() {
                return content;
            }

            // Setter
            public void setContent(String content) {
                this.content = content;
            }
        }
    }
}