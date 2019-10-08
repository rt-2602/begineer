

public class DigitSum {

    public static void main(String[] args) {
        System.out.println("The sum of digits 125 = " +sumDigits(125));
        System.out.println("The sum of digits -125 = " +sumDigits(-125));
        System.out.println("The sum of digits 4 = " +sumDigits(4));
        System.out.println("The sum of digits 32123 = " +sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if ((number < 10) || (number < 0)) {
            return -1;
        }
        //int num = 321;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;

        }
        return sum;
    }
}
