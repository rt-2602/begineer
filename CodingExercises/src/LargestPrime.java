public class LargestPrime {
    public static void main(String[] args) {

        System.out.println("larget prime is " + getLargestPrime(21));

        System.out.println("larget prime is " + getLargestPrime(217));
        System.out.println("larget prime is " + getLargestPrime(0));
        System.out.println("larget prime is " + getLargestPrime(45));
        System.out.println("larget prime is " + getLargestPrime(-1));
        System.out.println("larget prime is " + getLargestPrime(7));
        System.out.println("larget prime is " + getLargestPrime(2));
        System.out.println("larget prime is " + getLargestPrime(1));
        System.out.println("larget prime is " + getLargestPrime(16));
        System.out.println("larget prime is " + getLargestPrime(1137));

    }

    public static int getLargestPrime(int number) {
        int i=0;
        if (number <= 1) {
            return -1;
        }

        if (number == 2) {
            return number;
        }

        for (i = 2; i < number; i++) {

            if(i>=number) {
               return number;
            }
            if (i % 2 != 0||i==2) {
                if (number % i == 0) {
                    number = number / i;
                    if (number % 2 != 0)
                        if (number < 10) {
                            return number;
                           }

                    while (number %i == 0) {
                        if(number==i){
                            return number;
                        }

                            number = number / i;

                       if (number % 2 != 0)
                            continue;

                    }
                }
            }

        }return number;
    }











        /*//int prime=0;
        int primei = 0;
        int primej = 0;


        if (number == 2) {
            return number;
        }
        int j = 1;
       *//* for (int i = 1; i <= number; i++) {

            if ((i % 2) != 0 || i == 2) {
                primei = i;
                if (primei == number) {
                    return primei;
                }
            }*//*
        for (j = 1; j < number; j++) {

            if ((j % 2) != 0 || j == 2) {
                primej = j;
                if (number / primej == 0) {


                    //int k = j;
                    int count = 0;
                    int prime = 1;
                    int prime2 = 1;
                    // primej=0;


                    while (number > 0) {

                        if (j == 1)
                            break;

                        // primej = j;
                        //  prime = prime * primej;

                        number = number / primej;


                        if (number % 2 != 0)
                            if (number < 10) {
                                if (number > j) {
                                    return number;
                                } else
                                    return j;
                                // return number;
                            } else
                                while (number / j == 1 || number / j < 10) {
                                    number = number / j;
                                }
                        *//* if (number > j *//**//*&& number > k*//**//*)
                        return number;

                }
*//*
                        // primej= primej*primej ;//* primej;
                        //prime = primej;

                        // if (prime > number) {
                        //    break;
                        // }


                        // if (prime == number || prime * primei == number || prime * j == number) {

                        //                      return j;
                        //           }


                   *//* for (int k = 1; k < number; k++) {
                        if (k % 2 != 0 || k == 2) {
                            int primek = k;
                            if (prime * k > number)
                                break;
                            if (prime * k == number) {
                                int div = k / j;

                                   *//**//* if(div%2!=0)
                                        return div;
                                    if (k > j)
                                        return k;
                                    else
                                        return j;*//**//*
                                if (div % 2 != 0)
                                    if (div < 10) {
                                        return div;
                                    } else
                                        while (div / j == 1 || div / j < 10) {
                                            div = div / j;
                                        }
                                if (div > j && div > k)
                                    return div;
                                if (k > j) {
                                    return k;
                                } else
                                    return j;
                            }
                        }
                    }
                    count++;
                    continue;
                }

            }


            //  if ((j % 2) != 0 || j == 2) {
            //    primej = j;
            if (primei * j == number) {
                return j;

            }*//*
                    }
                }

            }

        } return -1;

    }
*/


    public static int getLargestPrime9(int number) {
        if (number < 0 || number == 1) {
            return -1;
        }
        //int prime=0;
        int primei = 0;
        int primej = 0;


        if (number == 2) {
            return number;
        }
        int j = 1;

        for (int i = 1; i <= number; i++) {

            if ((i % 2) != 0 || i == 2) {
                primei = i;
                if (primei == number) {
                    return primei;
                }
            }


            for (j = 1; j < number; j++) {

                if ((j % 2) != 0 || j == 2) {
                    primej = j;


                    //int k = j;
                    int count = 0;
                    int prime = 1;
                    int prime2 = 1;
                    // primej=0;


                    while (count < 10) {

                        if (j == 1)
                            break;

                        // primej = j;
                        prime = prime * primej;

                        // primej= primej*primej ;//* primej;
                        //prime = primej;

                        if (prime > number) {
                            break;
                        }


                        if (prime == number || prime * primei == number || prime * j == number) {

                            return j;
                        }


                        for (int k = 1; k < number; k++) {
                            if (k % 2 != 0 || k == 2) {
                                int primek = k;
                                if (prime * k > number)
                                    break;
                                if (prime * k == number) {
                                    int div = k / j;

                                   /* if(div%2!=0)
                                        return div;
                                    if (k > j)
                                        return k;
                                    else
                                        return j;*/
                                    if (div % 2 != 0)
                                        if(div<10){
                                            return div;}else
                                        while (div / j == 1||div/j<10) {
                                          div= div/j;
                                        }
                                        if(div>j&& div>k)
                                            return div;
                                    if (k > j){
                                        return k;}
                                    else
                                        return j;
                                        }
                                }
                            }
                            count++;
                            continue;
                        }

                    }


                    //  if ((j % 2) != 0 || j == 2) {
                    //    primej = j;
                    if (primei * j == number) {
                        return j;

                    }
                }

        }return -1;
    }


   /*if (prime == number || prime * primei == number || prime * j == number) {

                return j;
            }*/


                    /*int k = j;
                    int count = 0;
                   while (count <= primei) {


                        //primej = k * j;
                        primej = primej * (k * j);
                        if (primej == number || primej * primei == number) {
                            return j;
                        }
                        count++;
                            continue;*/



    public static int getLargestPrime2(int number) {
        if (number < 0 || number == 1) {
            return -1;
        }

        //if((number/number==1)&&(number/1==number)){
        //  return number;
        // }

        int primei = 0;
        int largestprimei = 0;
        int primej = 0;
        if (number == 2) {
            return number;
        }

        for (int i = 1; i <= number; i++) {

            if ((i % 2) != 0||i==2) {
                primei = i;
            }
            if (primei == number)
                return primei;

            int j = 1;
            for (j = 1; j < number; j++) {
                // if(primej==number) {
                // return j;
                // }
                if ((j % 2) != 0 || j == 2) {
                    if (largestprimei * j == number) {
                        return j;
                    } else {

                        int k = j;
                        int count = 0 ;
                        while (count <= largestprimei) {


                            primej = k * j;
                            primej = primej * (k * j);
                            if (primej == number || primej * largestprimei == number) {
                                return j;
                            }
                            count++;
                            break;
                        }
                    }
                }
            }
                 /*for (int j = 1; j < number; j++) {
                     if ((j % 2) != 0) {
                         int primej = j;
                         if ((primei * primej == number) || (primei * primei * primej == number)) {
                             int primeFactor = primej;
                             return primej;
                         }
                     }
                 }*/

        }return -1;
    }





    public static int getLargestPrime3(int number) {

        if (number < 0 || number == 1) {
            return -1;
        }
        int largestprimei = 0;
        int primej = 0;
        if (number == 2) {
            return number;
        }

        for (int i = 1; i <= number; i++) {

            if ((i % 2) != 0 || i == 2) {
                largestprimei = i;
                // if (largestprimei == number)
                //    return i;
            }
        }
        int j = 1;
        for (j = 1; j < number; j++) {
            // if(primej==number) {
            // return j;
            // }
            if ((j % 2) != 0 || j == 2) {

                int k = j;
                int count = 0;
                while (count <= largestprimei) {


                    primej = k * j;
                    primej = primej * (k * j);
                    if (primej == number || primej * largestprimei == number) {
                        return j;
                    }
                    count++;
                    break;
                }
            }
        }return -1;
    }
}
//for (k=j; k<number; k++){
// while (largestprimei * j == number) {
//    primej = k * j;
//if(primej==number){
//  primej = j;
//}
// }




