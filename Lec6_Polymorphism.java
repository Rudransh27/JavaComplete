// Polymorphism ->
// Method Overloading: same object behaves/responds differently on same command if one param is changed.--> Compile time polymorphism.

// Method Overriding: object and function it will call will depend on the type of reference variable.--> Run time polymorphism.

// static , final and private

// static method -> belong to the class, not the object.
// private method -> cannot be overriden because it is not visible to the subclass (if it cannot accessed by subclass then how can a subclass override it?).
// final method -> cannot be overridden because it is final and cannot be changed.
// Fields / variables cannot be polymorphic.

public class Lec6_Polymorphism {

    public static void main(String[] args) {
        // Here see that the static method belong to class so object a will not call the static method of class B but it will call the static method of class A because static methods are bound to class A.
        A a = new B();
        a.fun();

        // Here static method belong to class b so object b will call the static method of class B.
    
        B b = new B();
        b.fun();


        C c = new C();
        System.out.println(c.x); 

        D d = new D();
        System.out.println(d.x);

        C c1 = new D();
        System.out.println(c1.x);
    }

}

class A {
    static void fun() {
        System.out.println("Static method in class A");
    }

    private void fun2(){
        System.out.println("Private method in class A");
    }

    final void fun3(){
        System.out.println("Final method in class A");
    }
}

class B extends A {
    static void fun() {
        System.out.println("Static method in class B");
    }

    private void fun2(){
        System.out.println("Private method in class B");
    }

    // void fun3(){
    //     System.out.println("Final method in class B");
    // }
}



class C{
  int x=10;
}

class D extends C{
    int x=20;

}