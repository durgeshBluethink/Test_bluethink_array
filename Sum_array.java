import java.util.Scanner;

public class Sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of array: ");
        int num = sc.nextInt();

        int arr[]= new int [num];
        System.out.print("Enter a number to store in array: ");
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] +" ");
            arr[i] = sc.nextInt();
        }
        int n=arr.length;
        int sum=0;
     
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
          
        }
       
        System.out.print(sum +" Sum of araay value ");
    }
}
