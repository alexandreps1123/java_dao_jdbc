package application;

import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        
        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

        Seller seller = sellerDAO.findById(3);

        System.out.println(seller);

        Department dep = new Department(2, null);
        List<Seller> sellerList = sellerDAO.findByDepartment(dep);

        for (Seller seller2: sellerList) {
            System.out.println(seller2);
        }

    }
}
