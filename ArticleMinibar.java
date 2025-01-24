package Pj;

import java.util.Date;

public class ArticleMinibar implements Consommation {
    private String nom;
    private int quantite;
    private Date date;
    private Type t;

    public ArticleMinibar(Type t, int quantite, Date date) {
        this.nom = nom;
        this. t=t;
        this.quantite = quantite;
        this.date = date;
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    
    

    
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        if (quantite < 0) {
            throw new IllegalArgumentException("La quantité ne peut pas être négative.");
        }
        this.quantite = quantite;
    }

    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   
    public double calculerPrix() {
        // Example: Calculate initial price based on the type of petit déjeuner
        switch (this.t) {
            case A:
                return 15.0*quantite; 
            case B:
                return 10.0*quantite; 
            case C:
                return 12.0*quantite; 
            default:
                return 10.0*quantite; 
        }
    }

   
    public String toString() {
        return "ArticleMinibar{" +
                "nom='" + nom + '\'' +
                ", quantite=" + quantite +
                ", date=" + date +
                '}';
    }
}

