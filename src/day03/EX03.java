package day03;

public class EX03 {
    public static void main(String[] args) {
        // class Garden
        // getSound(): 매개변수로 전발받은 '동물' 매개변수.cry()
        // class Dog, Cat extends Pet
        // cry()
        Dog dog = new Dog();
        Cat cat = new Cat();
        Gardne gardne = new Gardne();
        gardne.getSound(dog, cat);
        gardne.getSound(dog);
        gardne.getSound(cat);

    }
}
class Gardne{
    void getSound(Dog dog, Cat  cat){
        dog.cry();
        cat.cry();
    }
    void getSound(Pet pet){
        pet.cry();
    }
}

abstract class Pet{
    abstract void cry();
}


class Dog extends Pet{
    @Override
    void cry(){
        System.out.println("멍멍");
    }
}
class Cat extends Pet{
    @Override
    void cry(){
        System.out.println("냐옹띠");
    }
}