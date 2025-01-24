package Pj;
import java.util.Date;

public interface Consommation {
	double calculerPrix(); 
    Date getDate();  
    default void assignerDateActuelle() {
        setDate(new Date());
    }

    void setDate(Date date);

}
