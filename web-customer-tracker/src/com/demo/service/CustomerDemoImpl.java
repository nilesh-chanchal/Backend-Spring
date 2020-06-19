package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.CustomerDao;
import com.demo.entity.Customer;

@Service
public class CustomerDemoImpl implements CustomerService {

	// need to inject customer dao
		@Autowired
		private CustomerDao customerDao;
		
		@Override
		@Transactional
		public List<Customer> getCustomers() {
			return customerDao.getCustomers();
		}

		@Override
		@Transactional
		public void saveCustomer(Customer theCustomer) {

			customerDao.saveCustomer(theCustomer);
		}

		@Override
		@Transactional
		public Customer getCustomer(int theId) {
			
			return customerDao.getCustomer(theId);
		}

		@Override
		@Transactional
		public void deleteCustomer(int theId) {
			
			customerDao.deleteCustomer(theId);
		}

}
