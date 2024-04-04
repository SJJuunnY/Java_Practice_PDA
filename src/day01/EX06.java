package day01;

public class EX06 {
    public static void main(String[] args) {
        Person Songa = new Person("손가");
        System.out.println((Songa.name));
        Person kelly = new Person("켈리");
        Person Jason = new Person("제이슨");
    }
}

class Person{
    //변수 ( =부품)
    String name;


    Person(String name){
        this.name = name;
    }
}
