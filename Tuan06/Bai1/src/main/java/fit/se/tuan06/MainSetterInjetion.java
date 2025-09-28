package fit.se.tuan06;

import fit.se.tuan06.EntitySetterInjetion.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetterInjetion {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansSetterInjetion.xml");
        Student student = context.getBean("student1",Student.class);
        System.out.println(student);

    }
}
