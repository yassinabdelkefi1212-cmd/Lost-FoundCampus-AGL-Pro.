package com.LostFound.models;

public class Message {
    private String contenu;

    public Message() {}

    public Message(String contenu) {
        this.contenu = contenu;
    }

    public void envoyer() {
        System.out.println("Message envoyé : " + contenu);
    }
    
}
