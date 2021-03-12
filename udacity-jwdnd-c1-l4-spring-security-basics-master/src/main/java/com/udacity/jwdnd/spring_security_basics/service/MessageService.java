package com.udacity.jwdnd.spring_security_basics.service;

import com.udacity.jwdnd.spring_security_basics.mapper.MessageMapper;
import com.udacity.jwdnd.spring_security_basics.model.ChatForm;
import com.udacity.jwdnd.spring_security_basics.model.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private MessageMapper mapper;

    public MessageService(MessageMapper mapper) {
        this.mapper = mapper;
    }


    public void addMessage(ChatForm chatForm) {
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chatForm.getUsername());
        switch (chatForm.getMessageType()) {
            case "Say":
                newMessage.setMessageText(chatForm.getMessageText());
                break;
            case "Shout":
                newMessage.setMessageText(chatForm.getMessageText().toUpperCase());
                break;
            case "Whisper":
                newMessage.setMessageText(chatForm.getMessageText().toLowerCase());
                break;
        }
        mapper.addMessage(newMessage);
    }

    public List<ChatMessage> getChatMessages() {
        return mapper.getAllMessages();
    }
}
