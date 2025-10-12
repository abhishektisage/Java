import java.util.*;
public class keyStatic{
    public static void main(String args[]){
       Student s1=new Student();
       s1.schoolName="MGM";

       Student s2=new Student();
       System.out.println(s2.schoolName);
       
       s1.setName("abhishek");

    }
}
class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
       System.out.println(this.name=name);

    }
    String getName(){
        return this.name;
    }
}