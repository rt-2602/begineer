public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of even numbers = " +getEvenDigitSum(123456789));
        System.out.println("Sum of even numbers = " +getEvenDigitSum(252));
        System.out.println("Sum of even numbers = " +getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }

        int sum =0;
        while(number > 0){
            int digit = number % 10;

            if((digit%2) == 0){
                sum = sum + digit;
               // System.out.println(sum);
            }
           number = (number /10);

        }return sum;
    }
}
