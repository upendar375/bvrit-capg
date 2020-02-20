package com.capg.movieBooking.dao;

import java.util.ArrayList;
import java.util.*;


public class BookMovieTicket
{
	ArrayList<Integer> na=new ArrayList<Integer>();
	ArrayList<Integer> ra=new ArrayList<Integer>();
	Scanner in= new Scanner(System.in);
public boolean bookTickets()
{
	int n=15;
	int b;
	

	ArrayList<Integer> t=new ArrayList<Integer>(n);
t.add(1);t.add(2);t.add(3);t.add(4);t.add(5);t.add(6);t.add(7);t.add(8);t.add(9);t.add(10);t.add(11);t.add(12);t.add(13);
System.out.println("Available seats for movie sarileru nekuevaru:" +t);

System.out.println("Select seats to book Sarileru Nikevvaru \n on 20/02/2020 ");
System.out.println("Enter no of tickets to be booked:");
int n1=in.nextInt();
System.out.println("Please select the Seats:");

for( b=0;b <=n1;b++)
{
	b=in.nextInt();
    na.add(b);
}
System.out.println("Booked tickets are"+na);



return true;
}
public boolean cancelTickets() {

	System.out.println("Enter the tickets to be cancelled:");
	int n2;
	for(int i=0;i<na.size();i++)
	{
	n2=in.nextInt();
	if(na.remove((Object)n2)) {
		ra.add(n2);
	}
	}
	
	System.out.println(" Cancelled tickets are:"+ra);
	System.out.println("Available tickets are:" +na);
	return true;
}
}
	