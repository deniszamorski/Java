package com.mma.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mma.business.Invoice;
import com.mma.business.JsonResponse;
import com.mma.business.Product;
import com.mma.db.InvoiceRepository;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

	@Autowired
	private InvoiceRepository invoiceRepo;
	
	@GetMapping("/")
	public JsonResponse getAll() {
		JsonResponse jr = null;
		try {
			jr = JsonResponse.getInstance(invoiceRepo.findAll());
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}

	@GetMapping("/{id}")
	public JsonResponse get(@PathVariable int id) {
		JsonResponse jr = null;
		try {
			Optional<Invoice> p = invoiceRepo.findById(id);
			if (p.isPresent())
				jr = JsonResponse.getInstance(p);
			else
				jr = JsonResponse.getInstance("No product found for id: " + id);
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	@PostMapping("/")
	public JsonResponse add(@RequestBody Invoice p) {
		JsonResponse jr = null;
		// NOTE: May need to enhance exception handling if more than one exception type needs to be caught
		try {
			jr = JsonResponse.getInstance(invoiceRepo.save(p));
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	@PutMapping("/")
	public JsonResponse update(@RequestBody Invoice p) {
		JsonResponse jr = null;
		// NOTE: May need to enhance exception handling if more than one exception type needs to be caught
		try {
			if (invoiceRepo.existsById(p.getId())) {
				jr = JsonResponse.getInstance(invoiceRepo.save(p));
			}
			else {
				jr = JsonResponse.getInstance("Invoice id: " +p.getId()+"does not extist and you are"
						+"attempting to save it");
			}
		} catch (Exception e) {
			e.printStackTrace();
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	@DeleteMapping("/")
	public JsonResponse delete(@RequestBody Invoice p) {
		JsonResponse jr = null;
		// NOTE: May need to enhance exception handling if more than one exception type needs to be caught
		try {
			if (invoiceRepo.existsById(p.getId())) {
				invoiceRepo.delete(p);
				jr = JsonResponse.getInstance("Invoice deleted");
			}
			else {
				jr = JsonResponse.getInstance("Invoice id: " +p.getId()+"does not extist and you are"
						+"attempting to save it");
			}
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
}
