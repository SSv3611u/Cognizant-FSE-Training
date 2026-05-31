public class TypeCasting {
    public static void main(String[] args) {
        double a = 10.0;
        System.out.println(" before TypeCasting the double variable : "+ a);

        int b = (int) a;
        System.out.println("After TypeCasting the Double: "+ b);

        int c = 20;
        System.out.println("Before TypeCasting the Integer: "+ c);

        double d = (double)c;
        System.out.println("After typecasting the Integer: "+ d);
    }
}