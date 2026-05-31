import java.util.Scanner;

class MultiplicationTable{
    void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Multiplication table for "+a);
        for(int i=1;i<=10;i++){
            System.out.println(a+" x "+i+" = "+(a*i));
        }
    }
}