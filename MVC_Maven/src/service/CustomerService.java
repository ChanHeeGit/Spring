package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customerMap; // 키와 밸류를 가지고 있는 자료구조 Map
	                                           // 배열을 다 돌 필요가 없이 키 값을 통해서 쉽게 밸류를 찾을 수 있다.
	
	public CustomerService() {
		
		customerMap = new HashMap<String, Customer> ();
		
		addCustomer( new Customer("id001", "alice", "alice.hansung.ac.kr"));
		addCustomer( new Customer("id002", "bob", "bob.hansung.ac.kr"));
		addCustomer( new Customer("id003", "chch", "chch.hansung.ac.kr"));
		addCustomer( new Customer("id004", "chan", "chan.hansung.ac.kr"));
		addCustomer( new Customer("id005", "hee", "hee.hansung.ac.kr"));
	}

	private void addCustomer(Customer customer) {
		
		customerMap.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id) { // 한명의 고객 조회
		if(id!=null)
			return (customerMap.get(id.toLowerCase()));
		else
			return null;
	}
	
	public List<Customer> getAllCustomer(){ // 모든 고객 조회
		
		List<Customer> customerList = new ArrayList<Customer>(customerMap.values()); //Customer 객체에 대한 ArrayList를 만듦, 모든 밸류값을 가져와 리턴해준다
		return customerList;
	}
}
