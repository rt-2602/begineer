import static java.lang.Integer.*;

public class NumberToWords {
    public static void main(String[] args) {
        //System.out.println(reverse(-123));
        //System.out.println(countRev(100));
        System.out.println(numberToWords(100));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(-12));
        System.out.println(numberToWords(5200));
        System.out.println(numberToWords(0052));


    }

    public static String numberToWords(int number) {

        if (number <= 0) {
            return "Invalid Value";
        }
        int revCount = 0;
        int reverseNum;
        int num=0;
        String snum = "";
        String a="";
        int lastDigit = 0;
        num = reverse(number);
        reverseNum=num;
        int originalCount = 0;

        originalCount = countRev(number);
        revCount = countRev(reverseNum);

        while ((reverseNum>0) ) {

           lastDigit = reverseNum % 10;

            switch (lastDigit) {
                case 0:
                    snum = "zero";
                    break;
                case 1:
                    snum = "one";
                    break;
                case 2:
                    snum = "two ";
                    break;
                case 3:
                    snum = "three ";
                    break;
                case 4:
                    snum = "four ";
                    break;
                case 5:
                    snum = "five ";
                    break;
                case 6:
                    snum = "six";
                    break;
                case 7:
                    snum = "seven ";
                    break;
                case 8:
                    snum = "eight ";
                    break;
                case 9:
                    snum = "nine ";
                    break;

            }

            a = a + " " + snum; //reversed number 321 0f 123
            reverseNum= reverseNum/10;

            if ((revCount < originalCount)&&(reverseNum==0)) {

                //revCount++;

                for (int i = 0; i < (originalCount - revCount); i++) {

                    a =  a + " " + "zero" ;

                }break;
            }
        }return a;
        }

    public static int reverse(int num){
       // numberToWords(num);
        String n="";
        //int n=0;
        while(num<0){
            int lastDigit = num % 10;

                lastDigit= -1*(lastDigit);

            num = num / 10;
            n = n+""+lastDigit;
            if(num<0) {
                n = "-"+n;
            }
        }

            while(num>0) {
                            int lastDigit = num % 10;
                num = num / 10;
                n = n+""+lastDigit;
            }
        //System.out.println(n);
        int no = (int)Integer.parseInt(n);
        //System.out.print("reversed" +no);
        //if()
        return no;
    }

    public static int countRev(int Num){
        //int reverseNum= reverse(n);
        int count =0;
        //int n0 = reverseNum;
        for(int i=1; i<10;i++) {
           int no = Num % 10;
           Num = Num / 10;
            count++;

            if(Num==0)
                break;

            //continue;
        } return count;
    }


}
//number = reverse(number);
//String value="";    //123
//String strFinal="";
       /* if (number ==0) {
            return "zero";
        }*/

       /* while(number>0) {
            // number =  number/10;
            int lastDigit= number % 10;
            switch (lastDigit) {
                case 0:
                    value="zero";
                    break;
                case 1:
                    value="one";
                    break;
                case 2:
                    value="two";
                    break;
                case 3:
                    value="three";
                    break;
                case 4:
                    value="four";
                    break;
                case 5:
                    value="five";
                    break;
                case 6:
                    value="six";
                    break;
                case 7:
                    value="seven";
                    break;
                case 8:
                    value="eight";
                    break;
                case 9:
                    value="nine";
                    break;

            }
            strFinal=strFinal+" "+value;
            number =  number/10;
        }*/
        /* for(int i=1; i<10;i++){
            int n= n0%10;
            n0=n0/10;
            count++;
            if(n0==0)
                break;
            //continue;
        }
                                                                                                                                                                                                                                       */
//System.out.print(numberToWords( reverseNum));
//int lastDigit = number % 10;

// number =  number/10;
//int lastDigit = 123;
//int lastDigit = number % 10;
//reverse(a);
//reverse(lastDigit);


          /* for(int i=1; i<10;i++){
               int n= n0%10;
               n0=n0/10;
               count++;
               if(n0==0)
                   break;
               //continue;
           }*/

/*  while (reverseNum<count){
 *//*for(int i=1; i<count;i++){
                   String reverseN=  "0" +""+reverseNum ;
                   int Num= Integer.parseInt(reverseN);
               }*//*
               System.out.println(numberToWords(0+""+reverseNum));
               reverseNum++;
           }*/


         /*  if (originalCount == 2) {
               originalCount = originalCount;
           } else if (revCount < originalCount) {

           } else {
               originalCount = originalCount - 2;

           }*/
          /*switch (firstDigit) {
                    case 0:
                        System.out.println("zero");
                        continue;
                }*/
//}**************************************************************************************************************************************

//reverseNum=reverse(Integer.parseInt(a));
//reverseNum=0;
            //lastDigit = reverseNum % 10;
                   // reverseNum = reverseNum / 10;


//int exp = 10^originalCount;
//exp = exp*10;

// reverseNum = (int) (reverseNum - firstDigit * (Math.pow(10, revCount) * 10));

// if(reverseNum<10){
//    reverseNum = (int) (reverseNum-firstDigit*(Math.pow(10,revCount)));

//}

//if((revCount == 2)|| (revCount<2)){

//  reverseNum = (int) (reverseNum-firstDigit*(Math.pow(10,revCount)));


//}else {
//revCount = revCount - 2;
            /*if(reverseNum<10){
                break;
            }

           if(reverseNum<99) {
               reverseNum = (int) (reverseNum - firstDigit * (Math.pow(10, revCount)));
               //System.out.println(reverseNum);
               firstDigit=reverseNum;

           }else
               reverseNum = (int) (reverseNum - firstDigit * (Math.pow(10, revCount) * 10));

           if(number==0) {
               break;
           }
       }*/
//a= a + "" + num;
      /*  reverseNum=reverseN;
        int originalCount = 0;
        originalCount = countRev(number);
        //int revCount =0;
        //reverseNum = reverse(Integer.parseInt(a));
        revCount = countRev(reverseNum);

        if (revCount < originalCount) {
            firstDigit = 0;
            revCount++;
            for (int i = 0; i < (originalCount - 1); i++) {
                a = a + " " + "zero";
            }

            if (reverseNum < 10) {
                // reverseNum = (int) (reverseNum - firstDigit * (Math.pow(10, revCount)));
                //System.out.println(reverseNum);
                firstDigit = reverseNum;


            } else if ((revCount == 2) || (revCount < 2)) {
                revCount = revCount;
                firstDigit = (int) ((reverseNum) / (Math.pow(10, revCount)));

            } else {
                revCount = revCount - 2;
                firstDigit = (int) ((reverseNum) / (10 * (Math.pow(10, revCount))));
            }

*/
//reverseNum = (int) reverse(Integer.parseInt(a));
//lastDigit = reverseNum % 10;

//reverseNum = reverse(number);
        /*if(number==0) {
            //int reverse = reverse(Integer.parseInt(a));
            //int A=0;
            int  A=(int)Integer.parseInt(a);
            reverseNum = reverse(A);
            System.out.println("reverseNum"+A);
        }*/


