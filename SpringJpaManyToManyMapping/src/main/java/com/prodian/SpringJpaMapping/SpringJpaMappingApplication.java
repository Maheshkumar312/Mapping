package com.prodian.SpringJpaMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prodian.SpringJpaMapping.Repository.CustomerRepository;
import com.prodian.SpringJpaMapping.Repository.ItemRepository;
import com.prodian.SpringJpaMapping.entity.Customer;
import com.prodian.SpringJpaMapping.entity.Item;

@SpringBootApplication
public class SpringJpaMappingApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;
	 @Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer("Tom");

		Item item1 = new Item("Item1");
		Item item2 = new Item("Item2");

		customer.getItems().add(item1);
		customer.getItems().add(item2);

		/*
		 * item1.setCustomer(customer); item2.setCustomer(customer);
		 */

		customerRepository.save(customer);

	}

}
