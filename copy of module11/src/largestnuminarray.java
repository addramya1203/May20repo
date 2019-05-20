
public class largestnuminarray {

	public static void main(String[] args) {
		int a[] = { 4, 23, 55, 8, 9, 50, 80, 7 };
		int b[];
		
		int max = 0;
		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				max = a[i];
			
			}
		}
		System.out.println(max);
	}

}
