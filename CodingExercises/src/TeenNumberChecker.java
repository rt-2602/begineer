public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean num = hasTeen(9,99,19);
        System.out.println(num);

        num = hasTeen(23,15,42);
        System.out.println(num);

        num = hasTeen(22,23,34);
        System.out.println(num);
    }

    public static boolean hasTeen(int num1,int num2,int num3){

       if((num1 >=13 && num1 <=19) || (num2 >=13 && num2 <=19) || (num3 >=13 && num3 <=19) )
           return true;
                else
                    return false;

    }
}
