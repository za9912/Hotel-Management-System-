package Pj;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Tester {
	private static void validateAdresseWeb(String adresseWeb) {
	    if (adresseWeb == null || !adresseWeb.matches("^.+@.+\\.com$")) {
	        throw new IllegalArgumentException("L'adresse web doit contenir '@' et se terminer par '.com'.");
	    }}
	private static void validateNumeroTelephone(String numeroTelephone) {
        if (numeroTelephone == null || !numeroTelephone.matches("^\\d{8}$")) {
            throw new IllegalArgumentException("Le numéro de téléphone doit être composé de 8 chiffres.");
        }
    }
	private static void validateNomPrenom(String value) {
        if (value == null || value.trim().isEmpty() || !value.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("Le nom ou le prénom ne peut contenir que des lettres alphabétiques.");
        }
    }

	 private static Date parseDate(String dateStr) {
	        try {
	            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	            return dateFormat.parse(dateStr);
	        } catch (ParseException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	/*public static void main(String[] args) */public static void a(){
	Scanner scanner = new Scanner(System.in);
	 //Création de catégories
	Categorie categorieStandard = new Categorie("Standard", Type.A, "Equipments", 50.0);
    Categorie categorieLuxe = new Categorie("Luxe", Type.B, "Equipments", 100.0);
/********************hotel***************************/
    // Création de chambres
    Chambre chambre1 = new Chambre(101, 1, 2, 1,  Equipement.climatiseur);
    Chambre chambre2 = new Chambre(102, 1, 2, 1,  Equipement.bain);
    Chambre chambre3 = new Chambre(201, 2, 1, 1,  Equipement.douche);

    // Création de la liste de chambres
    List<Chambre> chambres = new ArrayList<>();
    chambres.add(chambre1);
    chambres.add(chambre2);
    chambres.add(chambre3);

    // Création d'un client
    Client client = new Client("John", "Doe", new Adresse("123 Main St", 1, "City", "12345", "State", "Country", "123-456-7890", "john@example.com", "www.example.com"));

    // Création de réservations
    Date dateDebut1 = new Date(); // Utilisez la date appropriée
    Date dateFin1 = new Date();   // Utilisez la date appropriée
    Date dateDebut2 = new Date(); // Utilisez la date appropriée
    Date dateFin2 = new Date();   // Utilisez la date appropriée

    // Liste des chambres pour chaque réservation
    List<Chambre> chambresReservation1 = new ArrayList<>();
    chambresReservation1.add(chambre1);
    chambresReservation1.add(chambre2);

    List<Chambre> chambresReservation2 = new ArrayList<>();
    chambresReservation2.add(chambre3);
    
    List<Chambre> rooms = new ArrayList<>();

    try {
        rooms.add(new Chambre(101, 1, 1, 0,  Equipement.bain));
        rooms.add(new Chambre(102, 2, 0, 1, Equipement.climatiseur));
        rooms.add(new Chambre(201, 3, 2, 1,  Equipement.televiseur));
        rooms.add(new Chambre(202, 3, 2, 1,  Equipement.bain));
        rooms.add(new Chambre(301, 3, 2, 1, Equipement.climatiseur));
        rooms.add(new Chambre(302, 3, 2, 1,Equipement.bain));
    } catch (IllegalArgumentException e) {
        System.out.println("Error creating room: " + e.getMessage());
    }
        
    Reservation reservation1 = new Reservation( client, dateDebut1, dateFin1, chambresReservation1);
    Reservation reservation2 = new Reservation( client, dateDebut2, dateFin2, chambresReservation2);
    /*List<Reservation> res = new ArrayList<>();*/
    Adresse companyAddress = new Adresse(
            "Main Street", 123, "Cityville", "12345",
            "State", "Country", "123-456-7890",
            "info@company.com", "www.company.com"
        );
    Hotel hotel = new Hotel("HotelName",categorieStandard , new Date(), companyAddress,rooms);

    hotel.ajouterReservation(reservation1);
    
    hotel.ajouterReservation(reservation2);
   
    hotel.ajouterClient(client);
    
    
    
    Consommation consommationA = new PetitDejeuner(Type.A, new Date());
    Consommation consommationB = new PetitDejeuner(Type.B, new Date());
    client.ajouterConsommation(consommationA);
    client.ajouterConsommation(consommationB);
    List<Consommation> com = new ArrayList<>();
    com.add(consommationA);
    com.add(consommationB);
    

    
    
    /********************Mrahaba******************************/
    Adresse Address = new Adresse(
    	    "Sunset Boulevard", 456, "Metropolis", "67890",
    	    "California", "United States", "987-654-3210",
    	    "contact@company.com", "www.company-website.com"
    	);
    
    
    
    List<Chambre> room = new ArrayList<>();
    try {
        room.add(new Chambre(1, 1, 1, 0,  Equipement.bain));
        room.add(new Chambre(2, 2, 0, 1, Equipement.climatiseur));
        room.add(new Chambre(3, 3, 2, 1,  Equipement.televiseur));
        room.add(new Chambre(4, 3, 2, 1,  Equipement.bain));
        room.add(new Chambre(5, 3, 2, 1, Equipement.climatiseur));
        room.add(new Chambre(6, 3, 2, 1,Equipement.bain));
    } catch (IllegalArgumentException e) {
        System.out.println("Error creating room: " + e.getMessage());
    }
    Client client2 = new Client("Alice", "Smith", new Adresse("456 Oak St", 2, "Town", "56789", "Province", "Country", "987-654-3210", "alice@example.com", "www.alice.com"));
    Chambre chambre4 = new Chambre(3, 3, 1, 1, Equipement.televiseur);
    Chambre chambre5 = new Chambre(6, 3, 2, 1, Equipement.bain);
    chambres.add(chambre4);
    chambres.add(chambre5);
    
    Date dateDebut3 = new Date(); // Utilisez la date appropriée
    Date dateFin3 = new Date();   // Utilisez la date appropriée

    List<Chambre> chambresReservation3 = new ArrayList<>();
    chambresReservation3.add(chambre4);

    Reservation reservationp = new Reservation(client, dateDebut1, dateFin1, chambresReservation1);
    Reservation reservationc = new Reservation(client2, dateDebut2, dateFin2, chambresReservation2);
    Reservation reservationo = new Reservation(client, dateDebut3, dateFin3, chambresReservation3);

    
    Hotel Marhaba = new Hotel("Marhaba",categorieLuxe , new Date(), Address,room);
    
Marhaba.ajouterReservation(reservationp);
    
    Marhaba.ajouterReservation(reservationo);
   
    Marhaba.ajouterClient(client2);
    
    
    
    Consommation consommationAA = new PetitDejeuner(Type.A, new Date());
    Consommation consommationBB = new PetitDejeuner(Type.B, new Date());
    client.ajouterConsommation(consommationAA);
    client.ajouterConsommation(consommationBB);
    List<Consommation> comm = new ArrayList<>();
    comm.add(consommationAA);
    comm.add(consommationBB);
    /********************organisme*********/
    List<Hotel>h=new ArrayList<>();
    h.add(hotel);
    h.add(Marhaba);
    
    
    Organisme organisme = new Organisme("France",h);
    
    
    
    
   
    GestionHotel gestionHotel = new GestionHotel();
   
    while (true) {
        System.out.println("Menu Principal:");
        System.out.println("1. Effectuer une réservation");
        System.out.println("2. Afficher les réservations");
        System.out.println("3. Effectuer des consommations");
        System.out.println("4. Calculer la consommation et la facture");
        System.out.println("0. Quitter");
        
        
        int choix = scanner.nextInt();
        scanner.nextLine(); 

        switch (choix) {
            case 1:
                
                 // Saisie des coordonnées du client
                 System.out.println("Entrez le nom du client : ");
                 String nom = scanner.nextLine();
                 validateNomPrenom(nom);

                 System.out.println("Entrez le prénom du client : ");
                 String prenom = scanner.nextLine();
                 validateNomPrenom(nom);

                 // Saisie de l'adresse du client
                 System.out.println("Entrez l'adresse du client : ");
                 System.out.println("Numéro de rue : ");
                 int numeroRue = scanner.nextInt();
                 scanner.nextLine(); // Consommez la nouvelle ligne restante
                 System.out.println("Nom de rue : ");
                 String nomRue = scanner.nextLine();
                 System.out.println("Code postal : ");
                 String codePostal = scanner.nextLine();
                 System.out.println("Ville : ");
                 String ville = scanner.nextLine();                 
                 

                 System.out.println("Numéro d'immeuble : ");
                 int numeroImmeuble = scanner.nextInt();
                 scanner.nextLine();
                 System.out.println("Nom de commune : ");
                 String nomCommune = scanner.nextLine();

                 System.out.println("Département ou État : ");
                 String departementOuEtat = scanner.nextLine();

                 System.out.println("Pays : ");
                 String pays = scanner.nextLine();

                 System.out.println("Numéro de téléphone : ");
                 String numeroTelephone = scanner.nextLine();
                 validateNumeroTelephone(numeroTelephone);

                 System.out.println("Adresse courriel : ");
                 String adresseCourriel = scanner.nextLine();

                 System.out.println("Adresse web : ");
                 String adresseWeb = scanner.nextLine();
                 
                 validateAdresseWeb(adresseWeb);
                 Adresse adresseClient = new Adresse(nomRue, numeroImmeuble, nomCommune, codePostal,
                                                    departementOuEtat, pays, numeroTelephone,
                                                    adresseCourriel, adresseWeb);

                 // Création d'un client avec les informations saisies
                 Client c = new Client(nom, prenom, adresseClient);
                 c.afficherInformations();
                /* System.out.println("Entrez le numéro de réservation : ");
                 int numeroReservation = scanner.nextInt();
                 scanner.nextLine();*/ // Consommez la nouvelle ligne restante

                 System.out.println("Entrez la date de début de la réservation (format dd/MM/yyyy) : ");
                 String dateDebutStr = scanner.nextLine();
                 Date dateDebut = parseDate(dateDebutStr);

                 System.out.println("Entrez la date de fin de la réservation (format dd/MM/yyyy) : ");
                 String dateFinStr = scanner.nextLine();
                 Date dateFin = parseDate(dateFinStr);
                 if (dateDebut.after(dateFin)) {
                	    throw new IllegalArgumentException("La date de début doit être antérieure ou égale à la date de fin.");
                	}
                 

                 // Saisie des informations de chambre
                 /*GestionHotel gestionHotel = new GestionHotel();*/
                 
                 List<Chambre> chambress = gestionHotel.saisirChambres(hotel,dateDebut,dateFin);
               /* Reservation reservation= new Reservation(c,dateDebut,dateFin,chambress);*/
                 hotel.reserverChambre(c,dateDebut,dateFin,chambress);
                 
                 
                 System.out.println("***************");
                 List<Reservation> L1= hotel.getReservation();
                 for (Reservation Res : L1)
                	 Res.afficherDetails();
                 System.out.println("***************");

                 
                 hotel.ajouterClient(c);
                 //hotel.AfficherClient();
                 
                 break;
            case 2:
                // Logique pour afficher les réservations
            	
            	System.out.println("Afficher les réservations");
            	//client.afficherConsommationsEtFacture();
        
                hotel.afficherReservations();
                break;
            case 3:
            	boolean back = false;

                while (!back) {
            		 System.out.println("1. Type consommation: PetitDejeuner");
            		 System.out.println("2. Type consommation: Minibar");
            		 System.out.println("3. Type consommation:services téléphoniques");
            		 System.out.println("4. Type consommation: autre service");
            		 System.out.println("0. Retourner");
            		 
            	int choix1 = scanner.nextInt();
            	scanner.nextLine(); 

            	switch (choix1) {
                case 1:
                    Consommation consommation1 = Saisie.saisirPetitDejeuner();
                    System.out.println("Entrez le nom du client : ");
                    String nom1 = scanner.nextLine();

                    System.out.println("Entrez le prénom du client : ");
                    String prenom1 = scanner.nextLine();

                    Client c1 = hotel.chercherClient(nom1, prenom1);
                    
                    if (c1 != null) {
                        c1.getConsommation().add(consommation1);
                    } 
                    else {
                        System.out.println("Vous n'êtes pas réservé, monsieur.");
                    }
                    //back=true;
                    break;
                    
                case 2:
                    Consommation consommation2 = Saisie.saisirArticleMinibar();

                    System.out.println("Entrez le nom du client : ");
                    String nom2 = scanner.nextLine();

                    System.out.println("Entrez le prénom du client : ");
                    String prenom2 = scanner.nextLine();

                    Client c2 = hotel.chercherClient(nom2, prenom2);
                    if (c2 != null) {
                        c2.getConsommation().add(consommation2);
                    } else {
                        System.out.println("Vous n'êtes pas réservé, monsieur.");
                    }
                    break;

                case 3:
                    Consommation consommation3 = Saisie.saisirService();

                    System.out.println("Entrez le nom du client : ");
                    String nom3 = scanner.nextLine();

                    System.out.println("Entrez le prénom du client : ");
                    String prenom3 = scanner.nextLine();

                    Client c3 = hotel.chercherClient(nom3, prenom3);
                    if (c3 != null) {
                        c3.getConsommation().add(consommation3);
                    } else {
                        System.out.println("Vous n'êtes pas réservé, monsieur.");
                    }
                    break;
                case 4:
                	 Consommation consommation4 = Saisie.saisirServicedefoulement();

                     System.out.println("Entrez le nom du client : ");
                     String nom4 = scanner.nextLine();

                     System.out.println("Entrez le prénom du client : ");
                     String prenom4 = scanner.nextLine();

                     Client c4 = hotel.chercherClient(nom4, prenom4);
                     if (c4 != null) {
                         c4.getConsommation().add(consommation4);
                     } else {
                         System.out.println("Vous n'êtes pas réservé, monsieur.");
                     }
                     break;
                    
                case 0:
                	back = true;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;

               
            }
            	} break;
            	       
            case 4:
            
                System.out.println("Entrez le nom du client  : ");
                String nomClient = scanner.nextLine();

                System.out.println("Entrez le prénom du client à chercher : ");
                String prenomClient = scanner.nextLine();
                
               
                Client clientRecherche = hotel.chercherClientParNomPrenom(nomClient, prenomClient);

                if (clientRecherche != null) {
                	
                	System.out.println("Donner votre num de chambre :");
                	int numChambre = scanner.nextInt();
                	Chambre ch=hotel.chercherChambre(numChambre);
                    if (ch!=null) {
                    	System.out.println("Afficher les consommations et la facture");
                    	List<Consommation> L=clientRecherche.getConsommation();
                    	if (L!=null || L.size()>0) {
                    		for (Consommation consommation : L) {
                    			System.out.println("Consommation - Prix : " + consommation.calculerPrix() + ", Date : " + consommation.getDate());
                    		}
                    	}
                    	Facture facc = new Facture(new Date(), clientRecherche.getConsommation(), clientRecherche,ch);
                    	double montantFacture = facc.calculerMontantTotal();
                        System.out.println("Montant total de la facture : " + montantFacture);
                    }
                    else System.out.println("cette chambre n'existe pas");
                    
                    
                } else 
                    System.out.println("Aucun client trouvé avec le nom et le prénom fournis.");

                break;


            

            case 0:

                System.exit(0); 
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
                break;
        }
    }
	}
}
    
    
    

    	
