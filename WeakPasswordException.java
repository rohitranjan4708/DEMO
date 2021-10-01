package exWeakPassword;

public class WeakPasswordException extends Exception{
	String exception;
	///////error message is passed via constructor/////////
	public WeakPasswordException(String exception) {
		super(exception);
	}

}
