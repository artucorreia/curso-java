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
        sellerDao.findAll().forEach(System.out::println);
        //        Seller seller = sellerDao.findById(11);
//        seller.setName("test");
//        sellerDao.update(seller);

//        List<Seller> sellerList = sellerDao.findAll();
//        sellerList.forEach(System.out::println);
        Dao<Department> departmentDao = DaoFactory.createDepartmentDao();
        Department department = departmentDao.findById(10);
//        System.out.println(department);
//        departmentDao.insert(new Department(null, "test"));
        department.setName("hugo");
        departmentDao.update(department);
        System.out.println(departmentDao.findAll());
    }
}