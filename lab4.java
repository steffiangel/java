import java.util.Arrays;

abstract class Robber {

    public abstract int RowHouses(int[] rowHouses);
    public abstract int RoundHouses(int[] roundHouses);
    public abstract int SquareHouse(int[] squareHouse);

    public void MachineLearning() {
        System.out.println("I love MachineLearning.");
    }

    public void RobbingClass() {
        System.out.println("MScAI&ML");
    }
}

class JAVAProfessionalRobber extends Robber {

    @Override
    public int RowHouses(int[] houses) {
        if (houses == null || houses.length == 0) return 0;

        int n = houses.length;
        if (n == 1) return houses[0];

        int[] dp = new int[n];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + houses[i]);
        }

        return dp[n - 1];
    }

    
    @Override
    public int RoundHouses(int[] houses) {
        if (houses == null || houses.length == 0) return 0;
        if (houses.length == 1) return houses[0];

        return Math.max(robLinear(Arrays.copyOfRange(houses, 0, houses.length - 1)),
                robLinear(Arrays.copyOfRange(houses, 1, houses.length)));
    }

 
    private int robLinear(int[] houses) {
        int prevMax = 0, currMax = 0;
        for (int x : houses) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }

    
    @Override
    public int SquareHouse(int[] houses) {
        return robLinear(houses);
    }

  
    public static void main(String[] args) {
        JAVAProfessionalRobber robber = new JAVAProfessionalRobber();
        System.out.println("RowHouses: " + robber.RowHouses(new int[]{1, 2, 3, 0}));
        System.out.println("RoundHouses: " + robber.RoundHouses(new int[]{1, 2, 3, 4}));
        System.out.println("SquareHouse: " + robber.SquareHouse(new int[]{5, 10, 2, 7}));
       
        robber.RobbingClass();
        robber.MachineLearning();
    }
}