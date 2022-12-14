import java.util.Scanner;

public class Desending_array {
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
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                    
                }
                
            }
        }
        System.out.println();
        System.out.print("print desending array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
