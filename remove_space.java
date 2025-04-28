public class remove_space {
    public static void main(String[] args) {
        String str = "kjsdh iofh is dih sigsig shi gs";
        String str1 = removeWhiteSpaces(str);
        System.out.println(str1);
      
}
public static String removeWhiteSpaces(String str) {
    return str.replaceAll("\\s", "");
}
}
