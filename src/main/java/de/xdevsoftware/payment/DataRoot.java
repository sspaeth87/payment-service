package de.xdevsoftware.payment;

import de.xdevsoftware.payment.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class DataRoot
{
	private List<Customer> customers;

	public List<Customer> getCustomers() {
		if(this.customers == null) {
			this.customers = new ArrayList<>();
		}

		return this.customers;
	}
}
