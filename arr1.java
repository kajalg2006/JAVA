import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        // int[] arr = {1,3,4,5,6,7};
        // for(int i = 0; i<arr.length; i++){
        // System.out.println(arr[i]);
        // }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value of arr");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int k = 0; k <= arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
