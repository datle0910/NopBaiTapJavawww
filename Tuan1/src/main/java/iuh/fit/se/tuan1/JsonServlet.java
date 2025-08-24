package iuh.fit.se.tuan1;

import com.fasterxml.jackson.databind.ObjectMapper;
import iuh.fit.se.tuan1.Entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user-json")
public class JsonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user1 = new User("le van dat","dat@gmail.com");
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(user1);
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        writer.println(jsonString);
        writer.flush();
    }
}
