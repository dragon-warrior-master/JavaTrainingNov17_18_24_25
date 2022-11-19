package training.java.learninterface;

public class SmartPhone extends TelePhone implements GPS, Camera {

	@Override
	public void displayLocation() {
		System.out.println("Smartphone is displaying location...");
	}

	public void useSmatPhone() {
		call();
	}

	@Override
	public void clickPicture() {
		System.out.println("Smartphone is clicking picture...");
	}

}
