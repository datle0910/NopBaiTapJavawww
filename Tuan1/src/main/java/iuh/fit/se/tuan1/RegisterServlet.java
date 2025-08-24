package iuh.fit.se.tuan1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "registerServlet",urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Register Info");
        writer.println("Firstname :" + req.getParameter("firstname"));
        writer.println("Lastname :" + req.getParameter("lastname"));
        writer.println("username :" + req.getParameter("username"));
        writer.println("email :" + req.getParameter("email"));
        writer.println("password :" + req.getParameter("password"));
        writer.println("facebook :" + req.getParameter("facebook"));
        writer.println("shortbio :" + req.getParameter("shortbio"));
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Register Info");
        writer.println("Firstname :" + req.getParameter("firstname"));
        writer.println("Lastname :" + req.getParameter("lastname"));
        writer.println("username :" + req.getParameter("username"));
        writer.println("email :" + req.getParameter("email"));
        writer.println("password :" + req.getParameter("password"));
        writer.println("facebook :" + req.getParameter("facebook"));
        writer.println("shortbio :" + req.getParameter("shortbio"));
        writer.close();

    }
}
