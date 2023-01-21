package HomeWork15;

import java.util.Scanner;

public class Drinks {

    private int COFFEE_PRICE = 40;
    private int TEA_PRICE = 23;
    private int LEMONADE_PRICE = 21;
    private int MOJITO_PRICE = 30;
    private int MINERALWATER_PRICE = 12;
    private int COCA_COLA_PRICE = 17;
    Scanner scn = new Scanner(System.in);

    public int coffePrepaer(){
        System.out.println("Coffe price :" + COFFEE_PRICE + "UAH");
        System.out.println("Enter number of servings:");
        int number = scn.nextInt();
        COFFEE_PRICE = COFFEE_PRICE * number;
        System.out.println("Y have chosen " + number + " portions coffee " + " from you " + COFFEE_PRICE);
        return number;
    }
    public int teaPrepaer(){
        System.out.println("Tea price :" + TEA_PRICE + "UAH");
        System.out.println("Enter number of servings:");
        int number = scn.nextInt();
        TEA_PRICE = COFFEE_PRICE * number;
        System.out.println("Y have chosen " + number + " portions tea " + " from you " + TEA_PRICE);
        return number;
    }
    public int lemonadePrepaer(){
        System.out.println("Lemonade price :" + LEMONADE_PRICE+ "UAH");
        System.out.println("Enter number of servings:");
        int number = scn.nextInt();
        LEMONADE_PRICE = LEMONADE_PRICE * number;
        System.out.println("Y have chosen " + number + " portions lemonade " + " from you " + LEMONADE_PRICE);
        return number;
    }
    public  int mojitoPrepaer(){
        System.out.println("Mojito price :" + MOJITO_PRICE + "UAH");
        System.out.println("Enter number of servings:");
        int number = scn.nextInt();
        MOJITO_PRICE = MOJITO_PRICE * number;
        System.out.println("Y have chosen " + number + " portions mojito " + " from you " + MOJITO_PRICE);
        return number;
    }
    public int mineralWaterPrepaer(){
        System.out.println("Mineral Water price :" + MINERALWATER_PRICE + "UAH");
        System.out.println("Enter number of servings:");
        int number = scn.nextInt();
        MINERALWATER_PRICE = MINERALWATER_PRICE * number;
        System.out.println("Y have chosen " + number + " portions mineral water " + " from you " + MINERALWATER_PRICE);
        return number;
    }
    public int cocaColaPrepaer(){
        System.out.println("Coca-Cola price :" + COCA_COLA_PRICE + "UAH");
        System.out.println("Enter number of servings:");
        int number = scn.nextInt();
        COCA_COLA_PRICE = COCA_COLA_PRICE * number;
        System.out.println("Y have chosen " + number + " portions Coca-Cola " + " from you " + COCA_COLA_PRICE);
        return number;
    }




}






