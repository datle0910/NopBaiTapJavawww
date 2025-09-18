package iuh.se.tuan03.Bai4Controller;

import iuh.se.tuan03.Bai4Modal.Product;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;

@WebServlet({"/products", "/product"})
public class ProductServlet extends HttpServlet {
    private ProductDAO productDAO;
    @Resource(name = "jdbc/shopdb")
    private DataSource dataSource;

    @Override
    public void init(){
        productDAO = new ProductDAO(dataSource);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idstr = req.getParameter("id");
        if(idstr == null){
            int id = Integer.parseInt(idstr);
            Product product = productDAO.getProduct(id);
            if(product != null){
                req.setAttribute("product", product);
                RequestDispatcher dispatcher = req.getRequestDispatcher("/product/Bai4product-detail.jsp");
                dispatcher.forward(req,resp);
            }else {
                resp.sendError(HttpServletResponse.SC_NOT_FOUND,"product not found");
                return;
            }
            List<Product> products = productDAO.getAllItems();
            req.setAttribute("products", products);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/product/Bai4product-detail.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
