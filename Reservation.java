package Pj;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Reservation {
	private static int numeroCounter = 0;
    private  int numero;
  
    private Client client;
    private Date periodeDebut;
    private Date periodeFin;
    private List<Chambre> chambres;
   

    public Reservation(Hotel hotel,Client c, Date periodeDebut, Date periodeFin, List<Chambre> chambres) {
        if (c == null) {
            throw new IllegalArgumentException("Le client de la réservation ne peut pas être nul.");
        }
        if (periodeDebut == null || periodeFin == null) {
            throw new IllegalArgumentException("Les dates de début et de fin de la réservation ne peuvent pas être nulles.");
        }
        if (periodeFin.before(periodeDebut)) {
            throw new IllegalArgumentException("La date de fin ne peut pas être antérieure à la date de début.");
        }
        if (chambres == null || chambres.isEmpty()) {
            throw new IllegalArgumentException("La liste des chambres de la réservation ne peut pas être nulle ou vide.");
        }

        this.numero = hotel.getAndIncrementReservationCounter();;
        this.client = c;
        this.periodeDebut = periodeDebut;
        this.periodeFin = periodeFin;
        this.chambres = chambres;
    }
    

    public int getNumero() {
        return numero;
    }

    

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        if (chambres == null || chambres.isEmpty()) {
            throw new IllegalArgumentException("La liste des chambres de la réservation ne peut pas être nulle ou vide.");
        }
        this.chambres = chambres;
    }

    public Date getPeriodeDebut() {
        return periodeDebut;
    }

    public Date getPeriodeFin() {
        return periodeFin;
    }

    public void setPeriodeDebut(Date periodeDebut) {
        if (periodeDebut == null) {
            throw new IllegalArgumentException("La date de début de la réservation ne peut pas être nulle.");
        }
        this.periodeDebut = periodeDebut;
    }


    public void setPeriodeFin(Date periodeFin) {
        if (periodeFin == null) {
            throw new IllegalArgumentException("La date de fin de la réservation ne peut pas être nulle.");
        }
        if (periodeFin.before(periodeDebut)) {
            throw new IllegalArgumentException("La date de fin ne peut pas être antérieure à la date de début.");
        }
        this.periodeFin = periodeFin;
    }
    public Client getclient() {
    	return client;}
    public void setClient(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Le client de la réservation ne peut pas être nul.");
        }
        this.client = client;
    }

    public void afficherDetails() {
        System.out.println("Réservation n°" + numero);
        System.out.println("Période de séjour: du " + periodeDebut + " au " + periodeFin);
        System.out.println("Chambres réservées:");
        System.out.println(chambres.size());
        for (Chambre chambre : chambres) {
            System.out.println(chambre.toString());
        }

        
    }

}
