public class Inverted{
    public static void main(String args[]){

        int i;
        int star;         

        for(i=4 ; i>=1 ; i--){

            for(star=1 ; star<=i ; star++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}