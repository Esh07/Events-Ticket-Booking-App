package co2013.hw2.controller;

<<<<<<< HEAD
public class DeleteController {

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co2103.hw2.repos.CustomerRepository;
import co2103.hw2.repos.TicketRepository;
import co2103.hw2.repos.VendorRepository;
import co2103.hw2.repos.PaymentRepository;

public class DeleteController {
	
	@Autowired
	private TicketRepository Ticketrepo;
	

	
	@Autowired
	private CustomerRepository Customerrepo;
	
	@Autowired
	private VendorRepository Vendorrepo;
	
	@Autowired
	private PaymentRepository Paymentrepo;
	
	
	
	@GetMapping("/deleteTicket")
	public String deleteTicket(@RequestParam int id) {
		if (Ticketrepo.findById(id).isPresent()) {
			Ticketrepo.delete(Ticketrepo.findById(id).get());
		}
		return "redirect:/list";
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam int id) {
		if (Customerrepo.findById(id).isPresent()) {
			Customerrepo.delete(Customerrepo.findById(id).get());
		}
		return "redirect:/list";
	}
	
	@GetMapping("/deleteVendor")
	public String deleteVendor(@RequestParam int id) {
		if (Vendorrepo.findById(id).isPresent()) {
			Vendorrepo.delete(Vendorrepo.findById(id).get());
		}
		return "redirect:/list";
	}
	
	@GetMapping("/deletePayment")
	public String deletePayment(@RequestParam int id) {
		if (Paymentrepo.findById(id).isPresent()) {
			Paymentrepo.delete(Paymentrepo.findById(id).get());
		}
		return "redirect:/list";
	}
>>>>>>> 0ed0e509386fbb98c11af5b4321adc38b26b8729
}
