public class DecimalComparator {
    public static void main(String[] args) {
       boolean val = areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(val);

        val = areEqualByThreeDecimalPlaces(3.175,3.176);
        System.out.println(val);

        val = areEqualByThreeDecimalPlaces(3.0,3.0);
        System.out.println(val);
    }

    public static boolean areEqualByThreeDecimalPlaces(double val_1, double val_2) {

        double num1 = ((long)(val_1 * 1e3)) / 1e3;
        double num2 = ((long)(val_2 * 1e3)) / 1e3;

        System.out.println(num1);
        System.out.println(num2);

        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
    }
        /*
        //double value = val_1 - (long) val_1;
        //double x = d - (long) d;
        //new BigDecimal(value).setScale(3, );
        //System.out.println("Fraction from toString " + value);
        //System.out.println("Exact value of fraction " + new BigDecimal(value));
        double input1 = val_1;
         DecimalFormat value = new DecimalFormat(".###");
        System.out.printf("Rounded to 3 places %.3f%n", value.format(value));
        //DecimalFormat value1 = value;
        double value1 = Double.valueOf(".###");

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setDecimalSeparator('.');
        DecimalFormat format = new DecimalFormat("#.#####", symbols);
        return Double.valueOf(format.format(number));


        double input2 = val_2;
        DecimalFormat valuee = new DecimalFormat(".###");
        System.out.printf("Rounded to 3 places %.3f%n", valuee.format(val_2));
        //int V2= valuee.format(int) ;
        //DecimalFormat value2 = value;
        double value2 = Double.valueOf(".###");


        /* valuee = val_2 - (long) val_2;
        //double x = d - (long) d;
        //System.out.println("Fraction from toString " + valuee);
        new BigDecimal(valuee).setScale(3,RoundingMode.UNNECESSARY);
        //System.out.println("Exact value of fraction " + new BigDecimal(value));
        System.out.printf("Rounded to 3 places %.3f%n", valuee);
        DecimalFormat value2 = valuee;
*/

        /*DecimalFormat V1 = new DecimalFormat("#.###");
        V1.setRoundingMode(RoundingMode.FLOOR);
        String num1 = V1.format(val_1);


        DecimalFormat V2 = new DecimalFormat("#.###");
        V2.setRoundingMode(RoundingMode.FLOOR);
        String num2 = V2.format(val_1); */

        //public static double roundDown5(double d) {


       /* double num1 = Math.floor(val_1 * 1e3) / 1e3;
        double num2 = Math.floor(val_2 * 1e3) / 1e3;*/


