
import java.util.Scanner;

class swap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a :");
    int a = sc.nextInt();
    System.out.println("enter the value of b :");
    int b = sc.nextInt();
    System.out.println("before swapping a = " + a + " b = " + b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("after swapping a = " + a + " b = " + b);
    
    }
}
