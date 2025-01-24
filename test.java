package Pj;
import java.util.Date;

public class test {

	public static boolean dateEntre(Date d,Date debut,Date fin) {
		if (d.compareTo(debut)>=0 && d.compareTo(fin)<=0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Date x= new Date();
		Date y=new Date(2023,12,31);
		Date z=new Date(2023,12,20);
		
		System.out.println(dateEntre(z,x,y));
		
	}
	
}
