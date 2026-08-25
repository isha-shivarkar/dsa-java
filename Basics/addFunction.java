 import java.util.*;
 public class addFunction{
    public static int calsum(int a,int b){
        int sum=a+b;
        return sum;
        }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int sum=calsum(a1,b1);
        System.out.println("sum is:"+sum);
    }
 }