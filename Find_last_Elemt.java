import java.util.Scanner;

public class Find_last_Elemt {
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
          

         int n = arr.length;
        // System.out.print("find the index array: ");
        // int num1 = sc.nextInt();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[n-1]==arr[i]){
            System.out.print(arr[i]+" last index value ");
            }

        }
        
    }
}
