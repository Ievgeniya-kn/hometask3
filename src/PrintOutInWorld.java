public class PrintOutInWorld {
    public static void main(String[] args) {
        int i = 9;

        if (i == 1) {
            System.out.println("ONE");
        } else if (i == 2) {
            System.out.println("TWO");
        } else if (i == 3) {
            System.out.println("THREE");
        } else if (i == 4) {
            System.out.println("FOUR");
        } else if (i == 5) {
            System.out.println("FIVE");
        } else if (i == 6) {
            System.out.println("SIX");
        } else if (i == 7) {
            System.out.println("SEVEN");
        } else if (i == 8) {
            System.out.println("EIGHT");
        } else if (i == 9) {
            System.out.println("NINE");
        }
        else
            System.out.println("OTHER");


        switch (i) {
            case 1: {
                System.out.println("ONE");
                break;
            }
            case 2: {
                System.out.println("TWO");
                break;
            }
            case 3: {
                System.out.println("THREE");
                break;
            }
            case 4: {
                System.out.println("FOUR");
                break;
            }
            case 5: {
                System.out.println("FIVE");
                break;
            }
            case 6: {
                System.out.println("SIX");
                break;
            }
            case 7: {
                System.out.println("SEVEN");
                break;
            }
            case 8: {
                System.out.println("EIGHT");
                break;
            }
            case 9: {
                System.out.println("NINE");
                break;
            }
            default:
                System.out.println("OTHER");
        }


    }
}
