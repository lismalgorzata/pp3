import java.util.ArrayList;

public class ShoppingList {
    public Product product;
    ArrayList<Product> shoppingList = new ArrayList<Product>();
    public int countProduct = 0 ;

    public void add(Product product) {
        shoppingList.add(product);
        countProduct += product.getQuantity();
    }

    public int total() {
        return countProduct;
    }

    public String toString() {
        String list = "" ;
        for (Product product : shoppingList) {
            list += product.getName()+",";
        }
        return list.substring(0,list.length()-1);
    }

    public static void main(String[] args) {
        ShoppingList s1 = new ShoppingList();
        Product product1 = new Product("mango",6);
        Product product2 = new Product("japko", 6);

        s1.add(product1);
        s1.add(product2);

        System.out.println(s1.total());
        System.out.println(s1.toString());
    }
}
