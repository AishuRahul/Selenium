package week1.day1;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobilePhone phone = new MobilePhone();
		String brand =phone.brandName;
		System.out.println(brand);
		
		String mod=phone.model;
		System.out.println(mod);
		
		int number = phone.dialCaller("testleaf");
		System.out.println(number);
		
		boolean smsReceived=phone.sendSMS("Hi");
		System.out.println(smsReceived);
	}

}
