public class SharedDigit {
    public static void main(String[] args) {
        System.out.println("digit that appears in both numbers " + hasSharedDigit(45, 63));
        System.out.println("digit that appears in both numbers " + hasSharedDigit(12, 23));

        System.out.println("digit that appears in both numbers " + hasSharedDigit(9, 99));
        System.out.println("digit that appears in both numbers " + hasSharedDigit(15, 55));

    }

    /*public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) && (b < 10 || b > 99)) {
            return false;
        }
        //while(a>0 || b>0){
        //while ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
           // for (int i = 0; (a < 10 || b < 10); i++) {
                int lastDigit = a % 10;
                int lastDigit2 = b % 10;
                if (lastDigit == lastDigit2) {
                    return true;
                }
                //int digit1 = lastDigit;
                //int digit2 = lastDigit2;
                a = a / 10;
                b = b / 10;
                while ((a>0)|| (b>0)){
                    if((a==b) || (a==lastDigit)) {
                        return true;
                    }
                      else  if ((lastDigit == b) || (lastDigit == lastDigit2)) {
                            return true;
                        }

                    break;
                }   return false;
    }*/

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) && (b < 10 || b > 99)) {
            return false;
        }

        while(a>0){
            int digit1 = a%10;
            int num2=b;
            while (num2>0) {
                int digit2 = num2%10;
                if(digit1==(digit2)){
                    return true;
                }
                num2=num2/10;
            }
            a=a/10;
        }
        return false;
    }
}



    //if((a==b) || (lastDigit==a) || (lastDigit == b) || (lastDigit2==a) || (lastDigit2==b) )
                //return true;

           // }

//}

