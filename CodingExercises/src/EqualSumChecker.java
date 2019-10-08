public class EqualSumChecker {
    public static void main(String[] args) {
        boolean ans = hasEqualSum(1,1,1);
        System.out.println(ans);

        ans = hasEqualSum(1,1,2);
        System.out.println(ans);

        ans = hasEqualSum(1,-1,0);
        System.out.println(ans);

    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        if(num1 + num2 == num3)
            return true;
        else
            return false;
    }

}
