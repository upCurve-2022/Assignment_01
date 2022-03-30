import java.util.Scanner;

public class first_in_second {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(str1.contains(str2));
    }
}
