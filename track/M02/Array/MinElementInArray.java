import java.util.Scanner;
public class MinElementInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i] + " ");

        }
        System.out.println();
        int min = arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Element is: "+min);
    }
} 
    
