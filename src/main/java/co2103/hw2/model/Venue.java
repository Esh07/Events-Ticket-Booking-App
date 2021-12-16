package co2103.hw2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Venue")
public class Venue {
	@Id
	private String name;
	private String address_line_1;
	private String address_line_2;
	private String city;
	private String zipcode;
	
	
	public Venue(String name, String address_line_1, String address_line_2, String city, String zipcode) {
		super();
		this.name = name;
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.city = city;
		this.zipcode = zipcode;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	
	
	
	
}
