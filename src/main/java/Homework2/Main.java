package Homework2;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void CalculateFactorial(){
        System.out.println("Этот метод будет вычислять факториал числа");
        System.out.println("Введите число для вычисления факториала");
        Scanner in = new Scanner (System.in);
        String myString = in.next();
        int counter = Integer.parseInt(myString);
        int factorial =1;
        System.out.print("Факториал числа: " + counter + "! - ");
        do {
            factorial*=counter--;
        }  while(counter >0);
        System.out.print(factorial);

    }
    public static void CalculateFibonachchi(){
        System.out.println();
        System.out.println();
        System.out.println("Этот метод выведет ряд чисел Фибоначчи");
        System.out.println("Введите число, до которого будет отображен ряд Фибоначчи");
        Scanner in = new Scanner (System.in);
        String myString = in.next();
        int maxNumber = Integer.parseInt(myString);
        int[] array = new int[maxNumber];

        for (int i = 0; i < maxNumber; i++)
        {
            if (i == 0 || i == 1) array[i] = i;
            else array[i] = array[i - 1] + array[i - 2];
        }
        System.out.print(Arrays.toString(array));
    }

    public static void DrawElochka(){
        for (int i = 0; i < 7; i++){
            for (int j =0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        DrawElochka();
        CalculateFactorial();
        CalculateFibonachchi();

    }

}
