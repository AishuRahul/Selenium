package week5.string;

public class ReversingString {

	public static void main(String[] args) {
		String str = "TestLeaf";
		String reverse = "";

		int i = str.length();

		for (int j = i - 1; j >= 0; j--) {

			reverse = reverse + str.charAt(j);

		}
		System.out.println("Original String is :" + str);
		System.out.println("Reversed String is :" + reverse);

		if (reverse.equals(str)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("not Palindrome");
		}
	}
}