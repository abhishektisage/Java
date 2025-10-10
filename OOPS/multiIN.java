public class multiIN{
    public static void main(String args[]){
        Human man=new Human();
        man.swim();
        man.eat();
       
    }
}
class Animal{
    String  color;

    void eat(){
        System.out.println("Eatss");
    }
    void breathe(){
        System.out.println("Breathess");

    }

}
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim in the water");
    }
}

class Human extends Fish{
    String male;
    void walk(){
        System.out.println("WAlkss");
    }
}