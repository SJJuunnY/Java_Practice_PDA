package day02;

public class EX02 {
    public static void main(String[] args) {
//        Coffee americano = new Coffee(5000,false,"Venti");
        Coffee americano = new Coffee(false,"venti");
//        americano.setPrice(500);
        americano.getInfo();

        Barista chunsik = new Barista("엄춘식");
        chunsik.getCoffeeInfo(americano);
    }
}
// 커피
// 필드 : 가격, 핫 or 아이스, 사이즈
// 메소드 : getInfo - sout(가격, 핫 or 아이스)
class Coffee{
    private int price;
    private boolean isHot;
    private String size;
    Coffee(int price, boolean isHot, String size){
        this.price = price;
        this.isHot = isHot;
        this.size = size;
    }
    // 생성자 오버로딩을 사용하여 가격을 포함한 버전과 가격을 포함하지 않은 버전을 만듭니다.
    Coffee(boolean isHot, String size){
        this.isHot = isHot;
        this.size = size;
    }

    void setPrice(int price){
        // 필드 값 설정 'set'
        // 변경할 값을 검증하는 용도로 사용
        if(price>= this.price)
            this.price = price;
    }
    int getPrice(){
        return price;
    }
    void getInfo(){
        final String temp = isHot ? "핫" : "아이스";
        System.out.println("너 "+price+"원짜리 "+temp+"시켰찌? " + size+"사이즈로;");
    }
}

class Barista{
    String name;
    Coffee coffee;
    Barista(String name){
        this.name = name;
    }
    void getCoffeeInfo(Coffee coffee){
        int price = coffee.getPrice();
        System.out.println("이 커피는"+price+"원입니다");
    }
    Coffee makeCoffee(){
        System.out.println("커피 여기있다~");
        return coffee;
    }

}