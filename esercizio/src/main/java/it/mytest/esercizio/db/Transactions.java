package it.mytest.esercizio.db;

import javax.persistence.*;

@Entity
@Table(name = "Transactions")
public class Transactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "transactionKey")
	private String transactionKey;

	@Column(name = "account")
	private String account;

	@Column(name = "operation")
	private String operation;
	
	@Column(name = "dateTime")
	private String dateTime;
	
	public Transactions(long id, String transactionKey, String account, String operation, String dateTime) {
		super();
		this.setId(id);
		this.setTransactionKey(transactionKey);
		this.setAccount(account);
		this.setOperation(operation);
		this.setDateTime(dateTime);
	}
	
	public Transactions() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTransactionKey() {
		return transactionKey;
	}

	public void setTransactionKey(String transactionKey) {
		this.transactionKey = transactionKey;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
