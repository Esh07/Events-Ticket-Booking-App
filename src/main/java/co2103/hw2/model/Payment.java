package co2103.hw2.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Payment")
@Table(name="Payment")
public class Payment {
	@Id
	@GeneratedValue
	private int PaymentID;
	private int cardnumber;
	private LocalDate paymentDate;
	private double ticket_price;
	

	@OneToOne(mappedBy="payment")
	private Ticket ticket;


	public int getPaymentID() {
		return PaymentID;
	}


	public void setPaymentID(int paymentID) {
		PaymentID = paymentID;
	}


	public int getCardnumber() {
		return cardnumber;
	}


	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}


	public LocalDate getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}


	public double getTicket_price() {
		return ticket_price;
	}


	public void setTicket_price(double ticket_price) {
		this.ticket_price = ticket_price;
	}


	public Ticket getTicket() {
		return ticket;
	}


	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
	

	
	
	
}
