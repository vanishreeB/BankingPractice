package com.luv2code.springDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lov2code.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
	
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> query = session.createQuery("from Customer" , Customer.class);
		List<Customer> customers = query.getResultList();			
		
		return customers	;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session Currentsession =sessionFactory.getCurrentSession();
		
		Currentsession.saveOrUpdate(theCustomer);
		
		
	}

	@Override
	public Customer getCustomer(int theId) {
		Session Currentsession =sessionFactory.getCurrentSession();
		Customer customer = Currentsession.get(Customer.class, theId);
		return customer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session Currentsession =sessionFactory.getCurrentSession();
		Query q = Currentsession.createQuery("delete from Customer where id = : customerId")
				.setParameter("customerId", theId);
		q.executeUpdate();
	
	}

}
