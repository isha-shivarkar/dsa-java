public class primefunc{
    public static void isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
             if (n%i==0){
                 isPrime=false;
                 }
        }
        if(isPrime==true){
            System.out.println("prime");
        }
        else{
            System.out.println("notprime");
        }
        
    }
    public static void main(String args[]){
        isPrime(3);
    }
}