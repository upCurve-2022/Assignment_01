public class seperate {

    public static void main(String[] args) {
        double a = 37.03d;
        String s = String.valueOf(a);
        String num = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.') {
                num = num + s.charAt(i) + "";
            }
            else
                num = num + " ";
        }
        System.out.println(num);
    }
}
