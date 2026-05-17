// 1. Why one public class per file?
// 2. Why name of the public class should be same as file name?

// JVM --> Demo.java. --> Demo.main()

// Autoboxing and Unboxing is used in three scenarios:
// 1. Assignments
// 2. Method calls
// 3. Arithmetic operations

public class Lec7_AutoBoxingUnBoxing {

    public static void main(String[] args) {

        // Autoboxing
        // int x = 10;
        // Integer y = x; // autoboxing by Integer y=Integer.valueOf(x); method

        // System.out.println(x);
        // System.out.println(y); // unboxing

        // //Unboxing
        // Integer a = 20; // Autoboxing
        // int b = a; // unboxing

        // System.out.println(a); // unboxing by a.intValue() method
        // System.out.println(b);

        // int x = 50;
        // printInteger(x);

        // Integer a = 10;
        // Integer b = 20;

        // int sum = a.intValue() + b.intValue();
        // System.out.println(sum);

        // Integer x = null;
        // int y = x;

        // System.out.println(y);


          // int x = 100;
        // int y = 100;

        // System.out.println(x == y);

        Integer a = 200;
        Integer b = 200;
        // a == b --> If a and b points to same reference

        System.out.println(a==b);

        Integer c = 100;
        Integer d = 100;
        

        System.out.println(a==b);// it will return true because of Integer caching for values between -128 to 127. So c and d will point to same reference in memory.
    }

    static void printInteger(Integer x) {
        System.out.println(x);
    }

}


