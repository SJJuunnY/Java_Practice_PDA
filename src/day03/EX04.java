package day03;

public class EX04 {
    public static void main(String[] args) {
        // 레시피 - 슈퍼 : getInfo 이 레시피 00의 레시피ㅣ
        // 파스타레시피 - 자식 : makeSauce
        // 스테이크레시피 - 자식 : grill ~~
        PastaReceipt pastaReceipt = new PastaReceipt("파스타");
        pastaReceipt.getInfo();
    }
}

abstract class Receipt{
    String name;
    Receipt(String name){
        this.name = name;
    }

    abstract void getInfo();
}
class PastaReceipt extends Receipt{
    String name;
    PastaReceipt(String name){
        super(name);
    }
    @Override
    void getInfo() {
        System.out.println("이 레시피는 "+name+"란다~ 꼽냐?");
    }
}
class StakeReceipt extends  Receipt{
    String name = "스테이크";
    StakeReceipt(String name){
        super(name);
    }
    @Override
    void getInfo() {
        System.out.println("이 레시피는 "+name+"이란다~ 꼽냐?");
    }
}