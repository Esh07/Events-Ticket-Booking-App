package co2103.hw2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name="Ticket")
@Table(name="Ticket")
public class Ticket {
	
	@Id
	@GeneratedValue
	private String ticketName;
	private double ticketPrice;

	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;
		
	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy="tickets")

	private Set<Customer> customers  = new HashSet<>();

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
