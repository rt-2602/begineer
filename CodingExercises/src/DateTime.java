

public class DateTime {

    public static void main(String[] args) {
        System.out.println(dateTime( 16, 40));
        System.out.println(dateTime(14, 35));
        System.out.println(dateTime(17, 30));
        System.out.println(dateTime(17, 00));
        System.out.println(dateTime(13, 00));
        System.out.println(dateTime(15, 29));
        System.out.println(dateTime(15, 30));

    }

    public static String dateTime(int hours, int minutes) {

        if ((hours < 15)) {
            return "do nothing";
        }

        while ((hours >= 15) || (minutes == 0)) {
            if((hours==15) && (minutes <30)) {
                System.out.println("do nothing");
                break;
            }

            if ((minutes >= 30) || (minutes == 0) || (minutes<30)) {
                System.out.println("call function");
                break;

                }
        }return " ";
    }
}



        //if ((hours <= 15) ||  (minutes <0)){
        //if(minutes <=30)
        //return "do nothing";


       /* if(hours > 16){
            System.out.println("call function");
            return "";
        }
        if ((hours >= 15)) {
            if ((minutes <60)|| (minutes >0 )|| (minutes ==0)) {
                System.out.println("call function");
            } *//*else if ((minutes <= 30) || (minutes == 0)) {
                System.out.println("call function");

                //System.out.println("call function");
            }*//*
            System.out.println("call function");*/



