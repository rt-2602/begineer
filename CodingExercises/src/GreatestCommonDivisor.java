public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        int divisor1 = 0;
        int divisor2 = 0;
        int commonDivisor=0;
        while (first > 0 || second > 0) {
            for (int i = 1; (i <= first || i <= second); i++) {
                if((first % i == 0) && (second % i == 0)){
                    divisor1 = i;
                }
                /*if ((first % i == 0)) {
                    divisor1 = i;
                }
                if (second % i == 0) {
                    divisor2 = i;
                }
                if ((divisor1 == divisor2)) {
                    commonDivisor = divisor1;
                }*/
            }
            break;
        }return divisor1;
        }
    }





             /* for (int j=0; j<50;j++){
                    while (second > 0) {
                        if (j % second == 0) {
                            divisor2 = j;
                            System.out.println(divisor2);
                        }
                    }
                }*/




  /*if ((first < 10) && (second < 10)) {
        return -1;


        //for (int i = 1; i < 50; i++) {
            if (first == 0)
                return second;

            while (second != 0) {
                if (first > second)
                    first = first - second;
                else
                    second = second - first;*/
           // }

/*
        if((i%first==0) && (i%second==0)){


            int dig1 = i%first;
            int dig2 = i%second;}*/
/*
         while ((dig1 == 0) || (dig2 ==0)) {


              //dig = (i-1)% first;
                //dig = dig+dig1;
                if (dig > dig1) {
                    System.out.println(dig1);
                    return dig1;
                }*/
            /*if ((dig1 == 0) && (dig2 == 0)) {

           } }*/

