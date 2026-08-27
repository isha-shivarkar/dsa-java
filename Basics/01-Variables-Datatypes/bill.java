import java.util.*;
public class bill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of items:");
        System.out.println("Enter price of pencil:");
        float pencil=sc.nextInt();
        System.out.println("Enter price of pen:");
        float pen=sc.nextInt();
        System.out.println("Enter price of pen");
        float eraser=sc.nextInt();
        double bill=pencil+pen+eraser;
        System.out.println("Bill :"+ bill);
        double finalbill=(bill*0.18f)+bill;
        System.out.println("Final Bill with 18%gst:"+finalbill);   
    }
}