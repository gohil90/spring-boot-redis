package com.gohil90.learning.redis.repository;

import com.gohil90.learning.redis.enitity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
