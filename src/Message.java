package src;

import java.time.LocalDateTime;

public class Message {
    private String expediteur;
    private String destinataire;
    private String contenu;
    private LocalDateTime dateEnvoi;

    public Message(String expediteur, String destinataire, String contenu) {
        this.expediteur = expediteur;
        this.destinataire = destinataire;
        this.contenu = contenu;
        this.dateEnvoi = LocalDateTime.now();
    }

    // Correction humaine : Empêcher l'envoi de messages vides
    public boolean envoyer() {
        if (this.contenu != null && !this.contenu.trim().isEmpty()) {
            System.out.println("Message envoyé de " + expediteur);
            return true;
        }
        return false;
    }
}
