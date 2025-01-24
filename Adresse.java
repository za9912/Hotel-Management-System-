package Pj;

public class Adresse {
    private String nomRue;
    private int numeroImmeuble;
    private String nomCommune;
    private int codePostal;
    private int departementOuEtat;
    private String pays;
    private String numeroTelephone;
    private String adresseCourriel;
    private String adresseWeb;

    public Adresse(String nomRue, int numeroImmeuble, String nomCommune, int codePostal,
                   int departementOuEtat, String pays, String numeroTelephone,
                   String adresseCourriel, String adresseWeb) {
        this.nomRue = nomRue;
        this.numeroImmeuble = numeroImmeuble;
        this.nomCommune = nomCommune;
        this.codePostal = codePostal;
        this.departementOuEtat = departementOuEtat;
        this.pays = pays;
        this.numeroTelephone = numeroTelephone;
        this.adresseCourriel = adresseCourriel;
        this.adresseWeb = adresseWeb;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        if (nomRue == null || nomRue.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de rue ne peut pas être vide.");
        }
        this.nomRue = nomRue;
    }

    public int getNumeroImmeuble() {
        return numeroImmeuble;
    }

    public void setNumeroImmeuble(int numeroImmeuble) {
        if (numeroImmeuble <= 0) {
            throw new IllegalArgumentException("Le numéro d'immeuble doit être supérieur à zéro.");
        }
        this.numeroImmeuble = numeroImmeuble;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        if (nomCommune == null || nomCommune.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de commune ne peut pas être vide.");
        }
        this.nomCommune = nomCommune;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
    	if (codePostal <= 0) {
            throw new IllegalArgumentException("Le code postal doit être supérieur à zéro.");
        }
        this.codePostal = codePostal;
    }

    public int getDepartementOuEtat() {
        return departementOuEtat;
    }

    public void setDepartementOuEtat(int departementOuEtat) {
       
        this.departementOuEtat = departementOuEtat;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        if (pays == null || pays.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du pays ne peut pas être vide.");
        }
        if (!pays.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("Le nom du pays ne peut contenir que des lettres alphabétiques.");
        }
        this.pays = pays;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

  /*  public void setNumeroTelephone(int numeroTelephone) {
    	if (numeroTelephone <= 0) {
            throw new IllegalArgumentException("Le numero doit être supérieur à zéro.");
        }
        this.numeroTelephone = numeroTelephone;
    }*/

    public String getAdresseCourriel() {
        return adresseCourriel;
    }

    public void setAdresseCourriel(String adresseCourriel) {
    
        this.adresseCourriel = adresseCourriel;
    }

    public String getAdresseWeb() {
        return adresseWeb;
    }

    public void setAdresseWeb(String adresseWeb) {
        // Valider que l'adresse Web contient '@' et se termine par '.com'
        if (!adresseWeb.matches(".*@.*\\.com$")) {
            throw new IllegalArgumentException("L'adresse Web doit contenir '@' et se terminer par '.com'.");
        }
        this.adresseWeb = adresseWeb;
    }

   
    public String toString() {
        return String.format("Adresse :\n" +
                "Nom de rue : %s\n" +
                "Numéro d'immeuble : %d\n" +
                "Nom de commune : %s\n" +
                "Code postal : %s\n" +
                "Département ou État : %s\n" +
                "Pays : %s\n" +
                "Numéro de téléphone : %s\n" +
                "Adresse courriel : %s\n" +
                "Adresse web : %s",
                nomRue, numeroImmeuble, nomCommune, codePostal, departementOuEtat, pays,
                numeroTelephone, adresseCourriel, adresseWeb);
    }
}
