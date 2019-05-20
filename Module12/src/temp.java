import java.util.Date;

public class temp {

	public static void main(String[] args) {
     Date d = new Date();


     System.out.println(d);
     
     String Filename=d.toString().replace(":", "_")+".html";
		String fileName=d.toString().replace(":", "_").replace(" ", "_")+".html";

     System.out.println(Filename);
     System.out.println(fileName);


     
	}

}
