import java.util.Scanner;

public class AlphabetWar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of characters: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        char[] left = new char[n];
        int[] leftW = new int[n];
        char[] right = new char[n];
        int[] rightW = new int[n];

    
        for (int i = 0; i < n; i++) {
            System.out.print("Enter left character " + (i + 1) + ": ");
            left[i] = scanner.next().charAt(0); // Read a single character
            System.out.print("Enter weight for character " + left[i] + ": ");
            leftW[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter right character " + (i + 1) + ": ");
            char c = scanner.next().charAt(0);
            for (int j = 0; j < n; j++) {
                if (c == left[j]) {
                    System.out.print("Enter non-duplicate right character " + (i + 1) + ": ");
                    c = scanner.next().charAt(0);
                }
            }
            right[i] = c; 
            System.out.print("Enter weight for character " + right[i] + ": ");
            rightW[i] = scanner.nextInt();
        }

        scanner.nextLine();
        System.out.print("Enter your sentence: ");
        String sentence = scanner.nextLine();

      
        int lSum = 0;
        int rSum = 0;

        for (char s : sentence.toCharArray()) {
            for (int i = 0; i < n; i++) {
                if (s == left[i]) {
                    lSum += leftW[i];
                } else if (s == right[i]) {
                    rSum += rightW[i];
                }
            }
        }

        
        String winner;
        if (lSum > rSum) {
            winner = "Left side wins!";
        } else if (rSum > lSum) {
            winner = "Right side wins!";
        } else {
            winner = "It's a tie!";
        }

   
        System.out.println("Left sum: " + lSum);
        System.out.println("Right sum: " + rSum);
        System.out.println("Winner: " + winner);

        
    }
}
