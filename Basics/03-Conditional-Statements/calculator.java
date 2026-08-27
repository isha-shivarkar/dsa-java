import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter you choice!!");
        int operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("addition:"+ (a+b));
                break;
            case '-':
                System.out.println("substraction:"+ (a-b));
                break;
            case '*':
                System.out.println("Multiplication:"+ (a*b));
                break;
            case '/':
                System.out.println("Division:"+ (a/b));
                break;
            case '%':
                System.out.println("modulous:"+ (a%b));
                break;
            default:
                System.out.println("invalid choice!!!");
        }
    }
}