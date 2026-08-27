import java.util.*;
public class print1_nwhloop{
    public static void main(String args[]){
        int counter=1;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
}