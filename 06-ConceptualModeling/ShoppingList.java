import java.util.*;
public class ShoppingList {

    private ArrayList<String> products = new ArrayList<String>();

    void showShoppingList(){
        System.out.println("Shopping list:");
        for (String product : products){
            System.out.println("Product: " + product);
        }
    }

    void productsNumber(){
        System.out.println("Number of products on the list: " + products.size());
    }

    void addProduct(String product){
        products.add(product);
    }

    public static void main(String[] args) {
        ShoppingList sl = new ShoppingList();
        sl.showShoppingList();
        sl.productsNumber();
        sl.addProduct("apple");
        sl.addProduct("banana");
        sl.addProduct("grapes");
        sl.showShoppingList();
        sl.productsNumber();
        sl.addProduct("cucumber");
        sl.showShoppingList();
        sl.productsNumber();
    }
}
