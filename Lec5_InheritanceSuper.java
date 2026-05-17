public class Lec5_InheritanceSuper {

    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent("Tejas", 20, 101, "IIT Bombay");
        es.print();
    }
}


class Student{
    String name;
    int age;
    int rollNo;

    Student(){
        System.out.println("Default Constructor");
    }

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void print(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollNo);
    }

}

class EngineeringStudent extends Student{
    String college;

    EngineeringStudent(String name, int age, int rollNo, String college){
        super(name, age, rollNo);
        this.college=college;
    }

    void print(){
        super.print();
        System.out.println("College: "+college);
    }

}