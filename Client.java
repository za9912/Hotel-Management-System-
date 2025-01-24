package Pj;
import java.util.List;
import java.util.Date;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Client {
    private static int nextClientId = 1;

    private int clientId;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private List<Reservation> reservations;
    private List<Consommation> consommation;

    public Client(String nom, String prenom, Adresse adresse) {
        this.clientId = nextClientId++;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.reservations= new ArrayList<>();
        this.consommation= new ArrayList<>();
         
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du client ne peut pas être vide.");
        }
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if (prenom == null || prenom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le prénom du client ne peut pas être vide.");
        }
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        if (adresse == null) {
            throw new IllegalArgumentException("L'adresse du client ne peut pas être null.");
        }
        this.adresse = adresse;
    }
    public List<Reservation> getReservation() {
        return reservations;
    }
    public void setReservations(List<Reservation> reservations) {
        if (reservations == null) {
            throw new IllegalArgumentException("La liste des réservations ne peut pas être null.");
        }
        this.reservations = reservations;
    }

    
    public void setConsommation(List<Consommation> consommation) {
        if (consommation == null) {
            throw new IllegalArgumentException("La liste des consommations ne peut pas être null.");
        }
        this.consommation = consommation;
    }
    public List<Consommation> getConsommation() {
        return consommation;
    }
    public void ajouterConsommation(Consommation consommation) {
        if (consommation != null) {
            consommation.setDate(new Date());
            this.consommation.add(consommation);
        }
    }
    

    


    public void afficherInformations() {
        System.out.println("Client ID: " + clientId);
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Adresse: " + adresse);
    }
    

        // Méthode pour obtenir les consommations d'un client
        public List<Consommation> getConsommations() {
            List<Consommation> allConsommations = new ArrayList<>();
            for (Reservation reservation : reservations) {
                allConsommations.addAll(reservation.getclient().getConsommation());
            }
            return allConsommations;
        }

        // Méthode pour obtenir la facture d'un client
        /*public Facture getFacture() {
            List<Consommation> allConsommations = getConsommations();
            Facture facture = new Facture( new Date(), allConsommations, this);
            return facture;
        }*/

        // Méthode pour afficher les consommations et la facture d'un client
       /* public void afficherConsommationsEtFacture() {
            List<Consommation> consommations = getConsommations();
            Facture facture = getFacture();

            System.out.println("Consommations du client:");
            for (Consommation consommation : consommations) {
                System.out.println("Prix: " + consommation.calculerPrix() + ", Date: " + consommation.getDate());
            }

            System.out.println("Montant total de la facture: " + facture.calculerMontantTotal());
        }*/
    }


