import java.util.*;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no till which you want fibonacci series!!");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int third;
        System.out.print(first + " ");
        System.out.print(second+ " ");
        for(int i=2;i<=n;i++){
            third=first+second;
            System.out.print(third+ " ");
            first=second;
            second=third;
        }
        
    }
}

