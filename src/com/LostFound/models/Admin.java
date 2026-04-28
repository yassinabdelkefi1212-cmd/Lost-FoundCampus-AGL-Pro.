package com.LostFound.models;

public class Admin {
    private String pseudo;
    private String role;

    public Admin() {}

    public Admin(String pseudo, String role) {
        this.pseudo = pseudo;
        this.role = role;
    }

    public void afficherStats() {
        System.out.println("Nombre d'utilisateurs : 3");
        System.out.println("Nombre d'annonces : 2");
    }
    
}
