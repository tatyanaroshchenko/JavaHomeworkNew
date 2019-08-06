package Homework1;

public class Main {
    public static void calculate(){
        double pi = 3.14159d;
        int r = 5;
        double result = pi * r * r;
        System.out.println("pi = " + pi);
        System.out.println("r = " + r);
        System.out.println("Площадь круга = " + result);
        System.out.println();
        int a = 9;
        int h = 12;
        int area = (a * h)/2;
        System.out.println("Длина основания = " + a);
        System.out.println("Высота = " + h);
        System.out.println("Площадь треугольника = " + area);

    }


    public static void main(String[] args) {
        boolean valueBoolean = true;
        char valueChar = '2';
        byte valueByte = 127;
        short valueShort = 1200;
        int valueInt = 15000;
        long valueLong = -31200;
        float valueFloat = 32.5f;
        double valueDouble = 62.52d;

        System.out.println("valueBoolean = " + valueBoolean);
        System.out.println("valueChar = " + valueChar);
        System.out.println("valueByte = " + valueByte);
        System.out.println("valueShort = " + valueShort);
        System.out.println("valueInt = " + valueInt);
        System.out.println("valueLong = " + valueLong);
        System.out.println("valueFloat = " + valueFloat);
        System.out.println("valueDouble = " + valueDouble);
        System.out.println();

        String str1 = "Java";
        String str2 = new String(new char[]{'h','o','m','e', 'w','o', 'r', 'k'});
        String strResult = str1.concat(str2);
        System.out.println(strResult);
        System.out.println();

        calculate();


    }


}
