package iuh.se.tuan03.Bai4Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartItemBean {
    private Product product;
    private int quantity;
    public double getTotalCost(){
        return product.getPrice()*quantity;
    }
}

