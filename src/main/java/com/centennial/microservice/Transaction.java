package com.centennial.microservice;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	@Column(name="transactionid")
	private int transactionid;
	@Column(name="customerid")
	private int customerid;
	@Column(name="bookid")
	private int bookid;
	@Column(name="trxndate")
	private Date trxndate;
	@Column(name="trxntype")
	private String trxntype;
	
	public Transaction() {
		super();
	}
	public Transaction(int transactionid, int customerid, int bookid, Date trxndate, String trxntype) {
		super();
		this.transactionid = transactionid;
		this.customerid = customerid;
		this.bookid = bookid;
		this.trxndate = trxndate;
		this.trxntype=trxntype;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public Date getTrxndate() {
		return trxndate;
	}
	public void setTrxndate(Date trxndate) {
		this.trxndate = trxndate;
	}
	public String getTrxntype() {
		return trxntype;
	}
	public void setTrxntype(String trxntype) {
		this.trxntype = trxntype;
	}
	
	

}