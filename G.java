/* 
class Student7 {
    String name;
    int age;

    static int maxAge = 20;

    public static void main(String[] args) {
        Student7 a = new Student7();
        a.name = "golu";
        a.age = 12;
        
        Student7 b = new Student7();
        b.name = "bholu";
        b.age = 14;     
        
        b.showInfo();
        a.showInfo();
    }

    static void showInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(maxAge);
    }
}
*/
// G.java:21: error: non-static variable name cannot be referenced from a static context
//         System.out.println(name);
//                            ^
// G.java:22: error: non-static variable age cannot be referenced from a static context
//         System.out.println(age);
//                            ^
// 2 errors