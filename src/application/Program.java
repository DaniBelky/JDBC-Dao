package application;

import java.sql.Date;

import ModelsEntities.Department;
import ModelsEntities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Department obg = new Department(1, "books");
		
		Seller seller = new Seller(21,"Bob","bob@gmail", new Date(), 3000.0, obg);
		System.out.println(seller);
		
		
	}
}
