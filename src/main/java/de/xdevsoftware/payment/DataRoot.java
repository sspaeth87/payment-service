package de.xdevsoftware.payment;

import de.xdevsoftware.payment.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class DataRoot
{
	private final List<Customer> customers = new ArrayList<>();

	public List<Customer> getCustomers() {
		return this.customers;
	}
}
