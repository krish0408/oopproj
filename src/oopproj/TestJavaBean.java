package oopproj;

import com.Item;

public class TestJavaBean {

	public static void main(String[] args) {
		
		Item item = new Item();
		item.setId(101);
		item.setName("iPhone");
		item.setPrice(300);
		
		System.out.println("Id : "+item.getId());
		System.out.println("Name : "+item.getName());
		System.out.println("Price: "+item.getPrice());
	}

}
