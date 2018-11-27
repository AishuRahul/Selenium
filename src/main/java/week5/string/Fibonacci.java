package week5.string;

public class Fibonacci {

	public static void main(String[] args) {

		//int count = 34;
		int count=9;
		int i = 1;
		int j = 1;

		for (int k = 0; k < count; k++) {
			System.out.print(i + " ");
			int sum = i + j;
			i = j;
			j = sum;

		}

		
		/*while(i<=count) {
			
			System.out.print(i + " ");
			int sum = i + j;
			i = j;
			j = sum;

			
			
			
		}*/
	}
}