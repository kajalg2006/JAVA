public class arr2 {
    public static void main(String[] args) {
        
        int [] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int sum =0;
        for(int i =0; i<5;i++){
            sum= sum+arr1[i];
        }

        for(int i =0; i<5;i++){
            sum= sum+arr2[i];
        }

        System.out.println(sum);
    }
}
