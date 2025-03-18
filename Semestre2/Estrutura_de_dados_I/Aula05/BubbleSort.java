import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[]arr){
        int n= arr.length;
        boolean swapped;

        for(int i=0;i<n-1;i++){
            swapped=false;

            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){ //Se o número do array[j] for maior que o número do array[j+1]
                    int temp =  arr[j]; //O valor do array[j] é armazenado na nova variável
                    arr[j]=arr[j+1]; // O valor de array[j] é substituido pelo valor de arraj[j+1]
                    arr[j+1]=temp; // E o valor de array[j+1] se torna o valor da variavel que armazenou o valor anterior de array[j] antes de ser substituido
                    swapped = true;
                    // Em suma troca os valores do array para reordenar do menor para o maior
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr={3,5,7,1,4,2,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
