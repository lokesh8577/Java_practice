public class RemoveSpaces {
    public static void main(String[] args) {
        String original = "   Hello World, Welcome to Java Programming!   ";
      
        String withoutSpaces = original.replaceAll("\\s", "");
        
        System.out.println("Original String: \"" + original + "\"");
        System.out.println("Length before removing spaces: " + original.length());
        System.out.println("String after removing spaces: \"" + withoutSpaces + "\"");
        System.out.println("Length after removing spaces: " + withoutSpaces.length());
    }
}

