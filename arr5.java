public class arr5 {
    public static void main(String[] args) {
        int[ ] arr1= {1,3,2};
        int [] arr2 = {1,5,5};

        for(int i = 0 ; i<3;i++ ){
            for(int j = 0; j<3; j++){
                if(arr1[i]==arr2[j]){
                  arr2[j]= -1;
                  arr1[i]= -1;
                }
            }
        }

       

        for(int i = 0; i<3;i++){
            if(arr1[i]!=-1){
            System.out.print(" "+arr1[i]);

            }
        }
        System.out.println();
        for(int i = 0; i<3;i++){
            if(arr2[i]!=-1){
            System.out.print(" "+arr2[i]);
            }
        }
    }
}
