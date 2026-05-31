import java.util.Scanner;

class CheckEvenOrOdd{
    void main(){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}