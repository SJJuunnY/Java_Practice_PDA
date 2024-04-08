package day03;

public class EX06 {
    public static void main(String[] args) {
        // Apple phone, isOn = False; 동사4개 =>(is use has get)
        // charge() + 10
        // useKaKaotalk() -5
        // useYoutube() - 10
        // 배터리 용량확인
        // turnOn
        // turn off

        Person son = new Person();
        ApplePhone iphone16 = new ApplePhone();
        son.buyPhone(iphone16);

        SamsungPhone galaxy2223 = new SamsungPhone();
//        son.buyPhone(galaxy2223);
    }
}

class Person{
//    ApplePhone phone;
    Phone phone;

    // buyPhone
    void buyPhone(ApplePhone phone){
        this.phone = phone;
    }
    // Charge
    void chargePhone(){
        phone.charge();
    }
}

interface Phone{
    // 1. 구현체가 어떤 게 오든 받아줄 수 있게
    //    타입형태로 제시하기 위함
    // 2. 구현체(객체)를 필요 = 구현체 사용 = 메소드 호출 => 매소드 이름, 매개변수 통일 => 매소드 선언 통일
    
    int capacity=0;
    void charge();
    void operateKakao();
    void useYoutube();
    void turnOn();
    void turnOff();
    void checkBatteryStatus();
}

class SamsungPhone implements Phone{
    private final int BATTERY_CAPA = 100; //
    private int battery_status = 70; //배터리 현재용량
    private boolean isOn = false;

    boolean getIsOn(){
        return isOn;
    }

    public void charge(){
        if( battery_status == 100){
            System.out.println("100%입니다");
        } else{
            battery_status = battery_status  >= 95 ? 100 : battery_status + 5;
            System.out.println(battery_status+"%가 되었습니다.");
        }
    }

    public void useYoutube(){
        if(isOn){
            battery_status -= 10;
            if(battery_status==0) {
                turnOff();
            }
        }
    }

    public void operateKakao(){
        //켜져있으면 => 쓰면 된다
        if(isOn){
            battery_status -= 5;
            if(battery_status==0) {
                turnOff();
            }
        }
    }
    public void turnOn(){
        System.out.println("폰 키기 완료");
        isOn = true;
    }
    public void turnOff(){
        System.out.println("폰 끕니다 수고");
        isOn = false;
    }
    public void checkBatteryStatus(){
        System.out.println("배터리 용량 : "+battery_status+"% 입니다");
    }
}

class ApplePhone implements Phone{
    private final int BATTERY_CAPA = 100; //
    private int battery_status = 70; //배터리 현재용량
    private boolean isOn = false;

    boolean getIsOn(){
        return isOn;
    }

    public void charge(){
        if( battery_status == 100){
            System.out.println("100%입니다");
        } else{
            battery_status = battery_status  >= 95 ? 100 : battery_status + 5;
            System.out.println(battery_status+"%가 되었습니다.");
        }
    }

    public void useYoutube(){
        if(isOn){
            battery_status -= 10;
            if(battery_status==0) {
                turnOff();
            }
        }
    }

    public void operateKakao(){
        //켜져있으면 => 쓰면 된다
        if(isOn){
            battery_status -= 5;
            if(battery_status==0) {
                turnOff();
            }
        }
    }
    public void turnOn(){
        System.out.println("폰 키기 완료");
        isOn = true;
    }
    public void turnOff(){
        System.out.println("폰 끕니다 수고");
        isOn = false;
    }
    public void checkBatteryStatus(){
        System.out.println("배터리 용량 : "+battery_status+"% 입니다");
    }
}