package co2103.hw2.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name="Venue")
@Table(name="venue")
public class Venue {
	
	@Id
	private String venueName;
	private String address_line_1;
	private String address_line_2;
	private String city;
	private String zipcode;
	
	@ManyToMany(
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, 
			mappedBy ="venue"
			)
	private Set<Event> venueEvents;
	
	public Venue(String name, String address_line_1, String address_line_2, String city, String zipcode) {
		super();
		this.venueName = name;
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.city = city;
		this.zipcode = zipcode;
	}





	/**
	 * @return the venueName
	 */
	public String getVenueName() {
		return venueName;
	}





	/**
	 * @param venueName the venueName to set
	 */
	public void setVenueName(String venueName) {
		this.venueName = venueName;
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
	 * @return the venueEvents
	 */
	public Set<Event> getVenueEvents() {
		return venueEvents;
	}


	/**
	 * @param venueEvents the venueEvents to set
	 */
	public void setVenueEvents(Set<Event> venueEvents) {
		this.venueEvents = venueEvents;
	}



	
	
	
	
}
