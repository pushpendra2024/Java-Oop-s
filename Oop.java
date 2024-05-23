/*class Student {
    final String name = "lusia" ; // final keyword used for fix variable and after this use we cant change in object creating time 
    int roll;
    int age ;

}

public class Oop{
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.name);
    }
}*/


//without final keyword class creating

class Student{
    final String name = "Annu";
    int roll;
    int age;

    void print(){
        this.name = name ;
        this.roll = roll;
        this.age  = age;
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll);
    }
}

public class Oop{
    public static void main(String[] args) {
        Student s1 = new Student();
       // s1.name = "Asha ";
        s1.print();
    }
}