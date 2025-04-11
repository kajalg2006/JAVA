public class Leap_year {
    public static void main(String[] args) {
        int year=  2025;
        if(year%4==0 &&(year%100!=0|| year%400 ==0)){
             System.out.println("leap year"+year);
        }

        else{
            System.out.println("not a leap year"+year);
        }
    }
}
