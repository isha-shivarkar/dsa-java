import java.util.*;
public class sum_nwhloop{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no till which sum u need:");
    int n=sc.nextInt();
    int sum=0;
    for(int i = 0;i<=n;i++){
        sum+=i;
    }
    System.out.println("Sum of nos"+sum);
   }
}