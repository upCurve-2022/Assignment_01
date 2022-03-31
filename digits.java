import java.util.Scanner;

public class digits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
                count++;
        }
        if(count!=0)
            System.out.println("Contains other characters");
        else
            System.out.println("Contains only digits");
    }
}