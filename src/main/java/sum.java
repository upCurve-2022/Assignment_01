import java.util.ArrayList;

public class sum {

    public static void main(String[] args) {
        int n = 10, se = 0, so = 0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i=0;i<=n;i++) {
            if(i%2==0) {
                se = se + i;
                a.add(i);
            }
            else {
                so = so + i;
                b.add(i);
            }
        }
        System.out.println("Even sum = " + se + "(sum of even numbers " + a + ")");
        System.out.println("Odd sum = " + so + "(sum of odd numbers " + b + ")");
    }
}
