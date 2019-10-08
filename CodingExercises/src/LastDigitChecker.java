public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000)) {
            return false;
        }
        if ((a >= 10 || a <= 1000) && (b >= 10 || b <= 1000) && (c >= 10 || c <= 1000)) {
            int lastDigit1 = (a % 10);
            int lastDigit2 = (b % 10);
            int lastDigit3 = (c % 10);

            if ((lastDigit1 == lastDigit2) || (lastDigit2 == lastDigit3) || (lastDigit3 == lastDigit1)) {
                return true;
            }
        } return false;
    }
}
