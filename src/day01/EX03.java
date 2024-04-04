package day01;

public class EX03 {
    public static void main(String[] args) {
        int age = 27;

        if( age >= 30){
            System.out.println("30대");
        }else if( age >= 20){
            System.out.println("20대");
        }
        else if( age >= 10){
            System.out.println("10대");
        }
        else{
            System.out.println("누구냐 너");
        }


        switch(age/10){
            case 3:
                System.out.println("30대");

        }
    }
}
