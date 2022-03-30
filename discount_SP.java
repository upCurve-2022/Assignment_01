import java.util.Scanner;

public class discount_SP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int CP = 50,d,SP;
        d = (CP*20)/100;
        SP = CP - d;
        System.out.println("Discount = " + d);
        System.out.println("Selling price = " + SP);
    }
}
