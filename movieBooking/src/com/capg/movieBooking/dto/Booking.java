package com.capg.movieBooking.dto;

public class Booking {
private String moviename;
	private int bookingid;
private int seatid;
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public int getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}

public int getSeatid() {
	return seatid;
}
public void setSeat(int seat) {
	this.seatid = seatid;
}
}
