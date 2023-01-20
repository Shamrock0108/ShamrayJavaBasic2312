package HomeWork16;

public class iPhones extends Test  implements Smartphones,Os{
    String name;

    public iPhones(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("Iphone call");
    }

    @Override
    public void sms() {
        System.out.println("Iphone sms");

    }

    @Override
    public void internet() {
        System.out.println("Iphone internet");

    }

    @Override
    public void name() {
        System.out.println("iPhone name:" + "" + this.name);
    }

    @Override
    public void iPhonePhone() {
        System.out.println("iPhone has an operating system OS");

    }
}
