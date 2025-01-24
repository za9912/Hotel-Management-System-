package Pj;
import java.util.List;

public class Categorie {
    private String nom;
    private String equipement; // bain, douche, téléviseur, etc.
    private double prixBase;
    private Type type;

    public Categorie(String nom,Type type, String equipement, double prixBase) {
        this.nom = nom;
        this.equipement = equipement;
        this.prixBase = prixBase;
        this.type=type;;    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de la catégorie ne peut pas être vide.");
        }
        this.nom = nom;
    }

    public String getEquipement() {
        return equipement;
    }

    public void setEquipement(String equipement) {
        if (equipement == null || equipement.trim().isEmpty()) {
            throw new IllegalArgumentException("L'équipement ne peut pas être vide.");
        }
        this.equipement = equipement;
    }

    public double getPrixBase() {
        return prixBase;
    }

    public void setPrixBase(double prixBase) {
        if (prixBase < 0) {
            throw new IllegalArgumentException("Le prix de base ne peut pas être négatif.");
        }
        this.prixBase = prixBase;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (type == null) {
            throw new IllegalArgumentException("Le type de catégorie ne peut pas être null.");
        }
        this.type = type;
    }

    

    @Override
    public String toString() {
        return "Categorie{" +
                "nom='" + nom + '\'' +
                ", equipement='" + equipement + '\'' +
                ", prixBase=" + prixBase +
                '}';
    }
}
