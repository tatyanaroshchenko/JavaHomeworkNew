package Homework4;

public class Triangle {
    Triangle (int countStars){
        drawTriangle(countStars);
    }

    public void drawTriangle(int countStars){
        for (int i = 1; i <= countStars; i++){
            for (int j =0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
