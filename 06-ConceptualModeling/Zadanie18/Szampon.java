package Zadanie18;

public class Szampon {
    String name;
    String brand;
    private String serieNumber;
    String expirationDate;
    private String composition;
    boolean isOpen;

    public Szampon(String name, String brand, String expirationDate) {
        this.name = name;
        this.brand = brand;
        this.expirationDate = expirationDate;
    }

    public String getSerieNumber() {
        return serieNumber;
    }

    public void setSerieNumber(String serieNumber) {
        this.serieNumber = serieNumber;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public void Open() {
        this.isOpen = true;
    }

    public void Close() {
        this.isOpen = false;
    }

    public void WashHair() {
        System.out.println("Hair is washed");
    }

    public static void main(String[] args) {
        Szampon s1 = new Szampon("Szampon nawilżający", "Garnier", "2024-09-01");
        Szampon s2 = new Szampon("Szampon oczyszczający", "Pantene", "2025-01-01");

        s1.getSerieNumber();
        s1.getComposition();

        s1.Open();
        s1.Close();
        s1.WashHair();

        s2.getSerieNumber();
        s2.getComposition();

        s2.Open();
        s2.Close();
        s2.WashHair();
    }


}
