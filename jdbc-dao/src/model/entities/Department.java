package model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department implements Serializable {
    private Integer id;
    private String name;
    private List<Seller> sellerList = new ArrayList<>();

    public Department() { }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addSeller(Seller seller) {
        sellerList.add(seller);
    }

    public void removeSellerById(int id) {
        sellerList.remove(id);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
