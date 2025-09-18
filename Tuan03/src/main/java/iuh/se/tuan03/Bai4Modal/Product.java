package iuh.se.tuan03.Bai4Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private int id;
    private String name;
    private String modal;
    private String description;
    private int quantity;
    private double price;
    private String url;

}
