import java.util.Scanner;

public class Linear_Search {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Length of array: ");
        int n = s.nextInt();
        System.out.println("Array elements: ");
        int a[] = new int[n],i;
        for (i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int search = s.nextInt();
        for (i=0;i<n;i++) {
            if(a[i]==search) {
                System.out.print("Value found");
                break;
            }
        }
        if(i==n)
            System.out.print("Value not found");
    }
}
