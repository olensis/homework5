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
        int clientOS1 = 1;
        int year = 2015;
        if (clientOS1 == 0)
            System.out.println("«Установите приложения для iOS по ссылке");
        else
            System.out.println("Установите  приложения для Android по ссылке");
        if (clientOS1 == 0 && year < 2015)
            System.out.println( "Установите облегченную версию приложения для iOS по ссылке");
        else if (clientOS1 != 0 && year < 2015)
            System.out.println( "Установите облегченную версию приложения для Android по ссылке");

        var task3 = 3;
            int year1 = 2032;
            if (year1 % 4 != 0 || year % 100 == 0)
                System.out.println( "Год не високосный");
             else
                System.out.println( "Год високосный");
        var task4 = 4;
        int deliveryDistan = 95;
        if (deliveryDistan <= 20)
            System.out.println( "Доставка занимает сутки");
        else if (deliveryDistan > 20 && deliveryDistan <=60 )
            System.out.println("Доставка занимает сутки" + 2);
        else if (deliveryDistan > 60 && deliveryDistan <=100)
            System.out.println("Доставка занимает сутки" + 3);

        var task5 = 5;
        int monthNumber = 12;


                int monthNumber1 = 7;
                switch (monthNumber1) {
                case 1:
                case  2:
                case 12 :
                    System.out.println("Зима");
                    break;
                    case 3 :
                    case 4 :
                    case 5 :
                        System.out.println( "Весна");
                        break;
                    case 6 :
                    case 7 :
                    case 8 :
                        System.out.println("Лето");
                        break;
                    case 9 :
                    case 10 :
                    case 11 :
                        System.out.println("Осень");
                        break;
                    default:
                    System.out.println( " Такого дня не существует ");



            }



        }











    }
