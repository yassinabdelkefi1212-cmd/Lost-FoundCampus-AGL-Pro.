package com.LostFound.models;

public class Annonce {
    private int id;
    private String titre;
    private String lieu;
    private String etat;

    public Annonce() {}

    public Annonce(int id, String titre, String lieu, String etat) {
        this.id = id;
        this.titre = titre;
        this.lieu = lieu;
        this.etat = etat;
    }

    public void afficherDetails() {
        System.out.println("Annonce : " + titre + " (" + etat + ") - " + lieu);
    }

    public String getTitre() { return titre; }
}
