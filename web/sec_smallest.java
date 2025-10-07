import java.util.Scanner;
import java.util.Arrays;

public class SecSmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        
        for (int i = 0; i < count; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < count; i++){
            if (arr[i] > secSmallest || arr[i] == smallest){
                continue;
            } else {
                secSmallest = arr[i];
            }
        }
        
        System.out.println("Smallest: " + smallest);
        System.out.println("Second smallest: " + secSmallest);
    }
}
