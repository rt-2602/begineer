
public class WhileExercise {

    public static void main(String[] args) {
        /*System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(1));
        System.out.println(isEvenNumber(24));
        System.out.println(isEvenNumber(3));
*/
        int num = 4;
        int finishNum = 20;
        int count = 0;

        while(num <= finishNum){
            num++;
            if(!isEvenNumber(num)){
                continue;
            }

            System.out.println("even number" +num);

            count++;
            if(count>=5) {
                break;
            }

        }System.out.println("Number of even numbers found = " +count);
        /*int count = 0;
        while(count<=5){
            count++;
            System.out.println(count);*/
        }


    public static boolean isEvenNumber(int num){
        if ((num%2 == 0)){
            return true;
        }else {
            return false;
        }
    }
}
