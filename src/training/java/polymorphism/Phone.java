package training.java.polymorphism;

public class Phone extends TelePhone {

	public Phone() {

	}

	public void music() {
		System.out.println("Playing Music from Phone...");
	}

	public void music(String songsName) {

	}

	public void music(String songsName, int repeat) {

	}

	public void music(int repeat, String songsName) {

	}

	// Method Overloading
	// methods having same name but different signatures
	// -- signature of any method --> number,type and sequence of arguments in the
	//return typ is not part of signature
	// method

}
