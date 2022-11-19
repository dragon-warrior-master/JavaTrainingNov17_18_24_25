package training.java.polymorphism;

public class Main {

	public static void main(String[] args) {

		SmartPhone smartphone = new SmartPhone();
		smartphone.music();

		Phone phone1 = new Phone();
		phone1.call();

		TelePhone telePhone = new TelePhone();
		telePhone.call();

		// Phone is Parent and SmartPhone is Child
		// We will be only seeing the methods which are avaialble in the Phone class and
		// overriden methods in SmartPhone class
		Phone phone = new SmartPhone();
		phone.call(); // call is available in Telephone class
		phone.music(); // At runtime it resolves to be coming from Child Class i.e. SmartPhone class as
						// music() method is getting overriden
						// in SmartPhone class
		// using downcasting of instance variable we can use methods defined in the
		// Child Class
		((SmartPhone) phone).useSmartPhone();

		// SmartPhone sPhone = (SmartPhone) new Phone(); // Not allowed as we can not
		// assign Parent's obbject to Child
		// reference variable

		Camera camera = new SmartPhone();
		camera.clickPicture();

		((SmartPhone) camera).useSmartPhone();

		((SmartPhone) camera).displayLocation();

		GPS gps = new SmartPhone();

		gps.displayLocation();

	}

}
