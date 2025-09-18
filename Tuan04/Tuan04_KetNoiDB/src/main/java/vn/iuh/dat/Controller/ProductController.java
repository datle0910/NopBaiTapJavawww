package vn.iuh.dat.Controller;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iuh.dat.DAO.DAOImpl.ProductDAOImpl;
import vn.iuh.dat.DAO.ProductDAO;

import javax.sql.DataSource;
import java.io.IOException;

@WebServlet(name = "productController",urlPatterns = {"/products"})
public class ProductController extends HttpServlet {
    @Resource(name = "jdbc/shopping")
    private DataSource dataSource;
    private ProductDAO productDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.productDAO = new ProductDAOImpl(this.dataSource);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", this.productDAO.findAll());
        req.getRequestDispatcher("/views/product.jsp").forward(req,resp);
    }
}
