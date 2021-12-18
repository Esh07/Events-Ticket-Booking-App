package co2103.hw2.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name="Ticket")
@Table(name="Ticket")
public class Ticket {
	
	@Id
	@GeneratedValue
	private int ticketId;
	/**
	 * @return the ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}


	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	private String ticketName;
	private double ticketPrice;

	@ManyToOne
	private Vendor vendor;

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


	/**
	 * @return the vendor
	 */
	public Vendor getVendor() {
		return vendor;
	}


	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	
	public void addCustomers(Customer customer) {
		this.customers.add(customer);
		customer.getTickets().add(this);
	}


	/**
	 * @return the payment
	 */
	public Payment getPayment() {
		return payment;
	}


	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	/**
	 * @return the customers
	 */
	public Set<Customer> getCustomers() {
		return customers;
	}


	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	
	
}
