QUESTION - Print inverse of a number in java ?
SOLUTION -
import java.util.*;
public class InverseOfANumber {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int od = sc.nextInt();
     int op = 1;
     int inverse=0;
     while(od!=0){
    
       int dig = od%10;
       int ip= dig;
       int id = op;
       inverse = inverse + (int)Math.pow(10,ip-1)*id;
       od=od/10;
       op++;
     }
     System.out.println(inverse);
    }
}