import java.util.*;
public class BuynSellStocks{
    public static int buynsell(int prices[]){
        int buyprice=INTEGER.MAX_VALUE;
        int maxprofit=0;
        for(int i=i;i<price.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);

            }
            else{
                buyprice=prices[i];
            }
        }
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buynsell(prices));
    }
}