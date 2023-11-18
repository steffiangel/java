import java.util.*;

class Performance {
     int[] marks;
     int n;

    // Constructor
     Performance() {
        marks = new int[10];
        n=10;
    }

    // Method to read marks into the array
    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of 10 students:");

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    // Method to return the highest mark
    public int max() {
        int max = marks[0];

        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }

        return max;
    }

    // Method to return the least mark
    public int min() {
        int min = marks[0];

        for (int i = 1; i < n; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }

        return min;
    }

    // Method to return the mode
    public void Mode() {
        int mode = marks[0];
        int maxf = 1;

        for (int i = 0; i < n; i++) {
            int current = marks[i];
            int freq = 1;

            for (int j = i + 1; j < n; j++) {
                if (marks[j] == current) {
                    freq++;
                }
            }

            if (freq > maxf || (freq == maxf && current > mode)) {
                mode = current;
                maxf = freq;
            }
        }
        System.out.println("Mode: " + mode);
        System.out.println(" ");
        System.out.println("Frequency at Mode: " + maxf);

      
    }
    public void display() {
        System.out.println("Highest Mark: " + max());
        System.out.println("Least Mark: " + min());
        Mode();
    }

    public static void main(String[] args) {
        Performance performance = new Performance();
        performance.read();
        performance.display();
Scanner scanner=new Scanner(System.in);
    System.out.println(" ");
    System.out.println("do you wish to do it again?");
    char c = scanner.next().charAt(0);
   if (c=='y'||c=='Y'){
        performance.read();
        performance.display();}
else{
System.out.println("Thank you");}


    }
}
