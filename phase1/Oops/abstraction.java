package Oops;

abstract class car
{
	String carname;
	String city;
	int price;
	abstract void speed();
	car(String carname ,int price,String ctty)
	{
		this.carname=carname;
		this.price =price;
		this.city=city;
	}
	public car(String city2) {
		this.city=city2;
	}
	}
class bike extends car
{
	String bikename;
	int price;
	bike(String city,String bikename,int price)
	{
	  super(city);
	   this.bikename=bikename;
	   this.price=price;
	}
	@Override
	void speed() {
		System.out.println("Dont go beyond the speed");
	}
	public void bike_Details()
	{
		System.out.println("The bikename"  +bikename);
		System.out.println("the price of the bike" +price);
		System.out.println("the city" +city);
	}
	
	}

public class abstraction {
	public static void main(String[] args)
	{
		
		bike b1 = new bike("banglore","r15",1234);
		b1.bike_Details();
		
	}
	

}