//while (largestprimei * j == number) {
//  primej = largestprimei * j;
//}

       /* if ((largestprimei * primej == number)) {
            int primeFactor = primej;
            return primej;
        }
                    if(largestprimei>primej){
                                return largestprimei;
                            }else
                                {
                                    return primej;
                                }*/




   /* public static int getLargestPrime1(int number) {

        if(number<=1 ){
            return -1;
        }
        if(number==2){
            return number;
        }
        int primeNumi=0;
        int primeNumj=0;
        int i=0;
        for(i=2; i<=number;i++) {
            if ((i % 2) != 0 || i == 2) {

                primeNumi = i;
            }
        }
                for(int j=2;j<=number;j++){
                    if((j%2)!=0 ||j==2){
                      if(  primeNumi * j == number){
                         // if(( Math.pow((i*i),number) ==number||( Math.pow((i*i),number)*j ==number) )){
                              primeNumj = j;
                           //primeNumi=i;
                           //if(primeNumi>primeNumj){
                             //  return primeNumi;
                           //}else return primeNumj;
                          //}
                      }//else return primeNumi;
                    }
        }return -1;
    }

    public static int getLargestPrime2(int number) {
        if (number <= 1) {
            return -1;
        }

        //if((number/number==1)&&(number/1==number)){
        //  return number;
        // }

        if (number == 2) {
            return number;
        }
        int primeFactorj=0;
        int primeFactori=0;
        int i=0;

        for ( i = 1; i <= number; i++) {
            if (((i % 2) != 0) || (i == 2)) {
                if (primeFactori == number) {
                        return primeFactori;
                     }
                primeFactori = i;

            }
        }
                //if (i == number) {
                //    return i;
                // }
                    *//*if ((primei * primej == number)|| (primei *i)* primej == number)  {
                       // if primei > primej
                        int primeFactor = primej;
                        return primej;
                    }
                }
            }*//*

                for (int j = 1; j < number; j++) {
                    if (((j % 2) != 0) || (j == 2)) {
                        primeFactorj = j;
                        if ((i * j == number)) {
                          //
                           *//* while(Math.pow((i * i),number) == number||Math.pow((i * i),number)*j == number) {
                                primeFactorj = j;
                                //ret = primeFactor;
                                primeFactori = i;
                                if(primeFactori>primeFactorj){
                                    return primeFactori;
                                                             }else*//*
                            if ((primeFactori * primeFactorj == number) || (primeFactori * i) * primeFactorj == number) {
                               primeFactorj=j;
                               return primeFactorj;
                            }
                        }
                    }

                } return -1;
            }
            }

*/

