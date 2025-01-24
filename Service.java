package Pj;
import java.util.Date;

public class Service implements Consommation {
	private Entertain t;
	private Date d;
    
   
    public Service(Entertain t, Date date) {
        if (t == null) {
            throw new IllegalArgumentException("Le type de service ne peut pas être nul.");
        }
        this.t = t;
        this.d = date;
    }
    public double calculerPrix() {
        // Example: Calculate initial price based on the type of petit déjeuner
        switch (this.t) {
            case BLANCHISSERIE:
                return 15.0; 
            case SAUNA:
                return 10.0; 
            
            default:
                return 0.0; 
        }}

    public Entertain getT() {
		return t;
	}
	public void setT(Entertain t) {
		this.t = t;
	}
	public Date getDate() {
		return d;
	}
	public void setDate(Date d) {
		this.d = d;
	}
	public String toString() {
        return "Service{" +
                "type='" + t + '\'' +
                ", date=" + d +
                '}';
    
    }	

}
