public class CWH_27_Ch5_arrays {
    public static void main(String[] args) {

        /*
        int [] marks= {95, 88, 60, 55, 30, 40};
        System.out.println(marks.length);

        float [] marksOfSudents = {98.5f, 65.5f, 75.5f, 35.5f, 99.5f};
        System.out.println(marksOfSudents[2]);

        String [] students= {"Sam", "Jack", "Rose", "Mike", "Harry", "Roger", "David", "Peter"};
        System.out.println(students.length);
        System.out.println(students[4]);
         */

        int [] num = {95, 60, 35, 90, 70};

//        System.out.println(num.length);

//        Displaying the Array (Naive way)

//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);

//        Displaying tha Array (for loop)

        System.out.println("Printing using for loop");

        for (int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

//      Quick Quiz  Displaying tha Array in reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");

        for (int i =num.length-1; i>=0; i--){
            System.out.println(num[i]);
        }

//      Quick Quiz  Displaying tha Array  (for-each loop)
        System.out.println("Printing using for-each loop ");
        for (int element: num){
            System.out.println(element);
        }
    }
}
