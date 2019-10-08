public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 5));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(0, 5, 5));
        System.out.println(canPack(2, 10, 18));
        System.out.println(canPack(1,0,4));


    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if((bigCount<0 || smallCount<0)){
            return false;
        }
        if(((bigCount*5)+(smallCount*1))<goal){
            return true;
        }
        return false;
    }

    public static boolean canPack1(int bigCount, int smallCount, int goal) {
        int big = 5;
        int small = 1;
        if (goal == 0) {

            return false;
        }

        if (((big * bigCount) + (small * smallCount)) >= goal) {
            int A = 0;
            int B = 0;
            for (int i = 1; i < (bigCount+1); i++) {
                if (((big * i) <= goal)) {
                    A = (big * i);
                }
            }
            for (int j = 1; j < (smallCount+1); j++) {
                if (((small * j) <= goal)) {
                    B = (small * j);
                    if((A+j)==goal) {
                        break;
                    }
                }
            }

            if ((A + B) == goal || (A == goal) || (B == goal) ) {
                return true;
            }
        }

        if (((bigCount + smallCount) < goal) || (bigCount + smallCount) < goal) {
            if (((bigCount * big) == goal) || ((smallCount * small) == goal) || ((bigCount * big) + (smallCount * small) == goal)) {
                return true;
            }else{
                return false;
            }
        }return false;
    }
}
       /* if ((bigCount + smallCount) <goal ) {
            // && ((smallCount * small) > goal)
            if (((smallCount * small) > goal) || ((bigCount * big) > goal) || ((bigCount * big) + (smallCount * small) > goal)) {
                //if (((bigCount*big)+(smallCount*small))>goal) {
                return false;

            } else return true;
        }*/



