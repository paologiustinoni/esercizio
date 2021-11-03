package it.mytest.esercizio.entities;

import java.util.ArrayList;

public class Transaction {
	private String status;
	ArrayList<Object> error = new ArrayList<Object>();
	TransactionDetails transaction;

	// Getter Methods
	public String getStatus() {
		return status;
	}

	public TransactionDetails getPayload() {
		return transaction;
	}

	// Setter Methods
	public void setStatus(String status) {
		this.status = status;
	}

	public void setPayload(TransactionDetails payloadObject) {
		this.transaction = payloadObject;
	}
}
