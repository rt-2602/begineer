public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
        printNumberInWord(-1);

        byteMethod((byte)10);
        byteMethod((byte)0);
        byteMethod((byte)128);

    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

        }

    public static void byteMethod(byte by) {

        /*switch ((byte) (by + 118)) {

            default:
                System.out.println("Sunday");
                break;

            case (byte) 0:
                System.out.println("Monday");
                break;

            case (byte) 128:
                System.out.println("Thank u");
                System.out.println((byte) 128 == (byte) -128);
                break;

        }*/
        switch (by) {

            case (byte) 0:
                System.out.println("Monday");
                break;

            case (byte) 128:
                System.out.println("Thank u");
                System.out.println((byte) 128 == (byte) -128);
                break;

            default:
                System.out.println("Sunday");
                break;
        }
    }
}
