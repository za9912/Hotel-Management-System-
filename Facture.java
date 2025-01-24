package Pj;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Facture {
	private static int num=0;
	private  int numeroFacture;
    private Date dateFacturation;
    private Client client;
    private Chambre chambre;
    private List <Consommation> consommations;

   
    public Facture(Date dateFacturation,List <Consommation> consommations, Client client,Chambre C) {
        this.numeroFacture=num++;
        this.dateFacturation = dateFacturation;
        this.client = client;
        this.chambre = C;
        this.consommations = consommations;
    }

    public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Facture.num = num;
	}

	public int getNumeroFacture() {
		return numeroFacture;
	}

	public void setNumeroFacture(int numeroFacture) {
		this.numeroFacture = numeroFacture;
	}

	public Date getDateFacturation() {
		return dateFacturation;
	}

	public void setDateFacturation(Date dateFacturation) {
        if (dateFacturation == null) {
            throw new IllegalArgumentException("La date de facturation ne peut pas être null.");
        }
        this.dateFacturation = dateFacturation;
    }

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Le client ne peut pas être null.");
        }
        this.client = client;
    }

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
        if (chambre == null) {
            throw new IllegalArgumentException("La chambre ne peut pas être null.");
        }
        this.chambre = chambre;
    }

	public List<Consommation> getConsommations() {
		return consommations;
	}

	public void setConsommations(List<Consommation> consommations) {
        if (consommations == null) {
            throw new IllegalArgumentException("La liste des consommations ne peut pas être null.");
        }
        this.consommations = consommations;
    }

	public void ajouterConsommation(Consommation consommation) {
        consommations.add(consommation);
    }

    public double calculerMontantTotal() {
        double montantTotal = 0.0;
        montantTotal+=chambre.calculerPrix();
        for (Consommation consommation : consommations) {
            montantTotal += consommation.calculerPrix();
        }
        return montantTotal;
    }
}