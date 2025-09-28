package fit.se.tuan06.EntitySetterObjectInjection;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private long id;
    private String name;
    private Class classStu;
}
