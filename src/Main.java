public class Main {
    public static void main(String[] args) {

        var Homework5 = 5;
        var task = 1;
        int clientOS = 0;
        if (clientOS == 0)
            System.out.println("«Установите версию приложения для iOS по ссылке»");
    else if (clientOS != 0)
            System.out.println("Установите версию приложения для Android по ссылке");

        var task2 = 2;
        int clientOS1 = 0;
        int year =2014;
        if (clientOS1 == 0)
            System.out.println("«Установите приложения для iOS по ссылке");
        else if (clientOS1 != 0 )
            System.out.println("Установите  приложения для Android по ссылке");
        if (clientOS1 == 0 && year < 2015)
            System.out.println( "Установите облегченную версию приложения для iOS по ссылке");
        else if (clientOS1 != 0 && year < 2015)
            System.out.println( "Установите облегченную версию приложения для Android по ссылке");


    }
}