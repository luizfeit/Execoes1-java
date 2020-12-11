package model.exceptions;

public class DomainException extends Exception /*Exception precisa ser tradado*/  /*RuntimeException* é uma seção que não precisa ser tratada*/ {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
}
