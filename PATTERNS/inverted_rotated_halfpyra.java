public class inverted_rotated_halfpyra{
    public static void inverted_pyra(int n){
        for(int i=1; i<=n ; i++){
            for(int j=1 ;j<=n-i ; j++) {//spaces
                System.out.print(" ");

            } 
            for(int j=1 ; j<=i ; j++){//stars
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_pyra(5);
    }
}