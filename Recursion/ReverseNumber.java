public class ReverseNumber {

    static int reverse(int number, int result) {
        if (number == 0) {
            return result;
        }

        return reverse(
                number / 10,
                result * 10 + number % 10
        );
    }

    public static void main(String[] args) {
        int number = 12345;

        int reversed = reverse(number, 0);

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }
}
