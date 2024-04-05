package day03;

public class EX02 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        parent1.method();

        Child child = new Child();
        child.method();

        Parent parent2 = new Child();

        parent2.method();
//        parent2.metod();

//        child chile2 = parent2; //에러
        Child child2 = (Child) parent2; // 형변환

    }
}
class Parent{
    void method(){
        System.out.println("부모 메소드");
    }
}

class Child extends Parent{
    @Override
    void method(){
        System.out.println("자식 메소드");
    }
    void metod(){
        System.out.println("메토드");
    }
}