package TestTasks;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String Line1 = console.nextLine();
        System.out.println("Вторую первую строку");
        String Line2 = console.nextLine();

        if (Line1.equals(Line2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

    }
}