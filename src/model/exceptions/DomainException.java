package model.exceptions;

public class DomainException extends Exception /*Exception precisa ser tradado*/  /*RuntimeException* � uma se��o que n�o precisa ser tratada*/ {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
}
