package com.ssi;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Account implements InitializingBean, DisposableBean {
	
	public void start(){
		System.out.println("Account Start");
	}
	public void stop(){
		System.out.println("Account Stopped");
	}
	
	public Account(){
		System.out.println("Account Object Created : ");
	}
	
	
	private String accountNo;
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", cname=" + cname
				+ ", balance=" + balance + ", address=" + address + "]";
	}
	private String cname;
	private double balance;
	private Address address;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
		System.out.println("Account No. set");
		
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
		System.out.println("Name Set");
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void showAccountInfo(){
		System.out.println(accountNo+","+cname+","+balance+","+address);
	}
	public void deposit(int amount){
		balance=balance+amount;
	}
	public void withdraw(int amount){
		balance=balance-amount;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("AFTER PROPERTIES SET FOR ACCOUNT");
		
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DESTROY METHOD OF DISPOSABLE");
		
	}
	
	
	
	
}
