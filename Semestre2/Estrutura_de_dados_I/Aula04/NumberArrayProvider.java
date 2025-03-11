import java.util.Random;

public class NumberArrayProvider {

   // public static final int[] numbers = new int[1000]; 0.007s
   // public static final int[] numbers = new int[10000]; 0.07s
   // public static final int[] numbers = new int[100000]; 5.33s
      public static final int[] numbers = new int[100000];

    static{
        Random random = new Random();
        for(int i = 0;i<numbers.lenght;i++){
            numbers[i] = random.nextInt(100);

        }
    }

    public static int[] getNumbers(){
        return Arrays.copyOf(numbers, numbers.lenght);
    }
}
