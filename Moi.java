1package Pj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Calendar;


public class Moi {
	
	
	public static void main(String[] args) {
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
    Client client = new Client("John", "Doe", new Adresse("123 Main St", 1, "City", 4020, 52, "Country", "123-456-7890", "john@example.com", "www.example.com"));

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
    Adresse companyAddress = new Adresse(
            "Main Street", 123, "Cityville", 12345,
            6030, "Country", "123-456-7890",
            "info@company.com", "www.company.com"
        );
    Hotel hotel = new Hotel("HotelName",categorieStandard , new Date(), companyAddress,rooms);

        
    Reservation reservation1 = new Reservation( hotel,client, dateDebut1, dateFin1, chambresReservation1);
    Reservation reservation2 = new Reservation( hotel,client, dateDebut2, dateFin2, chambresReservation2);
    /*List<Reservation> res = new ArrayList<>();*/
    

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
    	    "Sunset Boulevard", 456, "Metropolis", 67890,
    	    3020, "United States", "987-654-3210",
    	    "contact@company.com", "hotl@website.com"
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
    Client client2 = new Client("Alice", "Smith", new Adresse("456 Oak St", 2, "Town", 56789, 5, "Country", "987-654-3210", "alice@example.com", "www.alice.com"));
    Chambre chambre4 = new Chambre(3, 3, 1, 1, Equipement.televiseur);
    Chambre chambre5 = new Chambre(6, 3, 2, 1, Equipement.bain);
    
    
    Date dateDebut3 = new Date(); 
    Date dateFin3 = new Date();   

    List<Chambre> chambresReservation3 = new ArrayList<>();
    chambresReservation3.add(chambre4);
    List<Chambre> chambresReservationn = new ArrayList<>();
    chambresReservationn.add(chambre5);
    
    Hotel Marhaba = new Hotel("Marhaba",categorieLuxe , new Date(), Address,room);

    

    Reservation reservationp = new Reservation(Marhaba,client2, dateDebut3, dateFin3, chambresReservation3);
    Reservation reservationc = new Reservation(Marhaba,client2, dateDebut3, dateFin3, chambresReservationn);

    
    
   Marhaba.ajouterReservation(reservationp);
    
    Marhaba.ajouterReservation(reservationc);
   
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
     System.out.println("1. Marhaba");
     System.out.println("2. hotel");
     System.out.println("0. Quitter");

     int choixHotel = scanner.nextInt();
     scanner.nextLine();

   switch (choixHotel) {
  case 1:
	  System.out.println("Vous avez choisi Marhaba.");
   
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
            	String nom,prenom,nomRue,nomCommune,pays;
            	do {
                    System.out.println("Entrez le nom du client : ");
                    nom = scanner.nextLine();
                } while (!validateNomPrenom(nom));

            	do {
                    System.out.println("Entrez le prenom du client : ");
                    prenom = scanner.nextLine();
                } while (!validateNomPrenom(prenom));

                 // Saisie de l'adresse du client
                 System.out.println("Entrez l'adresse du client : ");
                 
                 int numeroRue = saisirEntierAvecValidation(scanner, "Numéro de la rue : ");

                 
                 scanner.nextLine(); // nomRueConsommez la nouvelle ligne restante
                 
                 
                 do {
                     System.out.println("Entrez le nom de la rue du client : ");
                     nomRue = scanner.nextLine();
                 } while (!validateNomPrenom(nomRue));
                 
                 
                 int codePostal = saisirEntierAvecValidation(scanner, "Le code postal  : ");
                 
                 scanner.nextLine(); 


                 System.out.println("Ville : ");
                 String ville = scanner.nextLine();                 
                 

                
                 int numeroImmeuble = saisirEntierAvecValidation(scanner, "Le numero de l'immeuble  : ");

                 scanner.nextLine();
               
                 
                 do {
                     System.out.println("Entrez le nom de la commune  : ");
                     nomCommune = scanner.nextLine();
                 } while (!validateNomPrenom(nomCommune));
                 
                 int departementOuEtat = saisirEntierAvecValidation(scanner, "Le departement  : ");

                 scanner.nextLine();
                 
                 do {
                     System.out.println("Entrez le nom de pays  : ");
                     pays = scanner.nextLine();
                 } while (!validateNomPrenom(pays));


                 System.out.println("Numéro de téléphone : ");
                 String numeroTelephone = scanner.nextLine();
                 validateNumeroTelephone(numeroTelephone);

                 System.out.println("Adresse courriel : ");
                 String adresseCourriel = scanner.nextLine();

                 
                 String adresseWeb = saisirAdresseWeb(scanner);
                 
                 
                 Adresse adresseClient = new Adresse(nomRue, numeroImmeuble, nomCommune, codePostal,
                                                    departementOuEtat, pays, numeroTelephone,
                                                    adresseCourriel, adresseWeb);

                 // Création d'un client avec les informations saisies
                 Client c1 = new Client(nom, prenom, adresseClient);
                 c1.afficherInformations();
                 
                 Date dateDebut = saisirDate("Entrez la date de début de la réservation (format dd/MM/yyyy) : ", scanner);
                 Date dateFin = saisirDateSuperieure("Entrez la date de fin de la réservation (format dd/MM/yyyy) : ", dateDebut, scanner);

                 try {
                     verifierDates(dateDebut, dateFin);
                     System.out.println("Date de début de la réservation : " + dateDebut);
                     System.out.println("Date de fin de la réservation : " + dateFin);
                 } catch (IllegalArgumentException e) {
                     System.err.println("Erreur : " + e.getMessage());
                 }

                 
                 List<Chambre> chambresss = gestionHotel.saisirChambres(Marhaba,dateDebut,dateFin);
               /* Reservation reservation= new Reservation(c,dateDebut,dateFin,chambress);*/
                 Marhaba.reserverChambre(Marhaba,c1,dateDebut,dateFin,chambresss);
                 
                 
                 System.out.println("***************");
                 List<Reservation> L11= Marhaba.getReservation();
                 for (Reservation Res : L11)
                	 Res.afficherDetails();
                 System.out.println("***************");

                 
                 Marhaba.ajouterClient(c1);
             
                 
                 break;
            case 2:
                // Logique pour afficher les réservations
            	
            	System.out.println("Afficher les réservations");
            	//client.afficherConsommationsEtFacture();
        
                Marhaba.afficherReservations();
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

                    Client c2 = Marhaba.chercherClient(nom1, prenom1);
                    
                    if (c2 != null) {
                        c2.getConsommation().add(consommation1);
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

                    Client c3 = Marhaba.chercherClient(nom2, prenom2);
                    if (c3 != null) {
                        c3.getConsommation().add(consommation2);
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

                    Client c4 = Marhaba.chercherClient(nom3, prenom3);
                    if (c4 != null) {
                        c4.getConsommation().add(consommation3);
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

                     Client c5 = Marhaba.chercherClient(nom4, prenom4);
                     if (c5 != null) {
                         c5.getConsommation().add(consommation4);
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
                
               
                Client clientRecherche = Marhaba.chercherClientParNomPrenom(nomClient, prenomClient);

                if (clientRecherche != null) {
                	
                	System.out.println("Donner votre num de chambre :");
                	int numChambre = scanner.nextInt();
                	Chambre ch=Marhaba.chercherChambre(numChambre);
                    if (ch!=null) {
                    	System.out.println("Afficher les consommations et la facture");
                    	List<Consommation> LL=clientRecherche.getConsommation();
                    	if (LL!=null || LL.size()>0) {
                    		for (Consommation consommation : LL) {
                    			System.out.println("Consommation - Prix : " + consommation.calculerPrix() + ", Date : " + consommation.getDate());
                    		}
                    	}
                    	Facture fact = new Facture(new Date(), clientRecherche.getConsommation(), clientRecherche,ch);
                    	double montantFacture = fact.calculerMontantTotal();
                        System.out.println("Montant total de la facture : " + montantFacture);
                    }
                    else System.out.println("cette chambre n'existe pas");
                    
                    
                } else 
                    System.out.println("Aucun client trouvé avec le nom et le prénom fournis.");

                break;


            

            case 0:

            	 break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
                break;
        }

        if (choix == 0) {
            break;
        }
    }
    break;
  case 2:
	  
	  System.out.println("Vous avez choisi Hotel.");
	   
	    while (true) {
	        System.out.println("Menu Principal:");
	        System.out.println("1. Effectuer une réservation");
	        System.out.println("2. Afficher les réservations");
	        System.out.println("3. Effectuer des consommations");
	        System.out.println("4. Calculer la consommation et la facture");
	        System.out.println("0. Quitter");
	        
	        
	        int choixhotel = scanner.nextInt();
	        scanner.nextLine(); 

	        switch (choixhotel) {
	            case 1:
	                
	            	String nom,prenom,nomRue,nomCommune,pays;
	            	do {
	                    System.out.println("Entrez le nom du client : ");
	                    nom = scanner.nextLine();
	                } while (!validateNomPrenom(nom));

	            	do {
	                    System.out.println("Entrez le prenom du client : ");
	                    prenom = scanner.nextLine();
	                } while (!validateNomPrenom(prenom));

	                 // Saisie de l'adresse du client
	                 System.out.println("Entrez l'adresse du client : ");
	                 
	                 int numeroRue = saisirEntierAvecValidation(scanner, "Numéro de la rue : ");

	                 
	                 scanner.nextLine(); // nomRueConsommez la nouvelle ligne restante
	                 
	                 
	                 do {
	                     System.out.println("Entrez le nom de la rue du client : ");
	                     nomRue = scanner.nextLine();
	                 } while (!validateNomPrenom(nomRue));
	                 
	                 
	                 int codePostal = saisirEntierAvecValidation(scanner, "Le code postal  : ");
	                 
	                 scanner.nextLine(); 


	                 System.out.println("Ville : ");
	                 String ville = scanner.nextLine();                 
	                 

	                
	                 int numeroImmeuble = saisirEntierAvecValidation(scanner, "Le numero de l'immeuble  : ");

	                 scanner.nextLine();
	               
	                 
	                 do {
	                     System.out.println("Entrez le nom de la commune  : ");
	                     nomCommune = scanner.nextLine();
	                 } while (!validateNomPrenom(nomCommune));
	                 
	                 int departementOuEtat = saisirEntierAvecValidation(scanner, "Le departement  : ");

	                 scanner.nextLine();
	                 
	                 do {
	                     System.out.println("Entrez le nom de pays   : ");
	                     pays = scanner.nextLine();
	                 } while (!validateNomPrenom(pays));


	                 System.out.println("Numéro de téléphone : ");
	                 String numeroTelephone = scanner.nextLine();
	                 validateNumeroTelephone(numeroTelephone);

	                 System.out.println("Adresse courriel : ");
	                 String adresseCourriel = scanner.nextLine();

	                 String adresseWeb = saisirAdresseWeb(scanner);

	                 
	                 
	                
	                 Adresse adresseClient = new Adresse(nomRue, numeroImmeuble, nomCommune, codePostal,
	                                                    departementOuEtat, pays, numeroTelephone,
	                                                    adresseCourriel, adresseWeb);

	                 // Création d'un client avec les informations saisies
	                 Client c = new Client(nom, prenom, adresseClient);
	                 c.afficherInformations();
	                

	                 Date dateDebut = saisirDate("Entrez la date de début de la réservation (format dd/MM/yyyy) : ", scanner);
	                 Date dateFin = saisirDateSuperieure("Entrez la date de fin de la réservation (format dd/MM/yyyy) : ", dateDebut, scanner);

	                 try {
	                     verifierDates(dateDebut, dateFin);
	                     System.out.println("Date de début de la réservation : " + dateDebut);
	                     System.out.println("Date de fin de la réservation : " + dateFin);
	                 } catch (IllegalArgumentException e) {
	                     System.err.println("Erreur : " + e.getMessage());
	                 }
	                 
	                 List<Chambre> chambress = gestionHotel.saisirChambres(hotel,dateDebut,dateFin);
	               /* Reservation reservation= new Reservation(c,dateDebut,dateFin,chambress);*/
	                 hotel.reserverChambre(hotel,c,dateDebut,dateFin,chambress);
	                 
	                 
	                 System.out.println("***************");
	                 List<Reservation> L1= hotel.getReservation();
	                 for (Reservation Res : L1)
	                	 Res.afficherDetails();
	                 System.out.println("***************");

	                 
	                 hotel.ajouterClient(c);
	                 //hotel.AfficherClient();
	                 
	                 break;
	            case 2:	            	
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
                    // Retourner au Menu Principal
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }

            if (choixhotel == 0) {
                // Quitter la boucle du menu Marhaba si l'utilisateur choisit de retourner au Menu Principal
                break;
            }
        }
        break;
	                


	            

	         case 0:
	                // Quitter l'application
	                System.out.println("Au revoir !");
	                System.exit(0);
	            default:
	                System.out.println("Choix invalide. Veuillez réessayer.");
	                break;}
   
  }
	}
	private static void validateDate(Date date) {
	    try {
	        // Validation pour les jours, les mois, les années, etc.
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(date);

	        int year = calendar.get(Calendar.YEAR);
	        int month = calendar.get(Calendar.MONTH) + 1; // Les mois sont indexés à partir de zéro
	        int day = calendar.get(Calendar.DAY_OF_MONTH);

	        // Ajoutez vos validations ici, par exemple :
	        if (year < 2023) {
	            throw new IllegalArgumentException("L'année doit être égale ou supérieure à 2023.");
	        }

	        if (month < 1 || month > 12) {
	            throw new IllegalArgumentException("Le mois doit être compris entre 1 et 12.");
	        }

	        if (day < 1 || day > 31) {
	            throw new IllegalArgumentException("Le jour doit être compris entre 1 et 31.");
	        }
	    } catch (Exception e) {
	        // Gérez l'exception ici, par exemple, imprimez un message d'erreur ou lancez une nouvelle exception
	        System.err.println("Erreur de validation de la date : " + e.getMessage());
	        // Vous pouvez également relancer l'exception ou en lancer une nouvelle si nécessaire
	        throw new RuntimeException("Erreur de validation de la date", e);
	    }
	}


	private static String saisirAdresseWeb(Scanner scanner) {
        String adresseWeb = null;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println("Entrez une adresse web : ");
                adresseWeb = scanner.nextLine();
                validateAdresseWeb(adresseWeb);
                isValidInput = true; // La saisie est valide, sortez de la boucle
            } catch (IllegalArgumentException e) {
                System.err.println("Erreur : " + e.getMessage());
            }
        }

