import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer value");
        int value = input.nextInt();
        int i,count=0;
       for(i=2;i<value;i++) {
           if (value % i == 0) {
               count++;
               break;
           }
       }
        if(value==0){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }

    }
}