public class singleIn{
    public static void main(String args[]){
        
        Fish shark=new Fish();
        shark.eat();

       
      
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