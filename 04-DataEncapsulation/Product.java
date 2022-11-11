public class Product {
    private String name;
    private boolean isVege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsVege() {
        return isVege;
    }

    public void setIsVege(boolean isVege) {
        this.isVege = isVege;
    }

    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setName("Kredki");
        p1.getName();
    }

}
