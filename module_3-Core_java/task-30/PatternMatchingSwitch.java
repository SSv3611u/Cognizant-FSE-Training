public class PatternMatchingSwitch {
    private static String describe(Object value) {
        return switch (value) {
            case Integer number -> "Integer value: " + number;
            case String text -> "String value with length " + text.length();
            case Double decimal -> "Double value: " + decimal;
            case null -> "Null value";
            default -> "Other type: " + value.getClass().getSimpleName();
        };
    }

    public static void main(String[] args) {
        System.out.println(describe(25));
        System.out.println(describe("Java"));
        System.out.println(describe(19.5));
        System.out.println(describe(true));
    }
}
