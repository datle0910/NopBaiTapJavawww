package fit.se.bai02;

import fit.se.bai02.Entity.Address;
import fit.se.bai02.Entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppJavaConfig {
    @Bean
    public Address address(){
        return new Address("Da Nang", "Hai Chau", "Vietnam");
    }
    @Bean
    public Employee employee() {
        return new Employee(103, "Tran Van C", address());
    }

}
