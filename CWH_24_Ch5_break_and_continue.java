public class CWH_24_Ch5_break_and_continue {
    public static void main(String[] args) {

        // for loop
        /*
        for(int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("java is great");
            if (i==2){
                System.out.println("ending the loop");
                break;
            }
        }
        System.out.println("loop ends here");
         */

        // while loop
        /*
        int j=0;
        while (j<5){
            System.out.println(j);
            System.out.println("java is great");

            if(j==2){
                System.out.println("Ending the loop");
                break;
            }
            j++;
        }
        System.out.println("loop ends here");
         */

        // do while loop
        /*

        int k=0;
        do {
            System.out.println(k);
            System.out.println("java is great");
            if(k==2){
                System.out.println("ending the loop");
                break;
            }
            k++;
        } while(k<5);
        System.out.println("loop ends here");
         */

        // continue
        /*

        for (int i=0; i<10; i++){
            if (i==2){
            System.out.println("Ending the loop");
            continue;

            }
            System.out.println(i);
            System.out.println("java is great");
        }
         */

//        int i=0;
//        while (i<10){
//            if (i==2){
//                System.out.println("Ending the loop");
//                continue;
//            }
//            i++;
//            System.out.println(i);
//            System.out.println("java is great");
//        }

        int j=0;
        do{
            j++;

            if (j==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("java is great");
        } while(j<5);
    }
}
