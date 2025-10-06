public class AS {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.branch);
        System.out.println(s.college);
        s.showDetails();
    }
}

class Student {
    public String name = "Abhishek";
    private int prn = 8001;
    protected String branch = "AI&DS";
    String college = "XYZ College";

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("PRN: " + prn);
        System.out.println("Branch: " + branch);
        System.out.println("College: " + college);
    }
}
