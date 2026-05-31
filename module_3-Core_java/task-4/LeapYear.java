import java.util.Scanner;

class Leapyear{
    void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a%4 == 0 && a%100 != 0) || (a%400 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}