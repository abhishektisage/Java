public class test {
    public static void main(String args[]) {
        Student s = new Student();
        s.details("abhishek", 8001, "ai&ds");
    }
}

class Student {
    String name;
    int prn;
    String branch;

    void details(String newName, int rollno, String branch) {
        name = newName;
        prn = rollno;
        this.branch = branch;  // use 'this' to assign to instance variable
        System.out.println(name + " " + prn + " " + branch);
    }
}
