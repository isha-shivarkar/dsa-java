import java.util.*;
public class IncomeTaxCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int tax;
        if(salary < 500000){
            tax=0;
            System.out.println("no tax");
        }
        else if(salary>=500000 && salary<=100000){
            tax=(int)(salary*0.2);
            System.out.println("tax:"+tax);
        }
        else
        tax = (int)(salary*0.3);
        System.out.println("tax:"+tax);
    }}