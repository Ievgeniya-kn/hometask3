public class Discriminant {
    public static void main(String[] args) {
        double a = 3;
        double b = 14;
        double c = 6;
        double x1, x2;
        double discriminant;

        if (a == 0) {
            x1 = -c / b;
            System.out.println("x = " + x1);
        } else {
            discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant < 0) {
                System.out.println("There is no answer");
            } else if (discriminant == 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1=x2= " + x1);
            } else if (discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1 = " + x1);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
