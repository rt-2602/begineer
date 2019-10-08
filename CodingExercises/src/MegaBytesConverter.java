/* write a method to claculate megabytes and remaining kilobytes from the kilobytes parameter
*   Examplle - if parameter kiloBytes is 2500 then print "2500 KB = 2 MB and 452 KB"
*   1 MB = 1024 KB   */


public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes <= 0) {
            System.out.println("Invalid Value \n " );
        } else if (kiloBytes > 0) {
            int tomegaBytes = kiloBytes/1024;
            int toKiloBytes = (kiloBytes%1024);

            System.out.println(kiloBytes+"KB = "+tomegaBytes + "MB and "+toKiloBytes+"KB ");
        }
    }
}
