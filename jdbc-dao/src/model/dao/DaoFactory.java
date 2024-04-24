package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class DaoFactory {
    public static Dao<Department> createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
    public static Dao<Seller> createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
