package src;

public class Admin {
    private String pseudo;
    private String role; // ex: "MODERATEUR" ou "SUPER_ADMIN"

    public Admin(String pseudo, String role) {
        this.pseudo = pseudo;
        this.role = role;
    }

    // Correction humaine : Seul le SUPER_ADMIN peut supprimer définitivement
    public boolean peutSupprimer() {
        return "SUPER_ADMIN".equals(this.role);
    }

    public void supprimerAnnonce(Annonce a) {
        if (peutSupprimer()) {
            System.out.println("Annonce '" + a.getTitre() + "' supprimée par l'admin.");
        } else {
            System.out.println("Action refusée : Droits insuffisants.");
        }
    }
}
