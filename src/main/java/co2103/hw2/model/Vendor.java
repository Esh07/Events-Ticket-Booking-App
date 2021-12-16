package co2103.hw2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Vendor {
		@Id
		@GeneratedValue
		private int id; 
		private String name;
		private String address_line_1;
		private String address_line_2;
		private String city;
		private String zipcode;
		private int tel;
		private String email;
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
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
		
		
}
