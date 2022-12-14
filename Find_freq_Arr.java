import java.util.Scanner;

class Findfreqarray
{
    public static void main(String args[])
    {
        int num, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to insert in an array: ");
        num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter elements to insert in an array: ");
        for(int i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
            
        }
        System.out.println(" ");
        for(int i=0;i<num;i++)
        {
            count=1;
            for(int j=i+1;j<=num-1;j++)
            {
                if(arr[i]==arr[j] && arr[i]!='\0')
                {
                    count++;
                    arr[j] = '\0';
                }
            }
            if(arr[i]!='\0')
            {
                System.out.println(arr[i] + " is " + count + " times.\n");
            }
        }        
    }
}