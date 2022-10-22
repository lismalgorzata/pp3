public class Rectangle {
    double length;
    double width;
    double surfaceArea;
    double perimeter;

    public void displayRectangleInfo(){
        System.out.println("Dimensions: "+length+" x "+width);
        System.out.println("Surface area: "+(length*width));
        System.out.println("Perimeter: "+(2*length + 2*width));
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.length=3;
        rectangle1.width=4;
        rectangle1.displayRectangleInfo();

        rectangle2.length=2;
        rectangle2.width=7;
        rectangle2.displayRectangleInfo();
    }
}
