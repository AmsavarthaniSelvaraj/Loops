public class ReverseNumber {
    public static void main(String[] args) {
        int num=656;
        int backup=num;
        int rev=0;

        while(num>0){
            rev=rev*10 + num%10;
            num=num/10;
        }
        if(backup==rev){
            System.out.println("palindrome");
        } else
        {
            System.out.println("not palindrome");
        }
    }
}
