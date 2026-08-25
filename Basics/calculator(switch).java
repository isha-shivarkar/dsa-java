public class calculatorswitch{
    public static void main(String args[]){
        int a=10,b=5;
        int ch;
        switch(ch){
            case 1:
                System.out.println("addition:"+ (a+b));
                break;
            case 2:
                System.out.println("substraction:"+ (a-b));
                break;
            case 3:
                System.out.printl("Multiplication:"+ (a*b));
                break;
            case 4:
                System.out.println("Division:"+ (a/b));
                break;
            case 5:
                System.out.println("modulous:"+ (a%b));
                break;
            default:
                System.out.println("invalid choice!!!");
        }
    }
}