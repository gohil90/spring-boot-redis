package com.gohil90.learning.redis;

import com.gohil90.learning.redis.enitity.Customer;
import com.gohil90.learning.redis.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRedisApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	void loadNewCustomer() {
		Customer customer = new Customer(87654321L, "CUE-osdngisud876",
				"Nilesh", Customer.Segment.PSB);
		customerRepository.save(customer);
	}

	@Test
	void readCustomer() {
		Customer customer = customerRepository.findById(12345678L).orElse(null);
		System.out.println(customer);
	}

}
