public class FindX {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double x;

        if (a == 0 || b == 0) {
            x = 0;
            System.out.println("x = " + x);
        } else {
            x = -b/a;
            System.out.println(" x= "+x);
        }
    }
}
