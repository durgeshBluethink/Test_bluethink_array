import java.util.Scanner;

public class Cheak_value_given {
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
        System.out.print("give a value to check in  array: ");
        int num1 = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {

            if(num1==arr[i]){
                System.out.println(arr[i]+" is  present in this array ");
            
            }

        }
        
    }
}
