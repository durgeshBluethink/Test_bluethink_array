import java.util.Scanner;
public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of array: ");
        int num = sc.nextInt();

        int arr[]= new int [num];
        System.out.print("Enter a number to store in array: ");
        for (int i = 0; i < arr.length; i++) {
           
            arr[i] = sc.nextInt();
        }


        int n=arr.length;
        for (int i = n-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
