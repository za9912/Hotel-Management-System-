package Pj;

import java.util.Date;

public class Communications implements Consommation {
	private String type;
    private boolean forfaitaire;
    private Date date;
    private double tarifParHeure;
    private Heure h;

   
    public Communications(Heure type, boolean forfaitaire, Date date) {
        if (type == null) {
            throw new IllegalArgumentException("Le type de service ne peut pas être nul.");
        }
        this.h = type;
        this.forfaitaire = forfaitaire;
        this.date = date;
    }

    
    public String getType() {
        return type;
    }

    public void setType(Heure type) {
        if (type == null) {
            throw new IllegalArgumentException("Le type de service ne peut pas être nul.");
        }
        this.h = type;
    }

   
    public boolean isForfaitaire() {
        return forfaitaire;
    }

    public void setForfaitaire(boolean forfaitaire) {
        this.forfaitaire = forfaitaire;
    }

   
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("La date du service ne peut pas être nulle.");
        }
        this.date = date;
    }
    public double calcule() {
        // Example: Calculate initial price based on the type of petit déjeuner
        switch (this.h) {
            case UNE:
                return 1.0; 
            case TROIS:
                return 2.0; 
            case CINQ:
                return 3.0; 
            default:
                return 0.0; 
        }
    }

    
    public double calculerPrix() {
    	Date debut = new Date(); 
       
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date fin = new Date(); 

                long dureeEnMillisecondes = fin.getTime() - debut.getTime();
        
        if (forfaitaire) {
           
            return 50.0; 
        } else {
      
            return ( dureeEnMillisecondes *  calcule()); 
        }
    }
    

   
    public String toString() {
        return "Service{" +
                "type='" + type + '\'' +
                ", forfaitaire=" + forfaitaire +
                ", date=" + date +
                '}';
    
    }	

}


