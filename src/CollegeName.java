import java.util.Scanner;

public class CollegeName {
    public static void main(String[] args) {
      Scanner eniya=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=eniya.nextLine();

        System.out.println("What is Your mobile number? ");
        int mobileNumber=eniya.nextInt();

        System.out.println("Are you taking attanance");
        boolean attanance=eniya.nextBoolean();

        System.out.println("Your Name is:"+name);
        System.out.println("Enter your mobile number:"+mobileNumber);
        System.out.println("Taking attanance:"+attanance);
    }
}
