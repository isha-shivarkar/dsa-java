public class reversenum{
    public static void main(String args[]){
       int n=1234;
       int lastdig;
       while(n>0){
        lastdig = n%10;
        System.out.print(lastdig);
        n=n/10;
       }    
        }
}