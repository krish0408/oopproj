package oopproj;

import java.time.LocalDate;

import com.Customer;

public class TestCustomer {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("Hary");
		customer.setEmail("hary@mail.com");
		customer.setDob(LocalDate.of(1990, 3, 10));
		
		System.out.println("Id   : "+customer.getId());
		System.out.println("Name : "+customer.getName());
		System.out.println("Email: "+customer.getEmail());
		System.out.println("Dob  : "+customer.getDob());
	}

}
