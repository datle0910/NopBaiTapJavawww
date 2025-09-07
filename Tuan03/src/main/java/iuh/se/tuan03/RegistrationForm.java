package iuh.se.tuan03;

import iuh.se.tuan03.entity.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/registration-form")
public class RegistrationForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegistrationForm() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("server at:").append(req.getContextPath());
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String date = req.getParameter("dateofbirth");
        LocalDate dateOfBirth = LocalDate.parse(date);
        String email = req.getParameter("email");
        String mobilenum = req.getParameter("mobilenum");
        String gender = req.getParameter("radioGender");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String pincode = req.getParameter("pincode");
        String state = req.getParameter("state");
        String country = req.getParameter("country");
        String[] hobbiesArray = req.getParameterValues("hobies"); // Lấy tất cả checkbox được chọn
        String hobbies = "";
        if (hobbiesArray != null) {
            hobbies = String.join(", ", hobbiesArray);  // Chuyển mảng thành chuỗi phân cách bằng dấu phẩy
        }

        String courseaplies = req.getParameter("aplies");

        Student st = new Student();
        st.setFirstName(firstname);
        st.setLastName(lastname);
        st.setDateOfBirth(dateOfBirth);
        st.setEmail(email);
        st.setPhone(mobilenum);
        st.setGender(gender);
        st.setAddress(address);
        st.setCity(city);
        st.setPincode(pincode);
        st.setState(state);
        st.setCountry(country);
        st.setHobbies(hobbies);
        st.setCourseApplies(courseaplies);

        req.setAttribute("student",st);

        RequestDispatcher rd = req.getRequestDispatcher("result-form.jsp");
        rd.forward(req,resp);
    }
}
