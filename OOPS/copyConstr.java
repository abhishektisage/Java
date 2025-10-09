class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class copyConstr {
    public static void main(String[] args) {
        Student s1 = new Student("Abhishek", 20); // original object
        Student s2 = new Student(s1);              // copy object

        s1.display();
        s2.display();
    }
}
