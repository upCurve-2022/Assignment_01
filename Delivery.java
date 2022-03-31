import java.util.Scanner;

public class Delivery extends Exception {

    static boolean validateCode(String str)
    {
        char ch;int i;
        for(i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(!(ch>='0' && ch<='9'))
                break;
        }
        if(i==6)
            return true;
        return false;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String zip = s.nextLine();
        try
        {
            if (zip.length()==5 && validateCode(zip))
                    System.out.println("Delivery available in your area!");
            else
                throw new Delivery();
        }
        catch (Delivery e)
        {
            System.out.println(e);
        }
    }

    public String toString()
    {
        return ("Invalid zip code");
    }
}
