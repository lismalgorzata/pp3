package Zadanie17;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("123", "Maciek12","Kraków");
        Seller s = new Seller("12120987", "Jacex","Kraków");
        Product p = new Product("0098", "Dysk SSD", 100.99);

        c.orderProduct("0098");
        c.returnProduct("0098");

        s.sellProduct("0098");
        s.orderSupplies("0098");

        p.getName();
        p.getPrice();
    }
}

