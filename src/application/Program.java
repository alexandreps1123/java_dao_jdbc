package application;

import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        
        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

        Seller seller = sellerDAO.findById(3);

        System.out.println("\n------------TESTE 1-------------");
        System.out.println(seller);

        System.out.println("\n------------TESTE 2-------------");
        Department dep = new Department(2, null);
        List<Seller> sellerList = sellerDAO.findByDepartment(dep);

        for (Seller obj: sellerList) {
            System.out.println(obj);
        }

        System.out.println("\n------------TESTE 3-------------");
        sellerList = sellerDAO.findAll();
        for (Seller obj: sellerList) {
            System.out.println(obj);
        }

        System.out.println("\n------------TESTE 4-------------");
        Seller newSeller = new Seller(null, "EU", "eu@email.com", new Date(), 4000.0, dep);

        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id: " + newSeller.getId());

        System.out.println("\n------------TESTE 4-------------");
        seller = sellerDAO.findById(1);

        seller.setName("Wanna Wanna");

        sellerDAO.update(seller);
        System.out.println("UpdateCompleted!");
    }
}
