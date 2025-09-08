package iuh.se.tuan03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/signup-bai2")
public class signup extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/users";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "rootpassword";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String reemail = request.getParameter("reemail");
        String password = request.getParameter("password");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");

        response.setContentType("text/html;charset=UTF-8");

        // Kiểm tra email khớp
        if (!email.equals(reemail)) {
            response.getWriter().println("Email không trùng khớp!");
            return;
        }

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);

            String sql = "INSERT INTO users (first_name, last_name, email, password, birthday, gender) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setDate(5, Date.valueOf(birthday)); // yyyy-MM-dd
            ps.setString(6, gender);

            int row = ps.executeUpdate();
            if (row > 0) {
                response.getWriter().println("Đăng ký thành công!");
            } else {
                response.getWriter().println("Đăng ký thất bại!");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Lỗi: " + e.getMessage());
        }
    }
}
