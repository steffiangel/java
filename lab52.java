interface WaterConservationSystem {
    int calculateTrappedWater(int[] blockHeights);
}

abstract class RainySeasonConservation implements WaterConservationSystem {
    public abstract int calculateTrappedWater(int[] blockHeights);
}

class CityBlockConservation extends RainySeasonConservation {
    @Override
    public int calculateTrappedWater(int[] blockHeights) {
        int n = blockHeights.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = blockHeights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], blockHeights[i]);
        }

        rightMax[n - 1] = blockHeights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], blockHeights[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - blockHeights[i];
        }

        return totalWater;
    }
}

public class Main {
    public static void main(String[] args) {
        WaterConservationSystem conservationSystem = new CityBlockConservation();
        
        int[] blockHeights1 = {3, 0, 0, 2, 0, 4};
        int trappedWater1 = conservationSystem.calculateTrappedWater(blockHeights1);
        System.out.println("Test Case 1: Total trapped water = " + trappedWater1);

        int[] blockHeights2 = {3, 0, 2, 0, 4};
        int trappedWater2 = conservationSystem.calculateTrappedWater(blockHeights2);
        System.out.println("Test Case 2: Total trapped water = " + trappedWater2);
    }
}