package fit.se.tuan06.ContructorInjection;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Student {
    private long id;
    private String name;
    private Class3 classStu;
    public Student(long id, String name, Class3 classStu) {
        this.id = id;
        this.name = name;
        this.classStu = classStu;
    }
}
