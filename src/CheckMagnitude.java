public class CheckMagnitude {
    public static void main(String[] args) {
        int a=15;
        int b = -18;

        int maga=Math.abs(a);
        int magb=Math.abs(b);

        if (maga>magb) {
            System.out.println("The number a has greatest value " +a);
        } else   if (maga<magb) {
            System.out.println("The number b has greatest value "+b) ;
        } else System.out.println("Number a nd b are similar");

    }
}
