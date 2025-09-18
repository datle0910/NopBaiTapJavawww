package iuh.se.tuan03.Bai4Controller;

import iuh.se.tuan03.Bai4Modal.Product;
import org.mariadb.jdbc.Connection;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private DBUtil dbUtil;

    public ProductDAO(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    public ProductDAO(DataSource dataSource) {
        dbUtil = new DBUtil(dataSource);
    }

    public ArrayList<Product> getAllItems() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select * from products";
        try (Connection con = dbUtil.getConnection();
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery(sql);

        ) {
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String modal = rs.getString("modal");
                String description = rs.getString("description");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                String url = rs.getString("url");
                Product p = new Product(id, name, modal, description, quantity, price, url);
                list.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public Product getProduct(Integer id) {
        String sql = "select * from product where id = ?";
        try (Connection con = dbUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                String modal = rs.getString("modal");
                String description = rs.getString("description");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                String url = rs.getString("url");
                Product p = new Product(id, name, modal, description, quantity, price, url);
                return p;
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }
}
