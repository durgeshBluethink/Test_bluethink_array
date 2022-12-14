import java.util.Scanner;

public class find_first_second_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of array: ");
        int num = sc.nextInt();

        int arr[]= new int [num];
        System.out.print("Enter a number to store in array: ");
        for (int i = 0; i < arr.length; i++) {
           
            arr[i] = sc.nextInt();
        }
        // int n
        int n=arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
  
        for (int i = 0; i < arr.length; i++) {
           if (first < arr[i]) {
              second = first;
              first = arr[i];
           } else if (second < arr[i]) {
              second = arr[i];
           }
        }
        System.out.println("Top two numbers: \nFirst: " 
                       + first + "\nSecond: " + second);
     }
    }

