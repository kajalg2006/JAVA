import java.util.Scanner;

public class IF {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // int a = scn.nextInt();
        // int b = scn.nextInt();

        // if(a>b){
        //     System.out.println("a is greter than b");
        // }
        // else{
        //     System.out.println("b is greter than a");
        // }


        // if(n%5==0 && n%11==0){
        //     System.out.println("number is divisible by 5 and 11");
        // }
        // else{
        //     System.out.println("number is not  divisible by 5 and 11");
        // }

        if(n%3== 0){
            System.out.println("number is multiple of 3");
        }
        
        else{
            System.out.println("number is not  multiple of 3");
            
        }
    }
}
