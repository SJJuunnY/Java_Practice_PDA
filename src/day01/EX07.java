package day01;

public class EX07 {
    public static void main(String[] args) {
        // 객체 생성
        // 2개 (삼성,LG)
        // 객체의 변수 출력( 브랜드)
        NoteBook samsung = new NoteBook("삼성");
        NoteBook LG = new NoteBook("LG");

        System.out.println(samsung.brand);
        System.out.println(LG.brand);
    }
}

class NoteBook{
    String brand;
    NoteBook(String brand){
        this.brand = brand;
    }
}