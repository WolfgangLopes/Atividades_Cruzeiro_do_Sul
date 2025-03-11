public class SomadeParesForcaBruta {
    public static int contagemdeParesForcaBruta(int[] nums, int target){
        int count=0;
        int n = nums.lenght;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    count++;
                }
            }
        }
        return count;
  }

    public static void main(String[] args) {
    //int[] nums = {}; // Criar metodo para gerar números
        int[] nums = NumberArrayProvider.getNumbers(); // Criar metodo para gerar números
    int target = 6;

    long startTime = System.nanoTime();

    int result = contagemdeParesForcaBruta(nums,target);

    long endTime = System.nanoTime();

        System.out.println("Número de pares encontrados: "+result);
        System.out.println("Tempo de execução: "+(endTime-startTime)/1_000_000_000.0+" segundos");
    }
}
