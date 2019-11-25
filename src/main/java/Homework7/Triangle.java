package Homework7;

public class Triangle {
    public Triangle(int size) {
        drawTriangle(size);
    }

    public void drawTriangle (int size){
        String s = "";
        for (int i =0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if (i ==0) {
                    s = s + "*";
                }

                else {
                    s = s.substring(0, s.length()-1);
                    break;
                }
            }
            s = " " + s;
            System.out.println(s);
        }

    }
}
