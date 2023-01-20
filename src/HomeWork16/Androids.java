package HomeWork16;

public class Androids extends Test implements Smartphones,LinuxOS{
    String name;

    public Androids(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android sms");

    }

    @Override
    public void internet() {
        System.out.println("Android internet");

    }

    @Override
    public void name() {
        System.out.println("Android name:" + "" + this.name);
    }

    @Override
    public void androidPhone() {
        System.out.println("Android has an operating system LinuxOS");

    }
}
