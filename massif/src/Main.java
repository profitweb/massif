import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] peaple = new int[5];
        for(int i = 0; i < peaple.length; i++ ){
        peaple[i] = new Random().nextInt(100);
        }

        for(int i = 0; i < peaple.length; i++ ){
            System.out.println(peaple[i]);
        }

//        int[] array = new int[10];
//        for (int i = 0 ; i < 10 ; i++ ) {
//        array[i] = i + 10;
//        }
//
//        for(int i = 0 ; i < array.length ; i++) {
//            System.out.println(array[i]);
//        }
    }
}