public class Assignment2 {
    public static void main(String[] args) {
        //creating test array 1
        int size1 = 5;
        int[] arr1 = {0, 1, 2, 3, 4};

        //creating test array 2
        int size2 = 100;
        int[] array2 = new int[100];
        for(int index = 0; index < size2; index++){
            array2[index] = index;
        }

        //Print to the screen the number of even entries
        System.out.println("The total number of even numbers in arr1 are:");
        System.out.println(countEvenNum(size1, arr1));
        System.out.println("The total number of even numbers in array2 are:");
        System.out.println(countEvenNum(size2, array2));

    }

    //Method to determine the number of even entries in an array, returns the number of even entries
    public static int countEvenNum(int size, int [] array) {
        int even = 0;
        for(int i = 0; i < size; i++) {
            if(array[i] % 2 == 0) {
                even++;
            }
        }

        return even;
    }
}
