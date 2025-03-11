public class SomaDeParesHashMap {
public static int contagemDeParesHashMap(int[]nums, int target){
    HashMap<Integer, Integer> map = HashMap<>();
    int count = 0;

    for (int num:nums){
        int complement = target - num;

        if (map.constainsKey(complement))
            count+= map.get(complement);

        map.put(num, map.getOrDefault(num, 0)+1);
    }
    return count;
    public static void main(String[] args) {
        //int[] nums = {}; // Criar metodo para gerar números
        int[] nums = NumberArrayProvider.getNumbers(); // Criar metodo para gerar números
        int target = 6;

        long startTime = System.nanoTime();

        int result = contagemDeParesHasMap(nums,target);

        long endTime = System.nanoTime();

        System.out.println("Número de pares encontrados: "+result);
        System.out.println("Tempo de execução: "+(endTime-startTime)/1_000_000_000.0+" segundos");
    }
}
    }
}
