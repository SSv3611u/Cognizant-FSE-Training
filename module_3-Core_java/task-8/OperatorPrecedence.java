class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 100 / 5 + 3 * 4 - 2;

        System.out.println("Result of 10 + 5 * 2 is: " + result1);
        System.out.println("Here multiplication is done first, then addition.");

        System.out.println("Result of (10 + 5) * 2 is: " + result2);
        System.out.println("Here brackets are done first, then multiplication.");

        System.out.println("Result of 100 / 5 + 3 * 4 - 2 is: " + result3);
        System.out.println("Here division and multiplication are done first, then addition and subtraction from left to right.");
    }
}
