public class pattern02 {
    public static void main(String[] args) {
        int i,k,j,n;
        n =5;
        for(i =1;i<=n;i++){
            for(j =1; j<=i;j++ ){

                System.out.print(" ");
            }
            for( k = 1; k<=n-i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
