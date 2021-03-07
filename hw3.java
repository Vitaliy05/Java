import java.util.Random;

public class MyClass 
{
    public static int MaxOfArray(int[] array) //Поиск максимального значения во всем массиве
    {
        int max = array[0];
        
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }
    
    public static int MinOfArray(int[] array) //Поиск минимального значения во всем массиве
    {
        int min = array[0];
        
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
    public static int MaxFirstFiveOfArray(int[] array) //Максимальное значение среди первых 5 элементов
    {
        int maxfirstfive = array[0];
        
        for (int i = 1; i < 5; i++)
        {
            if (array[i] > maxfirstfive)
            {
                maxfirstfive = array[i];
            }
        }
        return maxfirstfive;
    }
    public static int MinFirstFifteenOfArray(int[] array) //Минимальное значение из 15 элементов
    {
        int minfirstfifteen = array[0];
        
        for (int i = 1; i < 15; i++)
        {
            if (array[i] < minfirstfifteen)
            {
                minfirstfifteen = array[i];
            }
        }
        return minfirstfifteen;
    }
    public static int AVGFristTenOfArray(int[] array) //Среднее значение первых 10 элементов
    {
        int AVG = 0;
        
        for (int i = 0; i < 10; i++)
            {
                AVG += array[i];
            }
       return AVG /= 10;

    }
        public static int AVGOfArray(int[] array) //Среднее значение по всему массиву
    {
        
        int AVGArray = 0;
        
        for (int i = 0; i < array.length; i++)
            {
                AVGArray += array[i];
            }
       return AVGArray /= array.length;

    }
        
    
    public static void main(String args[]) 
    {

      int[] array = new int[30];
      
      Random r = new Random();
      
      System.out.println("Данн массив Random");
      
      for(int i = 0; i < array.length; i++)
      {
          array[i] = r.nextInt(1000);
          System.out.printf("%d ", array[i]); // Вывод массива Random
      }

       System.out.println("\n"); 
      
      System.out.println("Level 1");
      
      int maxfirstfive = MaxFirstFiveOfArray(array);
      System.out.println("  Максимальное значение среди первых 5 элементов  = " + maxfirstfive);
      
      int AVG = AVGFristTenOfArray(array);
      System.out.println("  Среднее значение первых 10 элементов = " + AVG);
      
      int minfirstfifteen = MinFirstFifteenOfArray(array);
      System.out.println("  Минимальное значение из первых 15 элементов = " + minfirstfifteen + "\n");
      
      System.out.println("Level 2");
      
      int max = MaxOfArray(array);
      System.out.println("  Максимальное значение во всем массиве = " + max); 
      
      int min = MinOfArray(array);
      System.out.println("  Минимальное значение во всем массиве = " + min + "\n"); 
      
      System.out.println("Level 3");
      
      int AVGArray = AVGOfArray(array);
      System.out.println("  Среднее значение по всему массиву = " + AVGArray);
    }
}