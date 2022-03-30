import java.util.Scanner;

public class Binary_Search {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Length of array: ");
        int n = s.nextInt();
        System.out.println("Array elements: ");
        int a[] = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int search = s.nextInt();
        int first = 0,last = n-1,mid,flag=0;
        while (first <= last) {
            mid = (first + last)/2;
            if(a[mid] == search) {
                System.out.print("Value found");
                flag++;
                break;
            }
            else if (search < a[mid]){
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        if(flag == 0)
            System.out.print("Value not found");
    }
}
