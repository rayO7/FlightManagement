package daoImpl;

import java.math.BigInteger;
import java.text.ParseException;

import userAccount.Booking;

public interface BookingDaoImpl {
	public void addBooking(Booking b) throws ParseException;
	public void viewBooking(BigInteger bookingId);

}
