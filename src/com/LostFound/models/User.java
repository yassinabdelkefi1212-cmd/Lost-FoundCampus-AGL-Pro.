package com.LostFound.models;

public class User {

    private String nom;
    private String email;
    private String motDePasse;

    public User() {}

    public User(String nom, String email, String motDePasse) {
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public boolean seConnecter() {
        System.out.println("Connexion réussie !");
        return true;
    }

    public String getNom() { return nom; }
    public String getEmail() { return email; }
}
