package iuh.se.tuan03.Bai4Modal;

import java.util.ArrayList;

public class CartBean {
    private ArrayList<CartItemBean> items;
    public CartBean(){
        this.items = new ArrayList<>();
    }
    public ArrayList<CartItemBean> getItems(){
        return items;
    }
    public void addItem(Product product){
        for(int i = 0 ; i< items.size();i++){
            if(items.get(i).getProduct().getId() == product.getId()){
                items.get(i).setQuantity(items.get(i).getQuantity()+product.getQuantity());
                return;
            }
        }
        items.add(new CartItemBean(product,1));
    }
    public void removeItem(int productID){
        for(int i = 0 ; i< items.size();i++){
            if(items.get(i).getProduct().getId()==productID){
                items.remove(i);
            }
        }
    }
    public void updateItem(int productId, int quantity){
        for(int i = 0 ; i< items.size();i++){
            if(items.get(i).getProduct().getId() ==productId){
                if(quantity > 0){
                    items.get(i).setQuantity(quantity);
                    return;
                }else{
                    removeItem(productId);
                    return;
                }
            }
        }
    }
    public double CostTotal(){
        double sum = 0;
        for(CartItemBean item : items){
            sum += item.getTotalCost();
        }
        return sum;
    }
    public void clear(){
        items.clear();
    }

}
