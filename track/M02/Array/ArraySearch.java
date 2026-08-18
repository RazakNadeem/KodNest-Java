import java.util.Scanner;
class ArraySearch1{
    void search(int arr[],int key){
        boolean found = false;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==key){
                System.out.println("Element found at index : "+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found...");
        }
    }

}
public class ArraySearch {
    public static void main(String[] args) {
    int arr[] = {20,100,50,80,30};
    ArraySearch1 as = new ArraySearch1();
    as.search(arr,50);

    }    
}
