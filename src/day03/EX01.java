package day03;

public class EX01 {
    public static void main(String[] args) {
        // Cow, Chicken : cry() - "음메", "꼬끼오"
        // Farm : getSound() - cow, chicken.cry()
        // Animal 상속 - 오버라이딩
        Cow cow = new Cow();
        Chicken chicken = new Chicken();
        Farm farm = new Farm(cow, chicken);
        farm.getSound();

    }
}

class Farm{
    Cow cow;
    Chicken chicken;

    Farm(Cow cow, Chicken chicken){
        this.cow = cow;
        this.chicken = chicken;
    }

    void feed(){
        cow.eat();
        chicken.eat();
    }

    void getSound(){
        cow.cry();
        chicken.cry();
    }
}

class Animal{
    void cry(){
        System.out.println("엉엉");
    }
    void eat(){
        System.out.println("냠냠");
    }
}

class Cow extends Animal{
    @Override
    void cry(){
        System.out.println("음메");
    }
}

class Chicken extends Animal{
    void cry(){
        System.out.println("꼬끼오");
    }
}