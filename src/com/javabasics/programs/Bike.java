package com.javabasics.programs;

class Vehicle
{
	public void run()
	{
		System.out.println("Vehicle is runnning");
	}
}

public class Bike extends Vehicle
{
	public void run()
	{
		System.out.println("Bike is running safely");
	}
	
	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle();
		v.run();
		//Bike bike = new Bike();
		//bike.run();
	}
}
