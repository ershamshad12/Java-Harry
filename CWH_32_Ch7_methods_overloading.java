public class CWH_32_Ch7_methods_overloading {

    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morining "+ a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning "+ a+"  bro!");
        System.out.println("Good morning "+ b+ " bro!!!");
    }

    static void change(int a){
        a=98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println("I'm invented new word!\n" + "Plagiarism");
    }

    public static void main(String[] args) {
        telljoke();

//        int [] marks= {53, 73, 77, 89, 98, 94};

        // case 1: Changing the Integer

//        int x=45;
//        change(x);
//        System.out.println("The value of x after running change is: "+ x);

        // case 2: Changing the Array

        int [] marks={53, 73, 77, 89, 98, 94};
        change2(marks);
        System.out.println("The value of marks after running change2 is: " + marks[0]);

        // Method Overloading
        foo();
        foo(10);
        foo(3000, 4000);


    }
}
