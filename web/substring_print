import java.util.*;

public class SameChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        
        if (len < 2){
            System.out.print("");
        } else if (len == 2){
            System.out.print(str + str);
        } else {
            StringBuilder result = new StringBuilder();
            result.append(str.substring(0, 2));
            result.append(str.substring(str.length()-2, str.length()));
            System.out.print(result);
        }
    }
}
