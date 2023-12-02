import java.util.*;
public class ShareTrading{

    public static int findMaxProfit(int[] prices) {
        int n = prices.length;

        if (n < 2) {
            return 0;
        }

        int[] profit1 = new int[n];
        int[] profit2 = new int[n];

        int minBuyPrice = prices[0];

        for (int i = 1; i < n; i++) {
            minBuyPrice = Math.min(minBuyPrice, prices[i]);
            profit1[i] = Math.max(profit1[i - 1], prices[i] - minBuyPrice);
        }

        int maxSellPrice = prices[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            maxSellPrice = Math.max(maxSellPrice, prices[i]);
            profit2[i] = Math.max(profit2[i + 1], maxSellPrice - prices[i]);
        }

        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, profit1[i] + profit2[i]);
        }

        return maxProfit;
    }
    public static void read(){
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stock prices: ");
            int n = scanner.nextInt();

            int[] prices3 = new int[n];
           
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the stock prices "+(i+1)+": ");
                prices3[i] = scanner.nextInt();
            }
            
            int result3 = findMaxProfit(prices3);
            
        System.out.println("Output 3: " + result3); 
    }

    public static void main(String[] args) {
        
        int[] prices1 = {10, 22, 5, 75, 65, 80};
        int result1 = findMaxProfit(prices1);
        System.out.println("Output 1: " + result1); 
        System.out.println(" ");
System.out.println(" ");
        int[] prices2 = {2, 30, 15, 10, 8, 25, 80};
        int result2 = findMaxProfit(prices2);
        System.out.println("Output 2: " + result2); 
        System.out.println(" ");
        System.out.println(" ");
        read();
    }
}