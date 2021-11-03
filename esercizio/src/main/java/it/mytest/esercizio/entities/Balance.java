package it.mytest.esercizio.entities;

import java.util.ArrayList;

public class Balance {
	private String status;
	ArrayList<Object> error = new ArrayList<Object>();
	BalancePayload PayloadObject;

	// Getter Methods

	public String getStatus() {
		return status;
	}

	public BalancePayload getPayload() {
		return PayloadObject;
	}

	// Setter Methods

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPayload(BalancePayload payloadObject) {
		this.PayloadObject = payloadObject;
	}
}
