import java.util.*;
import java.util.Arrays;

public class LargestNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        
        for (int i = 0; i < count; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int largest = arr[count - 1];
        int secondLargest = -1;
        
        for (int i = 0; i < count; i++){
            if (arr[i] == largest || arr[i] < secondLargest){
                continue;
            } else {
                secondLargest = arr[i];
            }
        }
        
        System.out.println("Largest Num: " + largest);
        System.out.println("Second Largest Num: " + secondLargest);
    }
}
