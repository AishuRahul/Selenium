package week1.day3;

public class Jio implements MobilePhone,Telephone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Phone Called in Jio");
		
	}

	@Override
	public void dialCaller() {
		// TODO Auto-generated method stub
		System.out.println("Dialled jio");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Message sent in jio");
	}

	@Override
	public String brandName() {
		// TODO Auto-generated method stub
		return "Jio";
	}

}
