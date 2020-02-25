package DataInfo;

import java.util.Date;

import userAccount.Airport;
import userAccount.Schedule;
import userAccount.ScheduleFlightServicesImpl;

public class ScheduleInfo {
	
	public void ScheduleDetails()
	{
		Schedule s1=new Schedule();
		Airport a1=new Airport();
		
		a1.setAirportName("Delhi National Airport");
		a1.setAirportCode("001");
		a1.setAirportLocation("delhi");
		s1.setSourceAirport(a1);
		s1.setDepartureTime(new Date());
		
		Airport a2=new Airport();
		a2.setAirportName("Kanpur National Airport");
		a2.setAirportCode("001");
		a2.setAirportLocation("kanpur");
		s1.setDestinationAirport(a2);
		s1.setArrivalTime(new Date());
		
		(ScheduleFlightServicesImpl.al).add(s1);
		
		Schedule s2=new Schedule();
		Airport a3=new Airport();
		
		a3.setAirportName("Bangalore National Airport");
		a3.setAirportCode("001");
		a3.setAirportLocation("Bangalore");
		s2.setSourceAirport(a3);
		s2.setDepartureTime(new Date());
		
		Airport a4=new Airport();
		a4.setAirportName("Chennai National Airport");
		a4.setAirportCode("001");
		a4.setAirportLocation("chennai");
		s2.setDestinationAirport(a4);
		s2.setArrivalTime(new Date());
		
		(ScheduleFlightServicesImpl.al).add(s2);
		
		
	}

}
