package fit.se.bai02;

import fit.se.bai02.Entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee empSetter = context.getBean("employeeBeanSetter", Employee.class);
        System.out.println("Setter Injection: " + empSetter);

        Employee empConstructor = context.getBean("employeeBeanConstructor", Employee.class);
        System.out.println("Constructor Injection: " + empConstructor);
    }
}