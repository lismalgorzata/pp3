package Zadanie17;

public class Seller {
    String sellerId;
    String name;
    String city;

    public Seller(String sellerId, String name, String city) {
        this.sellerId = sellerId;
        this.name = name;
        this.city = city;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void sellProduct(String productId) {

    }

    public void orderSupplies(String productId) {

    }

    public void checkSupplies(String productId) {

    }

}
