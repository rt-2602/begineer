
public class SecondsAndMinute {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945) );
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));

    }
// 1 min = 60 sec, 1 hr = 60 min or 3600 sec
    // i/p 61 min o/p 01h 01m 00s or 1h 1m 0s

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 )|| (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hr = minutes / 60;
        int remainingminutes = minutes % 60;

        String hrString = hr + "h";
        if (hr<10){
            hrString ="0" + hrString;
        }

        String mString = remainingminutes + "m";
        if (remainingminutes<10){
            mString ="0" + mString;
        }

        String sString = seconds + "s";
        if (seconds<10){
            sString ="0" + sString;
        }
        return hrString +" " + mString+ " " + sString ;

        /*if ((minutes >= 60) || (seconds >= 60) || (seconds < 60)) {
            int hr = minutes / 60;
            //int min = minutes / 60;
            int remainingminutes = minutes % 60;
            return hr + "h" +remainingminutes + "n" + seconds + "s";
        }*/

    }

   private static String getDurationString(int seconds){
        if(seconds < 0){
               return INVALID_VALUE_MESSAGE;
        }
        int mint = seconds / 60;
        int secd = seconds % 60;

        return getDurationString(mint,secd);

            //return mint + "m" + secd + "s";

    }

    }

