package daoImpl;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import userAccount.Airport;

public interface ScheduledFlightDaoImpl {
	
	public void viewScheduleFlights(Airport s, Airport d, Date date);
	public void deleteScheduleFlight(BigInteger bookingId);

}
