package it.mytest.esercizio.entities;

public class BalancePayload {
	private String date;
	private float balance;
	private float availableBalance;
	private String currency;

	// Getter Methods

	public String getDate() {
		return date;
	}

	public float getBalance() {
		return balance;
	}

	public float getAvailableBalance() {
		return availableBalance;
	}

	public String getCurrency() {
		return currency;
	}

	// Setter Methods

	public void setDate(String date) {
		this.date = date;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setAvailableBalance(float availableBalance) {
		this.availableBalance = availableBalance;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}