import java.util.Scanner;

public class Copy_Another_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.print("Enter a number to store in array: ");
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] +" ");
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        // craete new array

        int[] array = new int[n];

      //  they are refre same location
        // array = arr;

        // Copying elements of arr[] to array[]
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }

        // print old array
        System.out.print("This is Old  array: ");
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("}");
        System.out.print("This is New  array: ");
        // print new array which one copy old array to new array.
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
          
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("}");
    }
}
