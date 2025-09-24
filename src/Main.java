public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1");

        int age = 18;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " он совершеннолетний ");
        } else {
            System.out.println(" Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно подождать");
        }

        System.out.println(" Задание 2 ");

        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println(" Задание 3 ");

        int speed = 61;
        if (speed >= 60) {
            System.out.println(" Если скорость " + speed + " то, придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println(" Если скорость " + speed + " можно ездить спокойно ");
        }
        System.out.println(" Задание 4 ");

        int age1 = 4;
        if (age1 > 2 && age1 < 6) {
            System.out.println( " Если возраст равен " + age1 + " то ему нужно ходить в детский сад ");
        }
        int age2 = 10;
        if (age2 > 7 && age2 < 17) {
            System.out.println(" Если возраст равен " + age2 + " то ему нужно ходить в школу ");
        }
        int age3 = 20;
        if (age3 >= 18 && age3 <= 24) {
            System.out.println(" Если возраст равен " + age3 + " то ему нужно ходить в университет ");
        }
        int age4 = 24;
        if (age4 >= 24) {
            System.out.println(" Если возраст равен " + age4 + " то ему нужно ходить на работу");
        }
        System.out.println(" Задание 5 ");

        int age5 = 5;
        if (age5 < 5) {
            System.out.println(" Если возраст ребенка равен " + age5 + " то ему нельзя кататься на аттракционе ");
        } else if (age5 >= 5 && age5 < 14) {
            System.out.println(" Если возраст ребенка равен " + age5 + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя." );
        } else {
            System.out.println(" Если возраст ребенка равен " + age5 + " то он может кататься без сопровождения взрослого ");
        }

        System.out.println(" Задание 6 ");

        int seatsInOneCarriage = 102;
        int seatingCapacity = 60;
        int people = 88;

        if (people < seatingCapacity) {
            System.out.println("В вагоне есть сидячие места");
        } else if (people < seatsInOneCarriage) {
            System.out.println("Сидячих мест нет, но есть стоячие");
        } else {
            System.out.println("Вагон полностью забит");
        }

        System.out.println(" Задание 7 ");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three){
            System.out.println(" первое число больше ");
    }
        else if (two > one && two > three){
            System.out.println(" второе число больше ");
        }
        else {
            System.out.println(" третье число больше ");
        }

    }
}
