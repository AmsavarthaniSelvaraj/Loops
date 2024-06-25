public class Fibonacci {
    public static void main(String[] args) {
       int f=1;
       int s=2,t;
        for(int i=1;i<=20;i++) {
           if(f==21){
                break;
            }
            System.out.println(f);
            t=f+s;
            f=s;
            s=t;
        }
    }
}
