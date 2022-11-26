import java.util.*;
public class Ex16 {

    private ArrayList<String> products = new ArrayList<String>();

    public void showShoppingList(){
        System.out.println("Shopping list:");
        for (String product : products){
            System.out.println("Product: " + product);
        }
    }

    public void productsNumber(){
        System.out.println("Number of products on the list: " + products.size());
    }

    public void addProduct(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new product");
        String product = keyboard.next();
        products.add(product);
    }

    public static void main(String[] args) {
        Ex16 sl = new Ex16();
        sl.showShoppingList();
        sl.productsNumber();
        sl.addProduct();
        sl.addProduct();
        sl.addProduct();
        sl.showShoppingList();
        sl.productsNumber();
        sl.addProduct();
        sl.showShoppingList();
        sl.productsNumber();
    }
}


