package application;

import model.dao.Dao;
import model.dao.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dao<Seller> sellerDao = DaoFactory.createSellerDao();
//        Seller seller = sellerDao.findById(11);
//        System.out.println(seller);
//        seller.setName("test");
//        sellerDao.update(seller);

//        List<Seller> sellerList = sellerDao.findAll();
//        sellerList.forEach(System.out::println);
        Dao<Department> departmentDao = DaoFactory.createDepartmentDao();
        Department department = departmentDao.findById(1);
        System.out.println(department);
        System.out.println(departmentDao.findAll());
    }
}