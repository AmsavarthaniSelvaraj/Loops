public class LeftIncreasing {
    public static void main(String... args) {
        int n = 5;
        /*for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.println(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}*/
      /*  for (int i =1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++) {
            for (int j=n;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
        int count=1;
        for (int i =1;i<=count;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                count++;
            }
            System.out.println();
        }}}
