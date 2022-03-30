import java.util.Scanner;

public class concatenate {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(str1.concat(str2));
    }
}
