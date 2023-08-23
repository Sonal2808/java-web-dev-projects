public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student student = new Student("Salley", 12345);
        student.setName("Sonal");
        student.setStudentId(6789);
        student.setNumberOfCredits(1);
        student.setGpa(4.0);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Number of Credits: " + student.getNumberOfCredits());
        System.out.println("GPA: " + student.getGpa());
    }


}