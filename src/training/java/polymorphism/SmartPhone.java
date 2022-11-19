package training.java.polymorphism;

public class SmartPhone extends Phone implements GPS, Camera {

	@Override
	public void displayLocation() {
		System.out.println("Smartphone is displaying location...");
	}

	public void useSmartPhone() {
		call();
	}

	@Override
	public void clickPicture() {
		System.out.println("Smartphone is clicking picture...");

	}

	  //music method is available in Phone class (which is Parent of SmartPhone) and hence implementing same music 
	//method in SmartPhone class overrides the music method. here if you don't use @Override method then compiler does not gives any issue
	//rather it considers music() method to be overriden so even if we don't use @Override annotation considers music method overriden
	//the only benefit of using @Overrride annotation over any overriden method is when Parent's method changed its name or signature or
	//due to which it is a different method then method in Child class which was considered to be overriding the previously available method
	//does not intimate use by any means that Parent's method has changed. But if we use @Override annotation with the overriden method
	//compiler throws compile time issue through which user gets to know that method in Parent has changed and the error giving method 
	//
	@Override
	public void music() {
		System.out.println("Smartphone is playing music...");
	}
	
	//Runtime Polymorphism
	//this happens only when classes are getting inherited
	
	
	
	
}
