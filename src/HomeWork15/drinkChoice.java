package HomeWork15;

import java.util.Arrays;
import java.util.Scanner;

public class drinkChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drinks drinks = new Drinks();
        boolean a = true;//условие для цикла
        while (a) {
            System.out.println("Choice drink: ");
            System.out.println(Arrays.toString(DrinksMachine.values()));//список напитков
            String choice = sc.nextLine();
            choice = choice.toUpperCase();
            DrinksMachine drinksAuto = DrinksMachine.valueOf(choice);//выбор напитка
            switch (drinksAuto) {
                case COFFEE:
                    drinks.coffePrepaer();
                    break;
                case TEA:
                    drinks.teaPrepaer();
                    break;
                case LEMONADE:
                    drinks.lemonadePrepaer();
                    break;
                case MAJITO:
                    drinks.mojitoPrepaer();
                    break;
                case MINERALWATER:
                    drinks.mineralWaterPrepaer();
                    break;
                case COCA_COLA:
                    drinks.cocaColaPrepaer();
                    break;
                default:
                    System.out.println("ERROR");
            }
            System.out.println("Do you want more? Yes/No");
            boolean moreDrinks = true;//условие для цикла
            while (moreDrinks) {
                String answer = sc.nextLine();
                if (answer.equals("No") || answer.equals("NO") || answer.equals("no")) {
                    System.out.println("Thanks for choosing us!" );
                    moreDrinks = false;
                    a = false;
                } else if (answer.equals("Yes") || answer.equals("YES") || answer.equals("yes")) {
                    moreDrinks = false;
                } else {
                    System.out.println("Answer - YES/NO");
                }
            }

        }
        }
}
