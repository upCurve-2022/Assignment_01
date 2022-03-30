public class largest {

    public static void main(String[] args) {
        int a[] = {10,5,25};

        for (int i=0;i<a.length-1;i++) {
            for (int j=i+1;j<a.length;j++) {
                if(a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("largest: " + a[0]);
        System.out.println("Second largest: " + a[1]);
    }
}
