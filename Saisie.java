package Pj;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Saisie {
	public static Consommation saisirPetitDejeuner() {
	    Scanner scanner = new Scanner(System.in);

        Type type = saisirType(scanner,"le type de petit dejeuner (A, B, C)");


	    return new PetitDejeuner(type, new Date());
	}




    public static Consommation saisirArticleMinibar() {
        Scanner scanner = new Scanner(System.in);

        Type type = saisirType(scanner,"le type d'article minibar (A, B, C)");
	    int quantite = saisirEntierAvecValidation(scanner, "Entrez la quantité de l'article du minibar : ");

          scanner.nextLine();

        return new ArticleMinibar( type, quantite, new Date());
    }

    public static Consommation saisirService() {
        Scanner scanner = new Scanner(System.in);

    while (true) {
        try {
            
            Heure dureeService = saisirHeure(scanner, "la durée de service (UNE, DEUX, TROIS, CINQ)");
            System.out.println("Le service est-il forfaitaire ? (true/false) : ");
            boolean forfaitaire = Boolean.parseBoolean(scanner.nextLine());

            return new Communications(dureeService, forfaitaire, new Date());

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
            System.out.println("Veuillez réessayer.");
            // Continuez la boucle pour demander à l'utilisateur de saisir à nouveau
            continue;
        }}}
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
    private static Type saisirType(Scanner scanner, String message) {
        Type type = null;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println("Entrez " + message + " : ");
                type = Type.valueOf(scanner.nextLine().toUpperCase());
                isValidInput = true; // La saisie est valide, sortez de la boucle
            } catch (IllegalArgumentException e) {
                System.err.println("Erreur : Veuillez entrer une valeur valide (A, B, C).");
            }
        }

        return type;
    }
    private static Heure saisirHeure(Scanner scanner, String message) {
        Heure dureeService = null;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println("Entrez " + message + " : ");
                dureeService = Heure.valueOf(scanner.nextLine().toUpperCase());
                isValidInput = true; // La saisie est valide, sortez de la boucle
            } catch (IllegalArgumentException e) {
                System.err.println("Erreur : Veuillez entrer une valeur valide (UNE, DEUX, TROIS, CINQ).");
            }
        }

        return dureeService;
    }
    public static Consommation saisirServicedefoulement() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Entrez le type de service (S pour SAUNA, B pour BLANCHISSERIE) : ");
                String typeServiceStr = scanner.nextLine().toUpperCase();

                if (typeServiceStr.equals("S")) {
                    return new Service(Entertain.SAUNA, new Date());
                } else if (typeServiceStr.equals("B")) {
                    return new Service(Entertain.BLANCHISSERIE, new Date());
                } else {
                    throw new IllegalArgumentException("Le type de service doit être S ou B.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
                System.out.println("Veuillez réessayer.");
                // Continuez la boucle pour demander à l'utilisateur de saisir à nouveau
                continue;
            }
        }

    }}
