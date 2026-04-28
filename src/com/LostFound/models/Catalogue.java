package com.LostFound.models;
import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private List<Annonce> annonces;

    public Catalogue() {
        annonces = new ArrayList<>();
    }

    public void ajouterAnnonce(Annonce a) {
        annonces.add(a);
    }

    public void afficherAnnonces() {
        for (Annonce a : annonces) {
            a.afficherDetails();
        }
    
}}
    
 