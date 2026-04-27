package src;

/**
 * Responsable : Kenza
 * Fonctionnalité : Authentification
 */
public class Utilisateur {
    private String nom;
    private String email;
    private String motDePasse;

    public Utilisateur(String nom, String email, String motDePasse) {
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    // Vérification spécifique au campus (Justification : Sécurité)
    public boolean validerEmail() {
        return this.email != null && this.email.toLowerCase().endsWith("@esprit.tn");
    }

    public String getNom() { return nom; }
}
