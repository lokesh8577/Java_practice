public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original string :");
        for(int i : arr){
            System.out.print(i + " ");
        }
        int start=0;
        int end = arr.length-1;
        while(start<end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end]= temp;
           start++;
           end--;
        }
        System.out.println("\nReversed array :");
        for(int i : arr){
            System.out.print(i + " ");
            }


    }
}
