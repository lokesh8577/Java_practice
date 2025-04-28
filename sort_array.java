
import java.util.Arrays;



public class sort_array {
    public static void main(String[] args) {
       int[] array = {2,5,5252,5,2,26,2626,26,2,52,2};
       System.out.println("original array");
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(array);
        for(int i : array){
            System.out.print(i+" ");
        }
        }
}
