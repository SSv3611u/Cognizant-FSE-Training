import java.util.Scanner;

public class AverageAndSumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        float avg = sum/n;
        
        System.out.println("Sum of Array: "+sum);
        System.out.println("Average of Array: "+avg);
    }
}