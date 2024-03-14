package TestTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите a");
        int a = console.nextInt();
        System.out.println("Введите b");
        int b = console.nextInt();
        int sum = a + b;
        int vichitanieA = a - b;
        int umnojenie = a * b;
        double delenieA = (double) a / b;
        int vishitanieB = b - a;
        double delenieB = (double) b / a;
        System.out.println("a + b = " +sum);
        System.out.println("a * b = " +umnojenie);
        System.out.println("a - b = " +vichitanieA);
        System.out.println("b - a = " +vishitanieB);
        System.out.println("a / b = " +delenieA);
        System.out.println("b / a = "+delenieB);


        if(a != b){
            if (a > b){
                System.out.println("a > b");
            } else {
                System.out.println("a < b");
            }
        } else {
            System.out.println("a = b");
        }

    }
}