package day01;

public class EX02 {
    // num변수의 값이 9이면 'A'
    // num변수의 값이 8이면 'B'
    // num변수의 값이 7이면 'C'
    // num변수의 값이 6이하면 'F'
    public static void main(String[] args) {
        int num = 8;
        switch (num) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("F");
                break;
            default:
                break;
        }
    }
}