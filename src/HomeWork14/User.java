package HomeWork14;

public class User {
    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("Ivan", 23, 2, 2000, 2000, "Ivan@gmail.com",
                974738, "Ivanich", 100, 120, 2000);
        user1.printAccountInfo();
        UserInfo user2 = new UserInfo("Maksim", 3, 12, 1999, 1999, "Maksim@gmail.com"
                ,934323, "Maksimov", 76, 110, 15_000);
        user2.printAccountInfo();
        UserInfo user3 = new UserInfo("Irina", 14, 1, 1996, 1996, "Irina@gmail.com"
                , 9745454, "Irinenko", 47, 109, 20_000);
        user3.printAccountInfo();
        user1.setStepsPerDay(13_000);
        user1.setPressure(115);
        user1.setWeight(80);
        user1.printAccountInfoAfter();
        user2.setStepsPerDay(8_000);
        user2.setWeight(89);
        user2.setPressure(116);
        user2.printAccountInfoAfter();
    }
}
