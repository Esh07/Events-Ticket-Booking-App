package co2103.hw2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {
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
