package day02;

public class EX04 {
    public static void main(String[] args) {
        Car bus = new Bus();
        System.out.println(bus.getClass()); //버스나온다 => 자식객체의 추가기능을 포기해야함
        bus.ride();
        
//        Bus bus1 = new Car();
        Taxi taxi = new Taxi();
        taxi.ride();
    }
}

// 버스
// 택시
// 메소드 : 달린다 (버스 - 부릉부릉, 택시 - 빵빵~)

//부모 클래스는 자식 클래스의 공통된 특징!
class Car{
    int wheels = 4;

    void getWheelNum(){
        System.out.println("바퀴가"+wheels+"개 입니다,");
    }
    void ride(){
        System.out.println("부아왕왕");
    }
}

class Taxi extends Car{
}

class Bus extends Car{
    Bus(){
        super();
    }
    void ride(){
        System.out.println("부릉부릉");
    }
}
