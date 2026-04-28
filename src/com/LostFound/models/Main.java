package com.LostFound.models;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Lost & Found Campus — Sprint 1 ===");

        // AUTH
        System.out.println("--- Authentification (Kenza) ---");
        User u = new User("Kenza", "kenza@esprit.tn", "1234");
        System.out.println("Utilisateur créé : " + u.getNom() + " (" + u.getEmail() + ")");
        u.seConnecter();

        // ANNONCE
        System.out.println("--- Déclaration Objet (Nour) ---");
        Annonce a = new Annonce(1, "Clé perdue", "Bibliothèque", "Perdu");
        a.afficherDetails();

        // CATALOGUE
        System.out.println("--- Consultation (Aziz) ---");
        Catalogue c = new Catalogue();
        c.ajouterAnnonce(a);
        c.afficherAnnonces();

        // MESSAGE
        System.out.println("--- Messagerie (Ahmed) ---");
        Message m = new Message("J'ai trouvé votre clé !");
        m.envoyer();

        // ADMIN
        System.out.println("--- Administration (Yassin) ---");
        Admin admin = new Admin("admin1", "SUPER_ADMIN");
        admin.afficherStats();
    }
}
