package co2013.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co2103.hw2.repos.CustomerRepository;
import co2103.hw2.repos.PaymentRepository;
import co2103.hw2.repos.TicketRepository;
import co2103.hw2.repos.VendorRepository;

@Controller
public class ListController {
	@Autowired
	CustomerRepository Customerrepo;
	
	@Autowired
	TicketRepository Ticketrepo;
	@Autowired
	PaymentRepository Paymentrepo;
	@Autowired
	VendorRepository Vendorrepo;
	
	
	
	@GetMapping("/list")
	public String alltables(Model model) {
		model.addAttribute("vendors", Vendorrepo.findAll());
		model.addAttribute("Customer", Customerrepo.findAll());

		model.addAttribute("Ticket", Ticketrepo.findAll());

		model.addAttribute("Payment", Paymentrepo.findAll());
		return "list";
	}
	

}
