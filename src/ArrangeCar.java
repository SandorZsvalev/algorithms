import java.util.Scanner;

public class ArrangeCar {
    public static void main(String[] args) {
        sortCar();
    }

    public static void sortCar() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input first car color:");
        String firstColor = scn.nextLine();
        System.out.println("Input the number of " + firstColor + " cars");
        int firstNum = scn.nextInt();
        scn.nextLine();
        System.out.println("Input second car color:");
        String secondColor = scn.nextLine();
        System.out.println("Input the number of " + secondColor + " cars");
        int secondNum = scn.nextInt();
        scn.nextLine();

        //Проверка на корректность введенных данных не выполняется, поскольку кажется избыточной для данной задачи.
        //Потенциально надо делать либо обработку исключений типа InputMismatchException, либо все значения принимать
        //как String и дальше через Integer.parseInt() извлекать значения int там, где они должны быть и проверять
        //на корректность. Здесь по умолчанию считаю, что цвет задают буквами, а количество - целыми числами не больше int

        int carMore = firstNum;
        int carLess = secondNum;
        String color1 = firstColor;
        String color2 = secondColor;

        if (firstNum < secondNum) {
            carMore = secondNum;
            carLess = firstNum;
            color1 = secondColor;
            color2 = firstColor;
        }

        arrangeCar(carMore, carLess, color1, color2);

    }


    public static void arrangeCar(int carMore, int carLess, String color1, String color2) {
        if (carLess == 0 || carMore == 0) {
            System.out.println("not enough cars");
        }
        if (carLess * 2 < carMore) {
            System.out.println("Too much " + color1 + " cars");
        }
        int a = carLess;
        int b = carMore;
        for (int i = 0; i < carLess; i++) {
            if (b > a) {
                System.out.print(" " + color1 + " " + color2 + " " + color1);
                a = a - 1;
                b = b - 2;
            } else if (b == a) {
                System.out.print(" " + color1 + " " + color2);
            }
        }
    }

}
