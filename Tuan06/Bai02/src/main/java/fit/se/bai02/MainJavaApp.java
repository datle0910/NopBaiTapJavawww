package fit.se.bai02;

import fit.se.bai02.Entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppJavaConfig.class);

        Employee emp = context.getBean(Employee.class);
        System.out.println("Java-based config: " + emp);
    }
}
