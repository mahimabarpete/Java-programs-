Take a number t as input representing count of input number to be tested
Solution:--
  import java.util.*;
  class StudentMarks {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=1; i<=t; i++){
      int n = sc.nextInt();
      int count=0;
      for(int j =2; j*j<=n; j++){
        if(n%j==0){
          count++;
          break;
        }
      }
      if(count==0){
        System.out.println("this is prime number");
      }
      else{
        System.out.println("not prime ");
      }
    }
  }
}
