
public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(-12211));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
      int reverse =0;
        int num = number;

    while ((number > 0)|| (number != 0)) {

            int digit = (number % 10);
            reverse=reverse*10;
            reverse+=digit;

            //System.out.println("reverse number is " + reverse  );
        number = (number / 10);

        if(reverse == num){
            return true;
        }
    }
        return false;
    }
}
