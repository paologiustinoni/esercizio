package it.mytest.esercizio.entities;

import java.util.ArrayList;

public class TransactionDetails {
	private ArrayList<TransactionDetail> list = new ArrayList<TransactionDetail>();

	public ArrayList<TransactionDetail> getList() {
		return list;
	}

	public void setList(ArrayList<TransactionDetail> list) {
		this.list = list;
	}

}
