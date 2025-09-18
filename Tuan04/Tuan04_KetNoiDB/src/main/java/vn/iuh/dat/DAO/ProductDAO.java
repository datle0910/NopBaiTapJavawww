package vn.iuh.dat.DAO;

import vn.iuh.dat.Entity.Product;

import java.util.List;

public interface ProductDAO {
    public List<Product> findAll();
}
