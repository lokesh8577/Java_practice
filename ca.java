import java.util.Scanner;

public class ca{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        System.out.println("enter the choice:");
        int choice = sc.nextInt();
        switch(choice){
            case 1 :
            System.out.println(a+b);
            break;
            case 2 :
            System.out.println(a-b);
            break;
            case 3 :
            System.out.println(a*b);
            break;
            case 4 :
            System.out.println(a/b);
            break;
            default:
            System.out.println("invalid input");
        }
        sc.close();


    }
}