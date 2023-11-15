
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
	public void save(Customer customer) {
			repo.save(customer);
		}
		public void delete(Long id) {;
			repo.deleteById(id);
		}
		public Customer get(Long id) {
			
			return repo.findById(id).get();
		}
 
}
 