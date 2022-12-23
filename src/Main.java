public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Tom";
        human1.age = 18;
        Human human2 = new Human();
        human2.name = "Jonh";
        human2.age = 50;
        System.out.println("My name " + human1.name + " my age " + human1.age);
        System.out.println("My name " + human2.name + " my age " + human2.age);

    }
}
class Human{
    String name;
    int age;

    }
    
  

