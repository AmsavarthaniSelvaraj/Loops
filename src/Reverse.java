package StringLearning;
public class Reverse {
    public static void main(String[] args) {
        var word="AGSE";
        java.lang.String word2="";
        for(int i=word.length()-1;i>=0;i--){
            word2 = word2 + word.charAt(i);
        }
        System.out.println(word2);
        if(word.equals(word2)) {
            System.out.println("palindrome");
        } else
        {
            System.out.println("not palindrome");
        }
    }
}
