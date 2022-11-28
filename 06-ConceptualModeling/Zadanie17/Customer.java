package Zadanie17;

public class Customer {
    String customerId;
    String name;
    String city;

    public Customer(String customerId, String name, String city) {
        this.customerId = customerId;
        this.name = name;
        this.city = city;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public void orderProduct(String productId) {

    }

    public void returnProduct(String productId) {

    }
}
