import java.util.Arrays;

public class Ex17 {

    public static class StudentGrades {
        String studentName;
        double[] grades;

        StudentGrades(String name, double[] grades) {
            this.studentName = name;
            this.grades = grades;
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

        public int numberOfGrades() {
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
            System.out.print("Number of grades: "+ numberOfGrades() + " | ");
            System.out.print("Lowest grade: "+ lowestGrade() + " | ");
            System.out.print("Highest grade: " + highestGrade() + " | ");
            System.out.println("Average grade: " + gradeAverage() + " | ");
        }

        public static void main(String[] args){
            StudentGrades s1 = new StudentGrades("Amanda", new double[] {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
            StudentGrades s2 = new StudentGrades("James" , new double[] {2.0, 3.0, 2.0, 4.5, 4.5});

            s1.displayStudentInfo();
            s2.displayStudentInfo();

        }
    }
}

