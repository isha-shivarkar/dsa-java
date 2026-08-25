public class printreversenum{
    public static void main(String args[]){
        int n=20906;
        while(n>0){
            int lastdig=n%10;
            System.out.println(lastdig);
            n/=10;
        }
    }
}