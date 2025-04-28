import java.util.*;
class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /):");
        char op = sc.next().charAt(0);
        int result = 0;
        switch (op) {
            case '+':
            result = num1 + num2;
            break;
            case '-':
            result = num1 - num2;
            break;
            case '*':
            result = num1 * num2;
            break;
            case '/':
            if (num2 != 0)
            result = num1 / num2;
            else
            System.out.println("Error! Division by zero is not allowed.");
            break;
            default:
            System.out.println("Error! Invalid operator.");
            }
            System.out.println("Result: " + result);
    }
}
