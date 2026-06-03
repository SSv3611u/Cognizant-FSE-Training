public class BytecodeDemo {
    public int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        BytecodeDemo demo = new BytecodeDemo();
        System.out.println("Square: " + demo.square(6));
    }
}
