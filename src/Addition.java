import java.util.ArrayList;

public class Addition {
    public static double N = 5;// Размер матрицы

        double [][] A = new double [(int) N][(int) N];
        double [][] B = new double [(int) N][(int) N];
        double [][] C = new double [(int) N][(int) N];

        public Addition(){}

        // Заполнение и печать на экран матрицы A
        public void setA()
        {
            for (int i = 0; i < A.length; i++)
            {
                for (int j = 0; j < A[i].length; j++)
                {
                    A[i][j] = (double) (Math.random() * 10);
                    System.out.print(" " + A[i][j] + " ");
                }
                System.out.println();
            }
        }
        // Заполнение и печать на экран матрицы B
        public void setB()
        {
            for (int i = 0; i < B.length; i++)
            {
                for (int j = 0; j < B[i].length; j++)
                {
                    B[i][j] = (double) (Math.random() * 10);
                    System.out.print(" " + B[i][j] + " ");
                }
                System.out.println();
            }
        }
        // Сумма матриц
        public void setC()
        {
        for(int i = 0; i < C.length; i++)
        {
            for(int j = 0; j < C[i].length; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(" " + C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
