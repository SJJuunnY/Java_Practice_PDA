package day02;
public class EX03 {
    public static void main(String[] args) {
        User son = new User("소농민","야~ 내가 핸드폰 켜볼게");
        User beckham = new User("벡컴","let me turn on");
        
        (new Phone()).sound(); //일반폰띠리링
        
        //한국폰 사기
        SamsungPhone koreaPhone = new SamsungPhone("삐리릭");
//        System.out.println(koreaPhone.getBrand());
        son.buy(koreaPhone);
        
        // 영국폰 사기
        ApplePhone englishPhone = new ApplePhone("bbeep");
        beckham.buy(englishPhone);
        
        //폰 켜기
        son.turnOn();
        beckham.turnOn();
    }
}
//    Q. 우리는 상점에서 핸드폰을 구매합니다
//        소니가 핸드폰을 샀습니다.
//        베컴도 핸드폰을 샀습니다.
//        소니가 핸드폰을 켰습니다.
//        “야 내 핸드폰 켜볼게”
//        “삐비빅” (핸드폰이 내는 소리)
//        베컴도 핸드폰을 켰습니다.
//        “turn on”
//        “bbeep”s
class Phone{
    String sound = "일반폰띠리링";
    String brand = "노브랜드";
    void sound(){
        System.out.println(sound);
    }
    String getBrand(){
        return brand;
    }
}
class SamsungPhone extends Phone{
    String brand = "Samsung";
    String sound;
    SamsungPhone(String sound){
        this.sound = sound;
    }
    String getBrand(){
        return brand;
    }
}

class ApplePhone extends Phone{
    String brand = "Apple";
    String sound;
    ApplePhone(String sound){
        this.sound = sound;
    }
    String getBrand(){
        return brand;
    }
}
class User{
    String userName;
    Phone phone;
    String turnOnSpeaking;
    User(String name, String turnOnSpeaking){
        this.userName = name;
        this.turnOnSpeaking = turnOnSpeaking;
    }
    void turnOn(){
        System.out.println(userName+"이 핸드폰을 켰습니다.");
        System.out.println(turnOnSpeaking);
        this.phone.sound();
    }
    void buy(Phone phone){
        System.out.println(userName+"이"+phone.getBrand()+"핸드폰을 샀습니다.");
        this.phone = phone;
    }
}