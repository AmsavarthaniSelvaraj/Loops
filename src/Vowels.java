public class Vowels {
    public static void main(String[] args) {
        String name = "someone";
       int count=0;
        for(int i=0;i<name.length();i++){
       char ch = name.charAt(i);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':count++;

        }
        }
        System.out.println("count of the vowels is:"+count);

    }
}
