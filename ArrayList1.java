import java.util.ArrayList;

public class ArrayList1 {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);
        numbers.add(17);
        numbers.add(19);
        numbers.add(20);

        for (Integer num : numbers) {
            int unboxedNum = num;
            if (isPrime(unboxedNum)) {
                System.out.println(unboxedNum + " is a prime number.");
            } else {
                System.out.println(unboxedNum + " is not a prime number.");
            }
        }
    }
}
