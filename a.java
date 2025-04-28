public class a{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,556,6,6,7};
        int sum=0;
        for(int i : array){
            sum+=i;
        }
        int len = array.length;
        double ans = sum/len;
        System.out.println(ans);
    }
}