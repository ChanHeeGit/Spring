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
		
		addCustomer( new Customer("chanhee", "123123"));
		addCustomer( new Customer("chanhee2", "123123123"));
		
	}
	private void addCustomer(Customer customer) {
		
		customerMap.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id) {
		if(id!=null)
			return(customerMap.get(id.toLowerCase()));
		else
			return null;
	}
	public Customer Authenticate(String id, String pw){
		Customer customer = findCustomer(id)
		if(customer!=null) {
		if(customerMap.get(id).getPw().equals(pw)) {
			return (customerMap.get(id.toLowerCase()));
		}else
			return null;
	}
	else return null;	
}

}
