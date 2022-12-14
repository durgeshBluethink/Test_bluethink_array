import java.util.Scanner;

public class Find_mix_value {
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
        int Max =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>Max){
                int temp = arr[i];
                Max = temp;   
            }
        }
        System.out.println(Max+" Max value of array");
    }
}
