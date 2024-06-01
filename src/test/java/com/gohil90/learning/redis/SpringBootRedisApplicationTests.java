package com.gohil90.learning.redis;

import com.gohil90.learning.redis.cache.CustomerCacheService;
import com.gohil90.learning.redis.cache.ItemCacheService;
import com.gohil90.learning.redis.enitity.Customer;
import com.gohil90.learning.redis.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRedisApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerCacheService customerCacheService;

	@Autowired
	private ItemCacheService itemCacheService;

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

	@Test
	void readAllCustomer() {
		Iterable<Customer> customers = customerRepository.findAll();
		System.out.println(customers);
	}

	@Test
	void getCustomerHashCode() {
		System.out.println(customerCacheService.getCustomerCode(87654321L));
		System.out.println(customerCacheService.getCustomerCode(12345678L));
	}

	@Test
	void getItem100() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			System.out.println(itemCacheService.fetchItem((i + 1) + ""));
			// Thread.sleep((int) (Math.random() * 100 * 1000));
		}
	}

}
