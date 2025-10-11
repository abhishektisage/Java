import java.util.*;

public class hierarIn {
    public static void main(String args[]) {
        Student s = new Student();
        s.info("Abhi", 8001);


        Course c = new Course();
        c.getCourse();

        Activity a = new Activity();
        a.swim();
    }
}

class Student {
    String name;
    int prn;

    void info(String name, int prn) {
        System.out.println("Name is " + name + " - " + prn);
    }
}

class Course extends Student {
    String C;
    Scanner sc = new Scanner(System.in);

    void getCourse() {
        System.out.print("Enter course: ");
        C = sc.nextLine();
        System.out.println("Course is " + C);
    }
}

class Activity extends Student {
    void swim() {
        System.out.println("He swims");
    }
}
