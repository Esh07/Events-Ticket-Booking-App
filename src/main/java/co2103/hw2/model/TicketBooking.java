package co2103.hw2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="TicketBooking")
@Table(name="ticket_booking")
public class TicketBooking {
	@Id
	@GeneratedValue
	private int bookingID;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="vendorId")
	private Vendor vendor;

	
	
	
}
