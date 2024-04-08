package day03;

public class EX05 {
    // OTT : Netflix, Tving
    // printOpeningLogo() : sout "넷플릭스", "티빙"
    // netflix.play() -> prinOpen... "영상시작"
    // netflix.finish() : sout "다봤다"

    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        netflix.play();
        netflix.finish();
    }
}

abstract class OTT{
    String name;
    abstract void printOpeningLogo();
    void play(){
        printOpeningLogo();
        System.out.println("영상 시작~");
    };
    void finish(){
        System.out.println("다봤다~");
    };
}
class Netflix extends OTT{
    String name = "Netflix";
    @Override
    void printOpeningLogo() {
        System.out.println(name);
    }

}
class Tving extends OTT{
    String name = "티빙";
    @Override
    void printOpeningLogo() {
        System.out.println(name);
    }
}