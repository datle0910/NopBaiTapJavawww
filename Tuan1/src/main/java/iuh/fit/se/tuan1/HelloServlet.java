package iuh.fit.se.tuan1;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
//
//@WebServlet(name = "helloServlet",
//            urlPatterns = {"/hello","/hellolevandat"},
//            initParams = {
//                @WebInitParam(name = "username",value = "levandat"),
//                    @WebInitParam(name = "mssv",value = "22001605")
//        }
//            )
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1> Param trong servlet" + this.getServletConfig().getInitParameter("hoten") + "</h1>");
        out.println("<h1> Param trong app" + this.getServletContext().getInitParameter("appName") + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}