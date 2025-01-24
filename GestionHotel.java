package Pj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GestionHotel {
    private List<Categorie> categories;
    private Scanner scanner;

    public GestionHotel() {
        this.categories = initialiserCategories();
        this.scanner = new Scanner(System.in);
    }

    private List<Categorie> initialiserCategories() {
        List<Categorie> categories = new ArrayList<>();

        // Définissez les prix pour chaque type
        Categorie categorieA = new Categorie("Catégorie A", Type.A, "bain", 100.0);
        Categorie categorieB = new Categorie("Catégorie B", Type.B, "douche", 80.0);
        Categorie categorieC = new Categorie("Catégorie C", Type.C, "téléviseur", 120.0);

        categories.add(categorieA);
        categories.add(categorieB);
        categories.add(categorieC);

        return categories;
    }

    private Categorie obtenirCategorieDepuisSaisie() {
        System.out.println("Entrez le type de catégorie (A, B, C) : ");
        String typeCategorie = scanner.next();
        scanner.nextLine();

        Type type = Type.valueOf(typeCategorie);

        for (Categorie categorie : categories) {
            if (categorie.getType() == type) {
                return categorie;
            }
        }

        System.out.println("Catégorie non trouvée. Utilisation de la catégorie par défaut.");
        // Assurez-vous d'avoir une catégorie par défaut définie
        return categories.get(0);
    }

    private double obtenirPrixDepuisCategorie(Categorie categorie) {
        Type type = categorie.getType();
        
        // Exemple : Utilisation d'une structure switch pour définir le prix en fonction du type de catégorie
        switch (type) {
            case A:
                return 100.0; // Prix pour la catégorie A
            case B:
                return 80.0;  // Prix pour la catégorie B
            case C:
                return 120.0; // Prix pour la catégorie C
            default:
                System.out.println("Catégorie non reconnue. Utilisation du prix par défaut.");
                return 0.0;   // Prix par défaut
        }}

    
    
    public List<Chambre> saisirChambres(Hotel h,Date debut,Date fin) {
        List<Chambre> chambres = new ArrayList<>();
        String saisirAutreChambre = "true";
        
        List<Integer> nums=new ArrayList<>();
        
        System.out.println("Voici notre chambres");
        h.afficherChambresdispo(debut,fin);
        
        while (!saisirAutreChambre.equals("false")) {
            System.out.println("Entrez le numéro de la chambre : ");
            
            int numeroChambre = scanner.nextInt();
            scanner.nextLine();
            
            Chambre c =h.chercherChambre(numeroChambre);
            
            if (c!=null) {
            	if (!nums.contains(numeroChambre) && h.ChambreDispo(c,debut,fin)) {
            		chambres.add(c);
            		nums.add(numeroChambre);}
            	
            	else System.out.println("Desole cette chambre est deja reserve");
            
            }
            else System.out.println("Il n'existe pas une chambre avec ce numero");
            
            

            System.out.println("Voulez-vous saisir une autre chambre ? (true/false) ");
            saisirAutreChambre = scanner.next();
            scanner.nextLine();
            
        }
        return chambres;
    }
    


    private int obtenirEtageDepuisSaisie() {
        System.out.println("Entrez l'étage de la chambre : ");
        return scanner.nextInt();
    }

    private int obtenirLitsDepuisSaisie(String typeLits) {
        System.out.println("Entrez le nombre de " + typeLits + " : ");
        return scanner.nextInt();
    }

    
}

