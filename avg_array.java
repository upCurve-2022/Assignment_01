import java.util.Scanner;

public class avg_array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Array Size: ");
        int n = s.nextInt();
        int a[] = new int[n];
        int sum = 0;
        System.out.println("Array Elements: ");
        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Average = " + sum/n);
    }
}
