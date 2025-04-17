public class arr4 {
    public static void main(String[] args) {
        int  arr1[] ={1,4,5,3};
        int  arr2[]= {2,3,4,7};
        int count = 0;

        for(int i = 0 ; i<4;i++){
            for(int  j =0; j<4;j++){
                if(arr1[i]== arr2[j]){
                  count++;
                  arr2[j]= -1;
                  System.out.println(arr1[i]);
                }
            }
        }
        System.out.println("NUmber of common element is "+count);
    }
}
