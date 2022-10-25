public class SurfaceArea
{
    
    public static double circleSurfaceArea(int radius){
        return 3.14*radius*radius;
    }
    
    public static double rectangleSurfaceArea(int rectangleWidth, int rectangleLenght){
        return rectangleWidth*rectangleLenght;
    }
    
    public static double triangleSurfaceArea(int triangleBase, int triangleHeight) {
        return 0.5*triangleBase*triangleHeight;
    }
    
    public static void main(String[] args){
        double areaRectangle = rectangleSurfaceArea(4,5);
        double areaCircle = circleSurfaceArea(3);
        double areaTriangle = triangleSurfaceArea(3,4);
        
        System.out.println(areaRectangle);
        System.out.println(areaCircle);
        System.out.println(areaTriangle);
    }
}
