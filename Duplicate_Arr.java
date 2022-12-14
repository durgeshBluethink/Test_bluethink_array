
import java.util.Scanner;

public class Duplicate_Arr {

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
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[i] = i + 1;
                    if (i > 0)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(arr[j]);
                    
                }
            }
        }
        System.out.print("}");

    }
}