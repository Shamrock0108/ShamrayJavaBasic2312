package HomeWork16;

public class Test {
    public static void main(String[] args) {
        Androids android = new Androids("Samsung");
        iPhones iPhones = new iPhones("XS");
        outputInfo(android);
        outputAndroid(android);
        System.out.println("*******");
        outputInfo(iPhones);
        outputIphone(iPhones);


    }
    public static void outputInfo(Smartphones x){
        x.name();
        x.call();
        x.internet();
        x.sms();

    }
    public static void outputAndroid(LinuxOS x){
       x.androidPhone();

    }
    public static void outputIphone(Os x){
        x.iPhonePhone();

    }
}
