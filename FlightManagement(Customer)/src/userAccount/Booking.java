package userAccount;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
	private BigInteger bookingId;
	private BigInteger userId;
	private Date bookingDate;
	private BigInteger ticketCost;
	private int noOfPassengers;
	
	
	public BigInteger getBookingId() {
		return bookingId;
	}
	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) throws ParseException {
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(bookingDate);
		this.bookingDate =date1 ;
	}
	public BigInteger getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(BigInteger ticketCost) {
		this.ticketCost = ticketCost;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	
	

}
