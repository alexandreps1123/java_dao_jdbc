package application;

import java.util.Date;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        
        Department dep = new Department(1, "Booka");

        Seller seller = new Seller(21, "Bob", "bob@email.com", new Date(), 3000.0, dep);

        SellerDAO sellerDAO = DAOFactory.creatSellerDAO();

        System.out.println(sellerDAO);

        System.out.println(dep);

        System.out.println(seller);
    }
}
