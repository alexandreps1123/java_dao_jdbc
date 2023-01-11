package model.dao;

import model.dao.impl.SellerDAOJDBC;

public class DAOFactory {

    public static SellerDAO creatSellerDAO() {
        return new SellerDAOJDBC();
    }
    
}
