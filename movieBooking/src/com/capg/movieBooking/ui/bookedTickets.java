package com.capg.movieBooking.ui;
import com.capg.movieBooking.dao.*;
public class bookedTickets {

	public static void main(String[] args) {
		bookedTickets bs=new bookedTickets();
		BookMovieTicket bt=new BookMovieTicket();
		bt.bookTickets();
        bt.cancelTickets();
        
	}

}
