public class comparison {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s3="JAVA";
        String s4 = new String("Hello This is java");
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s4.regionMatches(14, s3, 0, 4));
        System.out.println(s4.regionMatches(true, 14, s3, 0, 4));
        System.out.println("s1 & s2 comparison: "+s1.compareTo(s2));
        System.out.println("s1 & s3 comparison: "+s3.compareTo(s1));
        System.out.println("s1 & string argument comparison: "+s1.compareTo("java"));
    }
}