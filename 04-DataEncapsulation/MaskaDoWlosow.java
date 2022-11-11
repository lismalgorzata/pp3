public class MaskaDoWlosow {
    private String name;
    private String brand;
    private String mainComponent;
    private int capacity;
    private boolean hasSls;
    private boolean isPeh;

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public String getBrand() {
        return brand;}

    public void setBrand(String brand) {
        this.brand = brand;}

    public String getMainComponent() {
        return mainComponent;}

    public void setMainComponent(String mainComponent) {
        this.mainComponent = mainComponent;}

    public int getCapacity() {
        return capacity;}

    public void setCapacity(int capacity) {
        this.capacity = capacity;}

    public boolean getHasSls() {
        return hasSls;}

    public void setHasSls(boolean hasSls) {
        this.hasSls = hasSls;}

    public boolean getIsPeh() {
        return isPeh;}

    public void setIsPeh(boolean isPeh) {
        this.isPeh = isPeh;}

    public void displayInfo() {
        System.out.print("Mask name: "+name+" | ");
        System.out.println("Brand: "+brand+" | ");
        System.out.print("Main Component: "+mainComponent+" | ");
        System.out.println("Capacity: "+capacity+"ml"+ " | ");
        System.out.print("SLS: "+hasSls+" | ");
        System.out.println("PEH: "+isPeh);
    }
    public static void main(String[] args) {
        MaskaDoWlosow m = new MaskaDoWlosow();

        m.setName("Hair Food");
        m.setBrand("Garnier");
        m.setCapacity(1000);
        m.setHasSls(false);
        m.setIsPeh(true);
        m.setMainComponent("Banana");

        m.getName();
        m.getBrand();
        m.getMainComponent();

        m.displayInfo();

    }
}
