public class FactorPrinter {
    public static void main(String[] args) {
        System.out.println(printFactors(6));
       System.out.println(printFactors(32));
        System.out.println(printFactors(10));
       System.out.println(printFactors(-1));
    }

    public static String printFactors(int number) {
        if (number < 1) {
            return "Invalid Value";
        }
        //String num ="";
        String n = "";
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                  String  num = i + "";
                    //System.out.print(n);


               n = n + " " + num;
                }
        }return n ;
    }
}