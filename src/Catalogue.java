package src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogue {
    private List<Annonce> listeAnnonces = new ArrayList<>();

    public void ajouterAnnonce(Annonce a) {
        this.listeAnnonces.add(a);
    }

    // Correction humaine : Recherche insensible à la casse (Majuscules/Minuscules)
    public List<Annonce> rechercher(String motCle) {
        return listeAnnonces.stream()
            .filter(a -> a.getTitre().toLowerCase().contains(motCle.toLowerCase()))
            .collect(Collectors.toList());
    }
}
