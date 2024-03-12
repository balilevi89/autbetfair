package courses.javabasics;

import org.jetbrains.annotations.NotNull;

public class Draw {


    public static void main(String[] args) {
        System.out.println("Param 1:" + args[0] + "\nParam 2:" + args[1]);
        // drawFullShape(args[0], args[1]);
        // drawFullShape(3,4);
        //System.out.println("Draw same size shape");
        // drawFullShape(3);
        // System.out.println("Draw same size  as string");
        //drawFullShape(args[0]);
        System.out.println("Draw shape Corners");
        drawShapeCorners(3, 3);
        System.out.println(" ");
        System.out.println("Draw shape Outline");
         drawShapeOutline(3, 3);

    }

    public static void drawFullShape(int n, int m) {
// implement method
        for (int i = 0; i < n; i++) {
            drawFullLine(m);
        }
    }


    public static void drawFullLine(int m) {
        for (int j = 0; j < m; j++) {
            System.out.print('*');
        }
        System.out.println('*');
    }

    public static void drawFullShape(int n) {
        drawFullShape(n, n);
    }

    public static void drawFullShape(String n, String m) {
        drawFullShape(Integer.parseInt(n), Integer.parseInt(m));
    }

    public static void drawFullShape(String n) {
        drawFullShape(Integer.parseInt(n));
    }


      public static void ShapeOutline(int n, int m) {
      drawShapeOutline(n, m);
      }


      public static void drawShapeOutline(int n, int m) {
     // implement method
      for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
      if (i == 0 || i == n) {
      System.out.print('*');
      }else if (j==0){
      System.out.println(' ');
      System.out.print('*');
     } else if (j ==m-1 ){
      System.out.print('*');}
      else if (i ==n-1 ){
      System.out.print('*');}
      else if (j != m)
      System.out.print(' ');
      }



    public static void ShapeCorners(int n, int m) {
        drawShapeCorners(n, m);
    }

    public static void drawShapeCorners(int n, int m) {
// implement method
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (i == 0 && j == 0) {
                    System.out.print('*');
                } else if (i == 0 && j == m - 1) {
                    System.out.println('*');
                } else if (i == n - 1 && j == m-1) {
                    System.out.print('*');
                } else if (i == n - 1 && j==0) {
                    System.out.print('*');
                } else if (i != n - 1 && j == m - 1) {
                    System.out.println(' ');
                }  else if (i != n - 1 && j != m - 1) {
                    System.out.print(' ');
                }  else if (i !=0 && j != m - 1) {
                        System.out.print(' ');
                    }

            System.out.print(' ');

}
}

















