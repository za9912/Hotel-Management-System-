package Pj;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Chambre {
    private int numero;
    private int etage;
    private int litsUnePersonne;
    private int litsDeuxPersonnes;
    //private Categorie categorie;
    private Equipement e;
   
    private double prix;
    /*private List<Reservation> reservation;*/


    public Chambre(int numero, int etage, int litsUnePersonne, int litsDeuxPersonnes,  Equipement e)
            throws IllegalArgumentException {
        if (numero <= 0 || etage <= 0 || litsUnePersonne < 0 || litsDeuxPersonnes < 0 || prix < 0 ) {
            throw new IllegalArgumentException("Les paramètres de chambre ne peuvent pas être nuls ou invalides.");
        }

        this.numero = numero;
        this.etage = etage;
        this.litsUnePersonne = litsUnePersonne;
        this.litsDeuxPersonnes = litsDeuxPersonnes;
       // this.categorie = categorie;
        this.e=e;
        /*this.reservation = new ArrayList<>();*/
        this.prix = calculerPrix();
    }

    public int getNumero() {
        return numero;
    }

    public int getEtage() {
        return etage;
    }
    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Le numéro de chambre doit être supérieur à zéro.");
        }
        this.numero = numero;
    }
    public int getLitsUnePersonne() {
        return litsUnePersonne;
    }

    public int getLitsDeuxPersonnes() {
        return litsDeuxPersonnes;
    }
    public void setLitsUnePersonne(int litsUnePersonne) {
        if (litsUnePersonne < 0) {
            throw new IllegalArgumentException("Le nombre de lits pour une personne ne peut pas être négatif.");
        }
        this.litsUnePersonne = litsUnePersonne;
    }
    public void setLitsDeuxPersonnes(int litsDeuxPersonnes) {
        if (litsDeuxPersonnes < 0) {
            throw new IllegalArgumentException("Le nombre de lits pour deux personnes ne peut pas être négatif.");
        }
        this.litsDeuxPersonnes = litsDeuxPersonnes;
    }
/*    public void setCategorie(Categorie categorie) {
        if (categorie == null) {
            throw new IllegalArgumentException("La catégorie de chambre ne peut pas être null.");
        }
        this.categorie = categorie;
    }

    public Categorie getCategorie() {
        return categorie;
    }*/
   
    public void setEtage(int etage) {
        if (etage <= 0) {
            throw new IllegalArgumentException("L'étage de la chambre doit être supérieur à zéro.");
        }
        this.etage = etage;
    }
    public void setPrix(double prix) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix de la chambre ne peut pas être négatif.");
        }
        this.prix = prix;
    }

   
  
    
    
    public double calculerPrix() {
        double prix=100.000;
        switch (this.e) {
            case climatiseur:
                return prix+15.000; 
            case televiseur:
                return prix+10.0;
            case douche:
                return prix+20.0; 
            case bain:
                return prix+30.0;
            
            default:
                return prix; 
        }}
    public String toString() {
        return "Chambre{" +
                "numero=" + numero +
                ", etage=" + etage +
                ", litsUnePersonne=" + litsUnePersonne +
                ", litsDeuxPersonnes=" + litsDeuxPersonnes +
                ", equipement=" + e +
                ", prix=" + calculerPrix() ;
                }
                /*, reservation=" + reservation +*/
                
    	
    }




