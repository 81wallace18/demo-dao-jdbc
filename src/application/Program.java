package application;

import java.text.ParseException;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(12, "Wallace", "wallace@gmail.com", new Date(), 1200.0, obj);
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}
}
