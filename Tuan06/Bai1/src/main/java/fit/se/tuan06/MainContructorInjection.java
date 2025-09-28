package fit.se.tuan06;

import fit.se.tuan06.ContructorInjection.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainContructorInjection {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beansContructorInjection.xml");
        Student student = context.getBean("student3", fit.se.tuan06.ContructorInjection.Student.class);
        System.out.println(student);
    }
}
