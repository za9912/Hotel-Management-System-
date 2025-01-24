package Pj;

import java.util.Date;


public class PetitDejeuner implements Consommation {
  
    
    private Date date;
    
    private Type t;

    // Constructeur
    public PetitDejeuner(Type t, Date date) {
    	
        this.date = date;
        this. t=t;
    }

    // Getter et Setter pour la catégorie
    
    
    // Getter et Setter pour le prix
   /* public double getPrix() {
        return prix;
    }*/

    
    // Getter et Setter pour la date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("La date du petit déjeuner ne peut pas être nulle.");
        }
        this.date = date;
    }
    public void setT(Type t) {
        if (t == null) {
            throw new IllegalArgumentException("La catégorie du petit déjeuner ne peut pas être nulle.");
        }
        this.t = t;
    }
  
    public double calculerPrix() {
        // Example: Calculate initial price based on the type of petit déjeuner
        switch (this.t) {
            case A:
                return 15.0; 
            case B:
                return 10.0; 
            case C:
                return 12.0; 
            default:
                return 10.0; 
        }
    }
   
    
    

  
    public String toString() {
        return "PetitDejeuner{" +
                ", date=" + date +
                '}';
    }
}

