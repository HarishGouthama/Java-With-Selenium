package com.javabasics.programs;

interface ATM 
{
	void cashWithDraw();
	void miniStatement();
	void fastCash();
	void balanceEnquiry();
	void pinChange();
}

abstract class ATMImplement implements ATM
{
	public void cashWithDraw()
	{
		System.out.println("cashWithDraw Method");
	}
	
	public void miniStatement()
	{
		System.out.println("miniStatement Method");
	}
	
	public void pinChange()
	{
		System.out.println("PinChange method");
	}
	
	public void fastCash()
	{
		System.out.println("Fast Cash Method");
	}
}

class TestATM extends ATMImplement
{
	public void balanceEnquiry()
	{
		System.out.println("Balance Enquiry");
	}
}

public class InterfaceDemo
{
	public static void main(String[] args) 
	{
		TestATM test = new TestATM();
		test.cashWithDraw();
		test.miniStatement();
		test.pinChange();
		test.fastCash();
		test.balanceEnquiry();
		
		System.out.println("\n");
		
		ATM atm = new TestATM();
		atm.cashWithDraw();
		atm.miniStatement();
		atm.fastCash();
		atm.balanceEnquiry();
		atm.pinChange();
	}
}