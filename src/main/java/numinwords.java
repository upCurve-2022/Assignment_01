public class numinwords {

    public static void main(String[] args) {
        int n = 12344;
        String s = String.valueOf(n),str = "";
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '1' : str = str + "One ";
                    break;
                case '2' : str = str + "Two ";
                    break;
                case '3' : str = str + "Three ";
                    break;
                case '4' : str = str + "Four ";
                    break;
                case '5' : str = str + "Five ";
                    break;
                case '6' : str = str + "Six ";
                    break;
                case '7' : str = str + "Seven ";
                    break;
                case '8' : str = str + "Eight ";
                    break;
                case '9' : str = str + "Nine ";
                    break;
                default:System.out.println("Invalid number");
            }
        }
        System.out.println(str);
    }
}
