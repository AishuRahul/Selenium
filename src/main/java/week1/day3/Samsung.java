package week1.day3;

public class Samsung implements MobilePhone {

	@Override
	public void dialCaller() {
		// TODO Auto-generated method stub
		System.out.println("Dialled in Samsung");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Message sent in Samsung");
	}

	@Override
	public String brandName() {
		// TODO Auto-generated method stub
		return "Samsung";
	}

	
}
