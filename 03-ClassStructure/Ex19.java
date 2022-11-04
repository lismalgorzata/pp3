import java.util.Arrays;
import java.util.Scanner;

public class Ex19 {

    public static class StudentGrades {
        String studentName;
        int numberOfGrades;
        double[] grades;

        StudentGrades(String name, int numberOfGrades) {
            this.studentName = name;
            grades = new double[numberOfGrades];

            for (int i = 0 ; i < numberOfGrades ; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a grade: ");

                String grade = scanner.nextLine();
                grades[i] = Double.valueOf(grade);
            }

        }

        public double lowestGrade() {
            double lowest[] = grades;
            Arrays.sort(lowest);
            return lowest[0];
        }

        public double highestGrade() {
            double highest[] = grades;
            Arrays.sort(highest);
            return highest[highest.length - 1];
        }

        public int numOfGrades() {
            return grades.length;
        }

        public double gradeAverage() {
            double sum = 0;
            for (double grade : grades) //for each
                sum=sum + grade;
            return sum/grades.length ;
        }

        public void displayStudentInfo() {
            System.out.println("Student name: "+ studentName);
            System.out.println("Grades: " + Arrays.toString(grades));
            System.out.print("Number of grades: "+ numOfGrades() + " | ");
            System.out.print("Lowest grade: "+ lowestGrade() + " | ");
            System.out.print("Highest grade: " + highestGrade() + " | ");
            System.out.println("Average grade: " + gradeAverage() + " | ");
        }

        public static void main(String[] args){
            StudentGrades s1 = new StudentGrades("Amanda", 5);
            StudentGrades s2 = new StudentGrades("James" , 4);

            s1.displayStudentInfo();
            s2.displayStudentInfo();

        }
    }
}

