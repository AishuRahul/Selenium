package week5.string;

import java.util.Scanner;

import cucumber.api.cli.Main;

public class PrimeNumber {

	static void checkPrime(int n) {

		int i, m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + "is not a Prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if ((n % i) == 0) {
					System.out.println(n + "is not a prime number");
					flag = 1;
					break;

				}

			}
			if (flag == 0) {
				System.out.println(n + "is a prime number");
			}

		}

	}
	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	

	public static void main(String[] args) {
		//checkPrime(17);
		//checkPrime(20);
		//checkPrime(1);
		   Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();  
	       if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	       }  
	}

}
