import java.util.*;
class ABC
{
    
    static int k;
    int n;
    int[] a;
    int[] b;
    int[] c;
    ABC(){
         n= 0;
         k=0;
        a = new int[n];
        b = new int[n];
        c = new int[n];
    }
    public int read(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the no. of numbers:");
    n=scanner.nextInt();
    
    a = new int[n];
    for(int i=0; i<n;i++){
        System.out.print("Enter"+" "+(i+1)+"th number: ");
        a[i]=scanner.nextInt();
    }
    System.out.println("Enter the value of K:");
    k=scanner.nextInt();
    
    return n;
    }
    
    public void mode(){
       
        b = new int[n];
        c = new int[n];
        for (int i = 0; i < n; i++) {
        int freq = 1;
        for (int j = i + 1; j < n; j++) {
            if (a[i] == a[j]) {
                freq++;
            }
        }
        boolean found = false;
        for (int ki = 0; ki < i; ki++) {
            if (c[ki] == a[i]) {
                found = true;
                break;
            }
        }
        if (!found) {
            c[i] = a[i];
            b[i] = freq;
        }
    }
        
    }
    public void display() {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (b[j] < b[j + 1]) {
                int tempB = b[j];
                b[j] = b[j + 1];
                b[j + 1] = tempB;

                int tempC = c[j];
                c[j] = c[j + 1];
                c[j + 1] = tempC;
            }
        }
    }
    System.out.println("THE TOP K ENTRIES MODE AND FREQUENCY: ");
    for (int i = 0; i < k; i++) {
        System.out.println("The value " + c[i] + " has frequency: " + b[i]);
        System.oupt.println(" ");
    }
}

    public static void main(String args[]){
        ABC obj=new ABC();
        obj.read();
        obj.mode();
        obj.display();
        
    }
  
}