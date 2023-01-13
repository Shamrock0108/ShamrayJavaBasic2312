package HomeWork14;

import java.util.Objects;

public class UserInfo {
    String name;
    int day;
    int month;
    int year;
    String mail;
    int phoneNumber;
    String surname;
    int weight;
    int pressure;
    int stepsPerDay;
    int userAge;
    int count ;

    public UserInfo(String name, int day, int month, int year, int userAge, String mail, int phoneNumber, String surname, int weight,
                    int pressure, int stepsPerDay) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.userAge = 2023 - userAge;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;


    }

    void printAccountInfo() {
        System.out.println("UserInfo - {" +
                "name='" + name + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", userAge=" + userAge +
                ", mail='" + mail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", stepsPerDay=" + stepsPerDay +

                '}');
        if(weight >= 100){
            System.out.println(name + " Time for a workout!");
        }

    }
    void printAccountInfoAfter() {
        System.out.println("After training - {" +
                "name='" + name + '\'' +
                ", userAge=" + userAge +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", stepsPerDay=" + stepsPerDay +
                '}');
        if(weight < 85){
            count = weight - getWeight();
            System.out.println(name + " Congratulations, you have succeeded"   );
        } else if(weight > 90 ){
            System.out.println(name + " Time for a workout! you don't care of you health");
        }else if(stepsPerDay >= 10_00){
            System.out.println(name + " Time for a workout! you don't care of you health");
        }
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getMail() {
        return mail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public int getUserAge() {
        return userAge;
    }


}
