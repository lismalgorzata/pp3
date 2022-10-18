public class Student {
    
    //wykaz atrybutów
    String name;
    int age; 
    String studentIdCard;
    boolean isValid=false;
    int semester;
    double averageGrade;
    
    //wykaz metod
    public void sayHello() {
        System.out.println("Hello");
    }
    public void displayName() {
        System.out.println("Name: "+name);
    }
    public void displayAge() {
        System.out.println("Age: "+age);
    }
    
    public void displayPersonalInformations() {
        System.out.print(name + " | ");
        System.out.print("Semester: " + semester + " | ");
        System.out.println("Average grade: " + averageGrade);
    }
    
    public void cardValidation() {
        isValid = !isValid;
    }

    public void displayStudentInformations() {
        System.out.print(name +" | ");
        System.out.print("Student ID Number: " + studentIdCard + " | ");
        if (isValid) {
            System.out.println("ID Card is valid");
        } else {
            System.out.println("Card is invalid");
        }
    }
    
    public static void main(String[] args) {
        Student student1 = new Student();
        
        student1.name= "Małgosia";
        student1.age= 20;
        student1.semester=3;
        student1.isValid=true;
        student1.studentIdCard="222287";
        student1.averageGrade=4.28;
        
        student1.displayPersonalInformations();
        student1.displayStudentInformations();
        student1.cardValidation();
        student1.displayStudentInformations();
        
    }
    
}
