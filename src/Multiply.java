import java.util.ArrayList;

public class Multiply {
    public static double N = 5;    // Размер матрицы
    double [][] Mat = new double [(int) N][(int) N];
    double n = 3; //Число на которое будем умножать

    public Multiply(){}

    // Заполнение и печать на экран матрицы
     public void setMat()
     {
        for (int i = 0; i < Mat.length; i++)
        {
            for (int j = 0; j < Mat[i].length; j++)
            {
                Mat[i][j] = (double) (Math.random() * 9);
                System.out.print(" " + Mat[i][j] + " ");

            }
            System.out.println();
        }
        //Метод умножения на число
        System.out.println("Результат умножения: ");
        for (int i = 0; i < Mat.length; i++)
        {
            for (int j = 0; j < Mat[i].length; j++)
            {
                Mat[i][j] *= n;
                System.out.print(" " + Mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

