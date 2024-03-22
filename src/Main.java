public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    int i=2000;
    year (i);
    int os=0;
    int deviceYear=2020;
    findOutTheYear (os,deviceYear);
    int distance =140;
    daysTillPackage(distance);}
    public static void year ( int yearToCheck){
            if ((yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0)) {
                System.out.println("Год " + yearToCheck + " високосный");
            } else {
                System.out.println("Год " + yearToCheck + " невисокосный");
            }
        }
    public static void findOutTheYear (int os, int deviceYear) {
        if (os==0 && deviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для IOs по ссылке");
        } else if (os==1 && deviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        if (os==0 && deviceYear>=2015) {
            System.out.println("Установите версию приложения для IOs по ссылке");
        } else if (os==1 && deviceYear>=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void daysTillPackage (int distance) {
        if (distance<=20) {
            System.out.println("Потребуется 1 день");
    }
        if (distance>20 && distance<=60) {
            System.out.println("Потребуется 2 дня");
        }
        if (distance>60 && distance<=100) {
            System.out.println("Потребуется 3 дня");
        }
        if (distance>100) {
            System.out.println("Доставки нет");
        }


}}