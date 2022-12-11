import java.util.ArrayList;

public class ShoppingList {
    public Product product;
    ArrayList<Product> shoppingList = new ArrayList<Product>();

    public void add(Product product) {
        shoppingList.add(product);
    }

    public int total() {
        int sum = 0;
        for (Product product : shoppingList) {
            sum++;
        }
        return sum;
    }

    public String toString() {
        String list = "" ;
        for (Product product : shoppingList) {
            list += product.getName()+",";
        }
        return list.substring(0,list.length()-1);
    }
}
