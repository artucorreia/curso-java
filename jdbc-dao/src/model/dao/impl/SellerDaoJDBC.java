package model.dao.impl;

import db.DB;
import model.dao.Dao;
import model.entities.Seller;

import java.sql.PreparedStatement;
import java.util.List;

public class SellerDaoJDBC implements Dao<Seller> {
    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obg) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Seller findById(int id) {
//        select s.*, d.Name from seller s , department d where s.DepartmentId = d.Id;
//        PreparedStatement preparedStatement = DB.getConnection().prepareStatement();
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
