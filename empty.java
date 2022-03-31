import java.util.Scanner;

public class empty {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if(str.length()>0)
            System.out.println("Not empty");
        else
            System.out.println("Empty");
    }
}
