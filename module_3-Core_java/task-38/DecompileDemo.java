public class DecompileDemo {
    private final String message;

    public DecompileDemo(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        DecompileDemo demo = new DecompileDemo("Decompile this class file.");
        demo.printMessage();
    }
}
