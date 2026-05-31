import java.util.*;
class SimpleCalculator {
    void main() {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        sc.nextLine();
        switch (op) {
            case "+":
                System.out.println("sum of "+a+" and "+b+" is "+(a+b));
                break;
            case "-":
                System.out.println("difference of "+a+" and "+b+" is "+(a-b));
                break;
            case "*":
                System.out.println("product of "+a+" and "+b+" is "+(a*b));
                break;
            case "/":
                if(b == 0){
                    System.out.println("division cannot be performed");
                }else{
                    System.out.println("division of "+a+" and "+b+" is "+(a/b));  
                }
                break;
            default:
                System.out.println("choose or enter the correct operand");
                break;
        }

    }
}
