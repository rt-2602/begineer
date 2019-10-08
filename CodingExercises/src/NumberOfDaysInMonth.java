public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        /*System.out.println(isLeapYear(-1600);
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000)); */

       isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

        getDaysInMonth(1,2020);
        getDaysInMonth(2,2020);
        getDaysInMonth(2,2018);
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
        //getDaysInMonth(-1,2020);
        //getDaysInMonth(1,-2020);


    }

    public static boolean isLeapYear(int year){
        if(year <1 || year > 9999){
            return false;
        } else if((year%400 == 0) || (year%4 == 0  && year % 100 !=0)){
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        int days=-1;
        switch (month) {
            case 1:
                System.out.println("31");
                days=31;
                break;
            case 2:
                boolean val = isLeapYear(year);
                //if ((isLeapYear(year)) == true)
                 if(val==true){
                    System.out.println("29");
                    days = 29;
                } else{
                    System.out.println("28");
                     days = 28;
                 }
                break;
            case 3:
                System.out.println("31");
                days = 31;
                break;
            case 4:
                System.out.println("30");
                days = 30;
                break;
            case 5:
                System.out.println("31");
                days = 31;
                break;
            case 6:
                System.out.println("30");
                days = 30;
                break;
            case 7:
                System.out.println("31");
                days = 31;
                break;
            case 8:
                System.out.println("31");
                days = 31;
                break;
            case 9:
                System.out.println("30");
                days = 30;
                break;
            case 10:
                System.out.println("31");
                days = 31;
                break;
            case 11:
                System.out.println("30");
                days = 30;
                break;
            case 12:
                System.out.println("31");
                days = 31;
                break;
            default:
                System.out.println("-1");
                break;
        }
        return days;
    }
}
