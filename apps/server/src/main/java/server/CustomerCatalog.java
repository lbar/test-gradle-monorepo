package server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import shared.Customer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;


@Component
public class CustomerCatalog {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerCatalog.class);

	private Set<Customer> customers = new HashSet<>();


	@PostConstruct
	public void init() {
		customers.add(new Customer("BROWN", "Jack"));
		customers.add(new Customer("SMITH", "Paul"));

		LOGGER.info("Customers = {}", customers);
	}
}
