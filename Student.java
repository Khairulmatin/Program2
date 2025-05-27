import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    LocalDate dob;

    Student(String name, String dobStr) {
        this.name = name;
        if (dobStr.charAt(4) == '-') {
            dob = LocalDate.parse(dobStr); 
        } else {
            String[] parts = dobStr.split("-"); 
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            dob = LocalDate.of(year, month, day);
        }
    }

    int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", "15-08-2005");
        s.displayInfo();
    }
}
