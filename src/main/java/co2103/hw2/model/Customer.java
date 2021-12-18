package co2103.hw2.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name="Customer")
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="customer_Id", nullable = false)
	private int customerId; 
	@Column(name="customer_name", nullable = true)
	private String customerName;
	
	private String address_line_1;
	private String address_line_2;
	@Column(length = 30)
	private String city;
	@Column(length = 30)
	private String zipcode;
	@Column(length = 10)
	private int tel;
	@Column(length = 255)
	private String email;
	
	@ManyToMany(
			fetch = FetchType.LAZY,
			cascade = {CascadeType.MERGE, CascadeType.PERSIST}
			)
	private Set<Ticket> tickets= new HashSet<>();

	/**
	 * @return the tickets
	 */
	public Set<Ticket> getTickets() {
		return tickets;
	}

	/**
	 * @param tickets the tickets to set
	 */
	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Customer(int id, String name, String address_line_1, String address_line_2, String city, String zipcode,
			int tel, String email) {
		this.customerId = id;
		this.customerName = name;
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.city = city;
		this.zipcode = zipcode;
		this.tel = tel;
		this.email = email;
	}
	public Customer() {
		
	}
	/**
	 * @return the id
	 */
	public int getcustomerId() {
		return customerId;
	}

	/**
	 * @param id the id to set
	 */
	public void setcustomerId(int id) {
		this.customerId = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return customerName;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.customerName = name;
	}

	/**
	 * @return the address_line_1
	 */
	public String getAddress_line_1() {
		return address_line_1;
	}

	/**
	 * @param address_line_1 the address_line_1 to set
	 */
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	/**
	 * @return the address_line_2
	 */
	public String getAddress_line_2() {
		return address_line_2;
	}

	/**
	 * @param address_line_2 the address_line_2 to set
	 */
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the tel
	 */
	public int getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(int tel) {
		this.tel = tel;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public void addTicket(Ticket t1) {
		this.tickets.add(t1);
		t1.addCustomers(this);		
	}



	
	
	
}
