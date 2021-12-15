package week1.day1;

public class mobile {
	public void makeCall() {
		System.out.println("callConnected");
    }
     public void sendSms() {
		System.out.println("messageSend");

	}
	public static void main(String[] args) {
		mobile phone = new mobile();
		phone.makeCall();
        phone.sendSms();

	}

}
