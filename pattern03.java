public class pattern03 {
    public static void main(String[] args) {
        int i , j  ; 
         int n = 5; 
          for( i =1; i<=n;i++){
            char ch = 'A';
            for(j =1; j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
          }
    }
}
