import java.util.Scanner;

public class Find_min_value {
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
        int min=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int  temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;   
                }
                min=arr[j];
                
            }

        }
        System.out.println(min+" Min value of array");
    }
}
