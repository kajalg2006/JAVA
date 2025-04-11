import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    //     for(int  i = 0 ; i<n;i++){
    //         System.out.print(i+" ");
    //     }
    //     int a= 0;
    //  System.out.println("printing number through while");
    //     while (a<n) {
    //         System.out.print(a+" ");
    //         a++;
    //     }


    /// S um of n natural number 
    // int i=0; int  sum=0 ;
    // while(i<=n){
    //    sum= sum+i;
    // }
    // System.out.println(sum);

    //Multiplication table of number 
    
    // for(int  i = 1 ; i<=10; i++){
    //     System.out.println(i*n);
    // }


//  reverse the number 
    // int revnum= 0; 
    // while(n != 0 ){
    //   int digit  = n%10;
    //   revnum = revnum*10+digit;
    //   n = n/10;
    // }
    // System.out.println(revnum);
    //  }

    //prime number
    int check=0;
    for(int  i = 0; i<=n;i++){
        if(n%i==0){
            System.out.println("is not prime ");
            check=1;
            
        }
    }
    if(check==0){
        System.out.println("is  prime");
    }

    //factorial
    for(int i = 0; i<=n;i++){
        
    }

}

}
