package de.xdevsoftware.payment.controller;

import de.xdevsoftware.payment.DataRoot;

import de.xdevsoftware.payment.domain.Customer;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import one.microstream.enterprise.cluster.nodelibrary.common.ClusterStorageManager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller()
public class ExampleController
{
	private final ClusterStorageManager<DataRoot> storage;
	
	public ExampleController(final ClusterStorageManager<DataRoot> storage)
	{
		this.storage = storage;
	}

	@Get
	public HttpResponse<List<Customer>> findAll() {
		return HttpResponse.ok(this.storage.root().get().getCustomers());
	}

	@Get("create")
	public String root()
	{
		final DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		final Customer customer = Customer.New("Sebastian", "Späth", LocalDateTime.now().format(df));

		this.storage.root().get().getCustomers().add(customer);
		this.storage.store(this.storage.root().get().getCustomers());

		return "customer created";
	}
}
