import java.util.ArrayList;

public class SumMajorDiagonal {
    double sumA = 0;
    double sumB = 0;
    double maxElement = 0;

    public static double N = 5;    // Размер матрицы
    double [][] MatA = new double [(int) N][(int) N];
    double [][] MatB = new double [(int) N][(int) N];


    public SumMajorDiagonal(){}

    // Заполнение и печать матрицы A
    public void setMatA() {
        for (int i = 0; i < MatA.length; i++)
        {
            for (int j = 0; j < MatA[i].length; j++)
            {
                MatA[i][j] = (double) (Math.random() * 9);
                System.out.print(" " + MatA[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Элементы главной диагонали Матрицы А: ");
        for (int i = 0; i < MatA.length; i++)
        {
            System.out.print(MatA[i][i] + " ");
            sumA += MatA[i][i];
            if (MatA[i][i] > maxElement)
            {
                maxElement = MatA[i][i];

            }
            System.out.println();
        }
        System.out.println("\nСумма элементов главной диагонали Матрицы А = " + sumA);
    }
    // Заполнение и печать матрицы B
    public void setMatB()
    {
        for (int i = 0; i < MatB.length; i++)
        {
            for (int j = 0; j < MatB[i].length; j++)
            {
                MatB[i][j] = (double) (Math.random() * 9);
                System.out.print(" " + MatB[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Элементы главной диагонали Матрицы B: ");
        for (int i = 0; i < MatB.length; i++)
        {
            System.out.print(MatB[i][i] + " ");
            sumB += MatB[i][i];
            if (MatB[i][i] > maxElement)
            {
                maxElement = MatB[i][i];
            }
            System.out.println();
        }
        System.out.println("\nСумма элементов главной диагонали Матрицы В = " + sumB);
    }
    //Сравнение матриц
    public void setResult()
    {
        if (sumA > sumB)
        {
        System.out.println("Результат: " + sumA + " Главная диагональ матрицы А больше чем В" );
        }   else
        {
            System.out.println("Результат: " + sumB + " Главная диагональ матрицы В больше чем А");
        }
        System.out.println();
        }
}

