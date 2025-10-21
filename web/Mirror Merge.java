import java.util.*;

public class SameChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        StringBuilder result = new StringBuilder();
        
        int left = 0;
        int right = str.length()-1;
        
        while (left <= right){
            result.append(str.charAt(left));
            if (left != right){
                result.append(str.charAt(right));
            }
            left++;
            right--;
        }
        
        System.out.print(result.toString());
    }
}
