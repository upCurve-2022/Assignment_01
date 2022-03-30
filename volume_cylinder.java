import java.util.Scanner;

public class volume_cylinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        int r = s.nextInt();
        System.out.print("Enter height of cylinder: ");
        int h = s.nextInt();
        float Vol = (float) (3.14*r*r*h);
        System.out.println("Volume = " + Vol);
    }
}
