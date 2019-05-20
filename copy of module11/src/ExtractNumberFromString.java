
public class ExtractNumberFromString {

	public static void main(String[] args) {

		String str ="Madhu6612";
	      String numbers;
	      int sum=0;
	         //extracting string
	      numbers=str.replaceAll("[^0-9]", "");
	       
	      System.out.println("Numbers are: " + numbers);
	      
	      String str1=numbers;
	      
	      for(int i=0;i<=str1.length()-1;i++) {
	      char ch=str1.charAt(i);
	     // System.out.println(ch);
	      int y=Character.getNumericValue(ch);
	   System.out.println(y);
	      sum=sum+y;
		   
	      }
	      System.out.println(sum);

	      

	}
	
}
