public class Teacher {
    private String firstName;     // Private access
    private String lastName;      // Private access
    private String subject;       // Private access
    private int yearsTeaching;    // Private access

    // Constructor
    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public static void main(String[] args) {
        // Instantiate the Teacher class
        Teacher teacher = new Teacher("John", "Doe", "Math", 5);

        // Display teacher information
        System.out.println("Teacher: " + teacher.getFirstName() + " " + teacher.getLastName());
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println("Years Teaching: " + teacher.getYearsTeaching());
    }

}