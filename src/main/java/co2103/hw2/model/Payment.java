package co2103.hw2.model;

import java.time.LocalDate;

public class Payment {
	
	private int paymentID;
	private int cardNumber;
	private LocalDate paymentDate;
	private double ticketAmount;
	
	
	
	public Payment(int paymentID, int cardNumber, LocalDate paymentDate, double ticketAmount) {
		super();
		this.paymentID = paymentID;
		this.cardNumber = cardNumber;
		this.paymentDate = paymentDate;
		this.ticketAmount = ticketAmount;
	}
	/**
	 * @return the paymentID
	 */
	public int getPaymentID() {
		return paymentID;
	}
	/**
	 * @param paymentID the paymentID to set
	 */
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	/**
	 * @return the cardNumber
	 */
	public int getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return the paymentDate
	 */
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	/**
	 * @return the ticketAmount
	 */
	public double getTicketAmount() {
		return ticketAmount;
	}
	/**
	 * @param ticketAmount the ticketAmount to set
	 */
	public void setTicketAmount(double ticketAmount) {
		this.ticketAmount = ticketAmount;
	}
	
	
	
}
