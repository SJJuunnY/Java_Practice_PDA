package day02;

public class EX01 {
    public static void main(String[] args) {
        Animal cow = new Animal("소","음메음메~");
        cow.cry();
        cow.sound();
//        System.out.println(cow.name);
    }
}

// 동물 클래스 - 이름(생성자, 필드), 메소드 : 엉엉

class Animal{
    String name,sound;

    Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
        System.out.println(name+"만들어 졌습니다~");
    }
    public void cry(){
        System.out.println("안녕 내이름 "+this.name+",  내가 울어볼게 하나 둘 셋 얍 엉엉~");
    }
    void sound(){
        System.out.println(sound);
    }
}