        return adresseWeb;
    }
	private static void validateAdresseWeb(String adresseWeb) {
	    if (adresseWeb == null || !adresseWeb.matches(".*@.*\\.com.*")) {
	        throw new IllegalArgumentException("L'adresse web n'est pas valide.");
	    }
	}
	private static void validateNumeroTelephone(String numeroTelephone) {
	    try {
	        if (numeroTelephone == null || !numeroTelephone.matches("^\\d{8}$")) {
	            throw new IllegalArgumentException("Le numéro de téléphone doit être composé de 8 chiffres.");
	        }
	    } catch (IllegalArgumentException e) {
	        // Gérer l'exception ici
	        System.err.println("Erreur de validation du numéro de téléphone : " + e.getMessage());
	        // Vous pouvez également logger l'erreur ou prendre d'autres mesures nécessaires
	    }
	}
	private static boolean validateNomPrenom(String value) {
        try {
            if (value == null || value.trim().isEmpty() || !value.matches("^[a-zA-Z]+$")) {
                throw new IllegalArgumentException("Le nom ou le prénom ne peut contenir que des lettres alphabétiques.");
            }
            return true; // La validation a réussi
        } catch (IllegalArgumentException e) {
            // Faites quelque chose en cas d'exception (facultatif)
            System.err.println("Erreur : " + e.getMessage());
            return false; // La validation a échoué
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
	 private static void validateNumber(String value) {
	        try {
	            if (value == null || value.trim().isEmpty() || !value.matches("^[0-9]+$")) {
	                throw new IllegalArgumentException("Le numéro de rue ne peut contenir que des chiffres.");
	            }
	        } catch (IllegalArgumentException e) {
	            // Faites quelque chose en cas d'exception
	            System.out.println("Une exception a été capturée : " + e.getMessage());
	            // Vous pouvez également relancer l'exception ou effectuer d'autres actions si nécessaire
	           
	        }
	    }
	 private static int saisirEntierAvecValidation(Scanner scanner, String message) {
	        int entier = 0; // Initialisez avec une valeur par défaut
	        boolean isValidInput = false;

	        while (!isValidInput) {
	            try {
	                System.out.println(message);
	                entier = scanner.nextInt();
	                isValidInput = true; // La saisie est valide, sortez de la boucle
	            } catch (java.util.InputMismatchException e) {
	                System.err.println("Erreur : Veuillez entrer un nombre entier valide.");

	                // Effacez la ligne incorrecte du scanner pour éviter une boucle infinie
	                scanner.nextLine();
	            }
	        }

	        return entier;
	    }
	 private static Date saisirDate(String message, Scanner scanner) {
	        Date date = null;
	        boolean isValidInput = false;
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        dateFormat.setLenient(false);

	        while (!isValidInput) {
	            try {
	                System.out.println(message);
	                String dateString = scanner.nextLine();
	                date = dateFormat.parse(dateString);
	                isValidInput = true; // La saisie est valide, sortez de la boucle
	            } catch (ParseException e) {
	                System.err.println("Erreur : Veuillez entrer une date valide au format dd/MM/yyyy.");
	            }
	        }

	        return date;
	    }

	    private static void verifierDates(Date dateDebut, Date dateFin) {
	        if (dateDebut.after(dateFin)) {
	            throw new IllegalArgumentException("La date de début doit être antérieure ou égale à la date de fin.");
	        }
	    }
	    private static Date saisirDateSuperieure(String message, Date dateDebut, Scanner scanner) {
	        Date dateFin = null;
	        boolean isValidInput = false;

	        while (!isValidInput) {
	            dateFin = saisirDate(message, scanner);

	            try {
	                verifierDates(dateDebut, dateFin);
	                isValidInput = true; // La saisie est valide, sortez de la boucle
	            } catch (IllegalArgumentException e) {
	                System.err.println("Erreur : " + e.getMessage());
	            }
	        }

	        return dateFin;
	    }
	
	
	
}
	        
	  

	

