package Homework6;

public class Rhombus2 {
    public Rhombus2(int size) {
        drawRhombusTwo(size);
    }

    private void drawRhombusTwo(int size){
        String s="";
        for (int i=0; i<=size/2; i++){
            for (int j=0; j<size; j++){
                if (i==0){
                    s+="*";
                }
                else {
                    s = s.substring(0, s.length() - 2);
                    break;
                }
            }
            s = " " + s;
            System.out.println(s);
        }
    }
}
