
/* we have a dog that likes to bark. we need to wake up if the dog is barking at night.
if hour of day is before 8 or after 22 hours we have to wake up so in that case return true*/
public class BarkingDog {
    public static void main(String[] args) {


        boolean dog = bark(true, 1);
        System.out.println(dog);
        dog = bark(false, 2);
        System.out.println(dog);
        dog = bark(true, 8);
        System.out.println(dog);
        dog = bark(true, -1);
        System.out.println(dog);
    }

    public static boolean bark(boolean barking, int hourOfDay) {

        if (barking == false) {
            return false;
        } else {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            } else {
                return false;
            }
        }


    }
}

