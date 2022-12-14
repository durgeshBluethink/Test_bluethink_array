import java.util.Scanner;

public class find_Avar_index {
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





        // Somthing Wrog



         

        int n=arr.length;
        int   mid=0;
        for (int i = 0; i < arr.length; i++) {
            int s=i;
            int e =n-1;
            mid = (s+e)/2;
        }
        System.out.println(mid);
    }
}
