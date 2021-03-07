import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        MatrixWork m = new MatrixWork();//Переменая для вывода матрицы с рандомными числами
        Addition n = new Addition(); //Переменная для суммы матриц А + В с рандомными числами
        Multiply mult = new Multiply(); //Переменная для вывода матрицы с рандомными числами умноженой на число
        SumMajorDiagonal sum = new SumMajorDiagonal();//Переменная для метода сравнения матриц

        Scanner s = new Scanner(System.in);

        System.out.println("Впечатай номер метода который хочешь проверить:");
        System.out.println("1: Печать матрицы.");
        System.out.println("2: Сложение с другой матрицей.");
        System.out.println("3: Метод заполнения матрицы случайными числами.");
        System.out.println("4: Умножение матрицы на число.");
        System.out.println("5: Сравнение матриц по главным диагоналям.");


        int command = s.nextInt();
        switch (command) {
            case 1:
                System.out.println("________________________________________________________________");
                System.out.println("Печать матрицы (матрица размерностью 5х5)");
                m.printMatrix();
                System.out.println("________________________________________________________________");
                break;
            case 2:
                System.out.println("________________________________________________________________");
                System.out.println(" Матрица A:");
                n.setA();
                System.out.println("\n Матрица B:");
                n.setB();
                System.out.println("\n Сложение матриц A и B:");
                n.setC();
                System.out.println("________________________________________________________________");
                break;
            case 3:
                System.out.println("________________________________________________________________");
                System.out.println("Метод заполнения матрицы случайными числами:");
                m.setMatrix();
                m.printMatrix();
                System.out.println("________________________________________________________________");
                break;
            case 4:
                System.out.println("________________________________________________________________");
                System.out.println("Умножение матрицы на число '3' " +
                        "\n(матрица заполнена случайными числами и размерносью 5х5):");
                mult.setMat();
                System.out.println("________________________________________________________________");
                break;
            case 5:
                System.out.println("________________________________________________________________");
                System.out.println("Матрица А:");
                sum.setMatA();
                System.out.println("Матрица В:");
                sum.setMatB();
                System.out.println();
                sum.setResult();
                System.out.println("________________________________________________________________");
                break;
            default:
                System.out.println("Используйте числа от 1 до 5 чтобы выбрать метод!");
        }
    }
}