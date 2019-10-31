package Homework4;

public class Triangle {
    Triangle (int countStars){
        DrawTriangle(countStars);
    }

    public void DrawTriangle(int countStars){
        for (int i = 0; i <= countStars; i++){
            for (int j =0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
