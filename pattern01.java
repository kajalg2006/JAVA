class pattern01{
    public static void main(String[] args) {
        int n,i,j;
        n=5;
        for(i =0 ; i<=n;i++){
            for(j =1; j<=n-i;j++ ){

                System.out.print(" ");
            }
            for(int k = 1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//     *
//    * *
//   * * *
//  * * * *
// * * * * *