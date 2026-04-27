package src;

import java.time.LocalDate;

public class Annonce {
    private int id;
    private String titre;
    private String description;
    private String lieu;
    private String etat; // "Perdu" ou "Trouvé"

    public Annonce(int id, String titre, String description, String lieu, String etat) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.lieu = lieu;
        setEtat(etat); // Utilise le setter pour la validation
    }

    // Correction humaine : On restreint les choix pour éviter les erreurs
    public void setEtat(String nouvelEtat) {
        if (nouvelEtat.equalsIgnoreCase("Perdu") || nouvelEtat.equalsIgnoreCase("Trouvé")) {
            this.etat = nouvelEtat;
        } else {
            this.etat = "Inconnu";
        }
    }

    public String getTitre() { return titre; }
    public String getEtat() { return etat; }
}
