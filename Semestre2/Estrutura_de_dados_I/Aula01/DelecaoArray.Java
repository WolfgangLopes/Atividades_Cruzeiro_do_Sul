import java.util.Arrays;

public class DelecaoArray {
    public static void main(String[] args) {
        int tamanho=5;
        int[] array ={10,20,30,40,50};
        int removerIndice = 0;

        for(int i=removerIndice;i<tamanho-1;i++){
            array[i]=array[i+1];
        }
        System.out.println("Array após deleção: "+Arrays.toString(array));
    }
}
