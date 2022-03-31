import java.util.Scanner;

class MyException extends Exception
{
    boolean validateCode(String str)
    {
        char ch;int c=0;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(ch>='0' && ch<='9')
                c++;
        }
        if(c==5)
            return true;
        return false;
    }
    public String toString()
    {
        return ("Invalid zip code");
    }
}

public class ZipCode {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String zip = s.nextLine();
        MyException exp = new MyException();
        try
        {
            if(zip.length()==5) {
                if (exp.validateCode(zip))
                    System.out.println("Delivery available in your area!");
            }
            else
                throw new MyException();
        }
        catch (MyException e)
        {
            System.out.println(e);
        }
    }
}
