import java.util.ArrayList;

public class MatrixWork {
    public double[][] elem = new double[5][5];


    public MatrixWork(double[][] elem)
    {
        this.elem = elem;
    }

    public MatrixWork() {}

    public void setMatrix()
    {
        for(int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                this.elem[i][j] = Math.random()*10;
            }
        }
    }

    public void printMatrix()
    {
        for(int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                //this.elem[i][j] = Math.random()*10;
                System.out.print(this.elem[i][j] + " ");
            }
            System.out.println();
        }
    }

}