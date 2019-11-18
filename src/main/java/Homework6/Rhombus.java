package Homework6;

public class Rhombus {
    public Rhombus(int size) {
        drawRhombus(size);
    }

    private void drawRhombus(int size){
        String s= "";
        for (int i=(int)Math.round(size/2); i>0; i--){
          if (i ==(int)Math.round(size/2)) {
              for (int j=(int)Math.round(size/2); j >0; j--) {
                  s += " ";
              }
              s+="*";
              System.out.println(s);
          }
          s=s.substring(1);
          s+="**";
            System.out.println(s);

        }

    }


}
