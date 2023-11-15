
package com.cg.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.cg.entity.Customer;
import com.cg.repository.CustomerRepository;
 
@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	public List<Customer> listAll(){
		List<Customer> customers=repo.findAll();
		System.out.println(customers);
		return customers;
	}
	
 
}
 