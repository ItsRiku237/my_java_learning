import java.util.*;

//WAP in Java to define an array of n element and find
//  the smallest and the largest element in the array.

public class J_06_Array_Min_Max {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i = 1;i<n;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        int smallest = arr[0];
        for(int i = 1;i<n;i++){
            if(smallest>arr[i]){
                smallest= arr[i];
            }
        }
        System.out.println("Largest number is : "+largest);
        System.out.println("Smallest number is : "+smallest);
    }
}
