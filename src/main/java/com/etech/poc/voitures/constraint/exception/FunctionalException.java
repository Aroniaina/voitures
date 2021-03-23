package com.etech.poc.voitures.constraint.exception;
/**
 *
 * @author a.safidy
 */

public abstract class FunctionalException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	private ErrorsEnum errorsEnum;
	
	public FunctionalException(ErrorsEnum errorsEnum,Exception e) {
		super(e);
		this.errorsEnum = errorsEnum;
	}
	
	public FunctionalException(ErrorsEnum errorsEnum) {
		super();
		this.errorsEnum = errorsEnum;
	}
	
	public ErrorsEnum getErrorsEnum() {
		return errorsEnum;
	}
	public void setErrorsEnum(ErrorsEnum errorsEnum) {
		this.errorsEnum = errorsEnum;
	}
	
}