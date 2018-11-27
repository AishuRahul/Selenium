package week1.day3;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung samsung = new Samsung();
		Jio jio = new Jio();
		samsung.dialCaller();
		jio.dialCaller();
		jio.call();
		samsung.sendSMS();
		jio.sendSMS();
		String brand=samsung.brandName();
		System.out.println(brand);

		String brandName=jio.brandName();
		System.out.println(brandName);


	}

}
