package HomeWork11;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(){}

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("burger composition: " + bun + "," + meat + "," + cheese + "," + greens + "," + mayonnaise);
    }

    Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("composition of a burger without mayonnaise: " + bun + "," + meat + "," + cheese + ","
                + greens + ",");
    }

    Burger(String doubleMeat) {
        this.meat = doubleMeat;
        System.out.println("double meat burger: " + doubleMeat);
    }
}

class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger("bun", "meat", "cheese", "greens", "mayonnaise");
        Burger burger2 = new Burger("bun", "meat", "cheese", "greens");
        Burger burger3 = new Burger("doubleMeat");

    }
}
