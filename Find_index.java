import java.util.Scanner;

public class Find_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of array: ");
        int num = sc.nextInt();

        int arr[]= new int [num];
        System.out.print("Enter all the element to store in array: ");
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] +" ");
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        System.out.print("Enter the value to find an index: ");
        int num1 = sc.nextInt();
       
        for (int i = 0; i <  arr.length; i++) {
            // System.out.println(i);
             if (arr[i]==num1) {
                System.out.print(i+" index");
                break;
             }

}
    }
}