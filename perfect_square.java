import java.util.Scanner;

public class perfect_square {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double sqrt = Math.sqrt(n);
        if(sqrt-Math.floor(sqrt)==0)
            System.out.println("It is a perfect square");
        else
            System.out.println("It is not a perfect square");
    }
}
