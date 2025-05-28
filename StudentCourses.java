import java.util.HashMap;

public class StudentCourses {
    public static void main(String[] args) {
        HashMap<String, Integer> sem1 = new HashMap<>();
        sem1.put("Math", 85);
        sem1.put("English", 90);

        System.out.println("Semester 1:");
        for (String course : sem1.keySet()) {
            System.out.println(course + ": " + sem1.get(course));
        }
    }
}
