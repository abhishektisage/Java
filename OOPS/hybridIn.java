class Person {                 // Base class
    void displayPerson() {
        System.out.println("This is a person");
    }
}

class Student extends Person { // Level 1 - Multilevel
    void displayStudent() {
        System.out.println("This is a student");
    }
}

class Teacher extends Person { // Hierarchical
    void displayTeacher() {
        System.out.println("This is a teacher");
    }
}

class CollegeStudent extends Student { // Level 2 - continues multilevel
    void displayCollegeStudent() {
        System.out.println("This is a college student");
    }
}

public class hybridIn {
    public static void main(String args[]) {
        CollegeStudent cs = new CollegeStudent();
        cs.displayPerson();          // from Person
        cs.displayStudent();         // from Student
        cs.displayCollegeStudent();  // from CollegeStudent

        System.out.println();

        Teacher t = new Teacher();
        t.displayPerson();           // from Person
        t.displayTeacher();          // from Teacher
    }
}
