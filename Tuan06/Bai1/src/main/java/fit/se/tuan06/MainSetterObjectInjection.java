package fit.se.tuan06;

import fit.se.tuan06.EntitySetterObjectInjection.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetterObjectInjection {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beansSetterObjectInjection.xml");
        Student student = context.getBean("student2", Student.class);
        System.out.println(student);
    }
}
