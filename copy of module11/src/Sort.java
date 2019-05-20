import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		String str = "Ramyaddeall";
		String str2 = "Addepalli";

		char[] ch = str.toCharArray();
		char[] ch1 = str2.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		Arrays.sort(ch1);
		System.out.println(ch1);

		Arrays.equals(ch, ch1);

	}

}
