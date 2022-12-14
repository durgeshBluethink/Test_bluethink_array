import java.util.Scanner;

class Store_array{
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
    

  System.out.print("{");
  for (int i = 0; i < arr.length; i++) {
    
    if(i>0){
    System.out.print(", ");
    }
    System.out.print(arr[i]+" ");
  }
  System.out.print("}");
   }
}