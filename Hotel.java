package Pj;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.*;
public class Hotel {

	private  int reservationCounter = 0;
	private String nom;
	private Categorie cat;
	private Date duree;
	private Adresse adress;
	private List<Client> clients;
	private Reservation derniereReservation;
	private List<Chambre> chambres;
	private List<Reservation> reservation;
	
	public Hotel(String nom, Categorie cat, Date duree, Adresse adresse,/* List<Reservation> reservation,*/List<Chambre> chambres) {
	    this.nom = nom;
	    this.cat = cat;
	    this.duree = duree;
	    this.adress = adresse;
	    this.clients = new ArrayList<>();
	    this.chambres = chambres;
	    this.reservation = new ArrayList<>(); // Initialize the reservation list
	}
    
	public String getNom() {
        return nom;
    }

	public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'hôtel ne peut pas être vide.");
        }
        this.nom = nom;
    }
    public void AfficherClient() {
    	for (Client C:clients) {
    		C.afficherInformations();
    	}
    }

    public Categorie getCat() {
        return cat;
    }

    public void setCat(Categorie cat) {
        if (cat == null) {
            throw new IllegalArgumentException("La catégorie de l'hôtel ne peut pas être nulle.");
        }
        this.cat = cat;
    }
    public Date getDuree() {
        return duree;
    }
    public void setDuree(Date duree) {
        if (duree == null) {
            throw new IllegalArgumentException("La durée de l'hôtel ne peut pas être nulle.");
        }
        this.duree = duree;
    }
    public Adresse getAdresse() {
        return adress;
    }
    public void setAdresse(Adresse adresse) {
        if (adresse == null) {
            throw new IllegalArgumentException("L'adresse de l'hôtel ne peut pas être nulle.");
        }
        this.adress = adresse;
    }
    public List<Chambre> getChambres() {
        return chambres;
    }    
    public void setChambres(List<Chambre> chambres) {
        if (chambres == null) {
            throw new IllegalArgumentException("La liste des chambres ne peut pas être nulle.");
        }
        this.chambres = chambres;
    }
    public List<Reservation> getReservation() {
        return reservation;
    }
    public void setReservation(List<Reservation> reservation) {
        if (reservation == null) {
            throw new IllegalArgumentException("La liste des réservations ne peut pas être nulle.");
        }
        this.reservation = reservation;
    }
    public Reservation getDerniereReservation() {
        return derniereReservation;
    }
    
    
    
    	public boolean ChambreDispo(Chambre c,Date debut,Date fin) {
    	for (Reservation Res : reservation) {
    		List<Chambre> l=Res.getChambres();
    		for (Chambre ch : l) {
    			if (ch.getNumero()==c.getNumero())
    				if (dateEntre(debut,Res.getPeriodeDebut(),Res.getPeriodeFin()) || dateEntre(fin,Res.getPeriodeDebut(),Res.getPeriodeFin())) 
    				return false;
    		}
    	}
    	return true;
    }
    
    	public void ajouterClient(Client client) {
        clients.add(client);
    }
    
		public static boolean dateEntre(Date d,Date debut,Date fin) {
		if (d.compareTo(debut)>=0 && d.compareTo(fin)<=0)
			return true;
		return false;
	}
    
    	public void ajouterchambre(Chambre ch) {
    
        	   chambres.add(ch);
}
        
    	public Client chercherClient(String nom,String prenom) {
        for (Client c: clients)
        	if (c.getNom().equals(nom) && c.getPrenom().equals(prenom))
        		return c;
        	return null;
        }
        
    	public Chambre chercherChambre(int num) {
    	for (Chambre c: chambres)
        		if (c.getNumero()==num)
        			return c;
        	return null;
        }

    	public Client chercherClientParNomPrenom(String nom, String prenom) {
            for (Client client : clients) {
                if (client.getNom().equalsIgnoreCase(nom) && client.getPrenom().equalsIgnoreCase(prenom)) {
                    return client;
                }
            }
            return null; // Aucun client trouvé avec le nom et le prénom fournis
        }
          	
        public void ajouterReservation(Reservation nouvelleReservation) {
            reservation.add(nouvelleReservation);
        }
        
        public void afficherChambres() {
            System.out.println("Liste des chambres :");
            if (chambres != null) 
                for (Chambre chambre : chambres) 
                    System.out.println(chambre); 
         }
        
        public void afficherChambresdispo(Date debut,Date fin) {
            System.out.println("Liste des chambres :"); 
            for (Chambre chambre : chambres)
            	if (ChambreDispo(chambre,debut,fin))
                   System.out.println(chambre); 
         }
             
        public void reserverChambre(Hotel hotel,Client client, Date dateDebut, Date dateFin, List<Chambre> chambresAReserver) {
            
                Reservation nouvelleReservation = new Reservation(hotel,client, dateDebut, dateFin, chambresAReserver);
                ajouterReservation(nouvelleReservation);

                System.out.println("Réservation effectuée avec succès !");
                
            
        }
        public int getAndIncrementReservationCounter() {
            return reservationCounter++;
        }

        public void afficherReservations() {
            if (reservation.isEmpty()) {
                System.out.println("Aucune réservation disponible.");
            } else {
                System.out.println("Liste des réservations :");
                for (Reservation res : reservation) {
                    res.afficherDetails();
                    System.out.println();
                    
                    
                    
                    // Ajoute une ligne vide entre les réservations
                }
            }
        }
       
}