import java.util.*;
public class evenoddsum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        int n;
        int evensum=0;
        int oddsum=0;
        do{
        System.out.println("Enter your number:");
        n=sc.nextInt();
        if(n%2==0){
            evensum+=n;
        }
        else{
            oddsum+=n;
        }
        System.out.println("Enter your choice press 1 if want to continue else press 0:");
        choice=sc.nextInt();
        }
        while(choice==1);
        System.out.println("evensum:"+evensum);
        System.out.println("Oddsum:"+oddsum);
    }
}
