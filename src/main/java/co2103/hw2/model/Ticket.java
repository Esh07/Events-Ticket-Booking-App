package co2103.hw2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="Ticket")
@Table(name="ticket")
public class Ticket {
	@Id
	@GeneratedValue
	private String ticketName;
	private double ticketPrice;
	
	
	
	public Ticket(String ticketName, double ticketPrice) {
		super();
		this.ticketName = ticketName;
		this.ticketPrice = ticketPrice;
	}


	/**
	 * @return the ticketName
	 */
	public String getTicketName() {
		return ticketName;
	}


	/**
	 * @param ticketName the ticketName to set
	 */
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}


	/**
	 * @return the ticketPrice
	 */
	public double getTicketPrice() {
		return ticketPrice;
	}


	/**
	 * @param ticketPrice the ticketPrice to set
	 */
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
	
}
