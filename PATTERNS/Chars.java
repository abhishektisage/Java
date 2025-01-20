public class Chars{
    public static void main(String args[]){
            
        int i;
        char ch='A';
        int chars;

        for(i=1 ; i<=5 ; i++){
            for(chars=1 ; chars<=i ; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }

}