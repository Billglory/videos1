package methods;

import java.util.Scanner;

class m1 {

    public static void main(String[] args) {
        plus();

    }
    public static void plus(){
Scanner scan= new Scanner(System.in);
        System.out.println("NUMBER1");
        int num1=scan.nextInt();

        System.out.println("NUMBER2");
        int num2=scan.nextInt();

        System.out.println("result:"+ (num1+num2));

    }
}
