
public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        //System.out.println(sumFirstAndLastDigit(221));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }



    public static int sumFirstAndLastDigit(int number){
        int   lastDigit = number % 10;
        //System.out.println("Last digit = " +lastDigit);

        while((number/10)>0){
            number = number/10;
        }
        if (number>10)number = number/10;
        System.out.println("Sum : "+(lastDigit+number));
        return -1;
    }
}
