package labs.singleton_lab12;

public class MathLibrary {
	public int someMathMethod() {
		return -1;
	}
	
	public double anotherMathMethod() {
		return 0;
	}

	private static MathLibrary instance;

	private MathLibrary(){};

	public static MathLibrary getInstance(){
		if (instance == null)
			instance = new MathLibrary();
		return instance;
	}
}
