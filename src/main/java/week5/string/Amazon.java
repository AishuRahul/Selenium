package week5.string;

public class Amazon {
public static void main(String[] args) {
	
	String str="Amazon India";
	char[] ch=str.toCharArray();
	int count=0;
	for (char c : ch) {
		if(c=='A' || c=='a')
		{
			count++;
		}
		
	}
	System.out.println(count);
}


}
