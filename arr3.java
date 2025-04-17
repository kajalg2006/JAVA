public class arr3 {
    public static void main(String[] args) {
        
    
    int [] arr1 = {1,2,3,4,5};
    int[] arr2 = {1,2,3,4,5};
    int[] sum ={0,0,0,0,0}; 

    for(int i = 0; i<5;i++){
        int ans = arr1[i]+arr2[i];
        sum[i]= ans;
    }

    for(int i = 0; i<5; i++){

        System.out.println(sum [i]);
    }
}
}
