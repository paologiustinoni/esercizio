package it.mytest.esercizio.error;

import java.util.List;

public class InvalidDataException extends Exception {

	private static final long serialVersionUID = 259245268593242805L;
	private String status;
	private List<Error> errors = null;
	private Payload payload;

	public InvalidDataException(String status, List<Error> errors, Payload payload) {
		super();
		this.status = status;
		this.errors = errors;
		this.payload = payload;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}
}
