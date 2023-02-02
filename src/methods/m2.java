package methods;

import java.util.Scanner;

class m2 {
    public static void main(String[] args) {

        System.out.println( "select image :"+
           " 1)sunset "+
            " 2)earth "+
           " 3)desert " );
        Scanner scan= new Scanner(System.in);
       int selection =scan.nextInt();

       switch (selection){

           case 1:
               printSunset();
               break;
           case 2:
               printEarth();
               break;
           case 3:
               printDesert();
               break;
       }


    }
public static void printSunset(){
    System.out.println("_");
}

public static void printEarth(){
    System.out.println("+");
}
public static void printDesert(){
    System.out.println("/");
}
}
