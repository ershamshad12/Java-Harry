public class CWH_29_Ch6_Ps6_Q {
    public static void main(String[] args) {

        // Question 1

        /*
        float [] marks={71.5f, 62.5f, 93.5f, 84.5f, 75.5f};
        float sum = 0;

        for (float element: marks){
            sum =sum+ element;
        }
            System.out.println(sum);

        // Question 2

        float [] marks={71.5f, 62.5f, 93.5f, 84.5f, 75.5f};
        float num = 62.5f;
        boolean isInArray = false;

        for (float element: marks){

            if (num == element){
                isInArray = true;
                break;
            }

        }
        if (isInArray){
            System.out.println("The value is present in the Array");
        }
        else {
            System.out.println("The value is not present in the Array");
        }

        // Question 3

        int [] marks = {50, 60, 70, 80, 90};
        int sum=0;

        for (int n: marks){
            sum += n;
        }
        System.out.println("Total marks are: " + sum);

        int avg= sum/marks.length;
        System.out.println(avg);

        // Questuions 4

        int [][] mat1= {{1, 2, 3},
                       {4, 5, 6}};

        int [][] mat2= {{2, 6, 13},
                       {3, 7, 1}};

        int [][] result= {{0, 0, 0},
                       {0, 0, 0}};

        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.printf("setting value for i=%d and j=%d\n",i,j);
                result[i][j]= mat1[i][j] + mat2[i][j];

            }
        }
        System.out.println("Printing the element of 2D's Arrays");
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j]= mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // prints a new line
        }

        // Questions 5

        int [] num ={1, 82, 3, 45, 55};
        int ln= num.length;

        for(int i=ln-1; i>=0; i--){
            System.out.print(num[i] +" ");
        }
        System.out.println("");

        int [] arr = {1, 2, 3, 4, 5};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i = 0; i<n; i++){
            // swap arr[i] and arr[l-1-i]
            // a    b   temp
            // |4| |3|

            temp =arr[i];
            arr[i]= arr[l-1-i];
            arr[l-1-i]= temp;
        }

        for (int ele: arr){
            System.out.print(ele + " ");
        }

        // Questions 6

        int [] arr = {50, 600, 2, -280, 90, 250};
        int max =  Integer.MIN_VALUE;

        for (int el: arr){
            if (el > max){
                max = el;
            }
        }
            System.out.println("The value of the maximum elements in this array is : " + max);
         */

        // Questions 8

        int [] arr ={50,55,60,90,10};
        boolean isSorted = true;

        for (int i =0; i<arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
            if(isSorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }

    }
}
