package model.dao;

import java.util.List;

public interface Dao<T> {
    void insert(T obj);
    void update(T obg);
    void delete(int id);
    T findById(int id);
    List<T> findAll();
}
