import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();

        for(int i=1;i<=20;i++){
            System.out.println(number+ " * " + i + " = " + (number * i));
        }}}
