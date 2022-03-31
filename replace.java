public class replace {

    public static void main(String[] args) {
        String str = "To test this string";
        String s = "";
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != 't')
                s = s + str.charAt(i);
        }
        System.out.println(s);
    }
}
