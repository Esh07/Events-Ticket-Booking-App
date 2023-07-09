package co2103.hw2;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co2103.hw2.model.Customer;
import co2103.hw2.model.Payment;
import co2103.hw2.model.Ticket;
import co2103.hw2.model.Vendor;
import co2103.hw2.repos.CustomerRepository;
import co2103.hw2.repos.PaymentRepository;
import co2103.hw2.repos.TicketRepository;
import co2103.hw2.repos.VendorRepository;

@SpringBootApplication
public class Hw2Application implements ApplicationRunner {
	@Autowired
	CustomerRepository Customerrepo;

	@Autowired
	TicketRepository Ticketrepo;

	@Autowired
	PaymentRepository Paymentrepo;

	@Autowired
	VendorRepository Vendorrepo;

	public static void main(String[] args) {
		SpringApplication.run(Hw2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 1 vendor
		Vendor v1 = new Vendor();
		v1.setvendorName("One plus");
		v1.setAddress_line_1("112");
		v1.setAddress_line_2(" London Road");
		v1.setCity("Leetcode");
		v1.setZipcode("LV5 4FG");
		v1.setTel(01111333345);
		v1.setEmail("Example@gmail.com");

		Customer c1 = new Customer();
		c1.setName("Esh");
		c1.setAddress_line_1("112");
		c1.setAddress_line_2("Oxford Road");
		c1.setCity("Harrow");
		c1.setZipcode("HA1 1FG");
		c1.setTel(0115553433);
		c1.setEmail("test@gmail.com");

		// t2.addCustomers(c1);

		// Ticketrepo.save(t1);

		Customer c2 = new Customer();
		c2.setName("Kar");
		c2.setAddress_line_1("132");
		c2.setAddress_line_2("Durby Lane Road");
		c2.setCity("Durby");
		c2.setZipcode("DR3 3PF");
		c2.setTel(0112153433);
		c2.setEmail("kar@github.com");

		// c2.addTicket(t3);

		// Ticketrepo.save(t3);
		// 3 tickets

		Ticket t1 = new Ticket();
		t1.setTicketName("Leicester ground");
		t1.setTicketPrice(100.00);
		v1.addTicket(t1);
		c1.addTicket(t1);
		// Customerrepo.save(c1);
		Ticket t2 = new Ticket();
		t2.setTicketName("Leicester ground");
		t2.setTicketPrice(100.00);
		c2.addTicket(t2);
		v1.addTicket(t2);// vendor Added

		Ticket t3 = new Ticket();
		t3.setTicketPrice(100.00);
		t3.setTicketName("Leicester ground");
		c2.addTicket(t3);
		v1.addTicket(t3);
		// ticket repo.save for 2 tickets
		Vendorrepo.save(v1);
		// Customerrepo.save(c2);

		// 3 payments
		Payment p1 = new Payment();
		Payment p2 = new Payment();
		Payment p3 = new Payment();

		p1.setCardnumber(234354343);// card number
		p1.setPaymentDate(LocalDate.of(2021, 12, 12));
		p1.setTicket_price(200.00);
		p1.setTicket(t1);
		// t1.setPayment(p1);
		Paymentrepo.save(p1);
		// Ticketrepo.save(t1);

		p2.setCardnumber(234254343);
		p2.setPaymentDate(LocalDate.of(2021, 02, 12));
		p2.setTicket_price(300.00);

		// asigning ticket to payment
		p2.setTicket(t2);

		// asinging payment to ticket
		// t2.setPayment(p2);

		Paymentrepo.save(p2);
		// Ticketrepo.save(t2);

		p3.setCardnumber(234344343);
		p3.setPaymentDate(LocalDate.of(2021, 11, 12));
		p3.setTicket_price(100.00);
		p3.setTicket(t3);
		// t3.setPayment(p3);

		Paymentrepo.save(p3);
		// Ticketrepo.save(t3);

		// 2 customers

	}

}
