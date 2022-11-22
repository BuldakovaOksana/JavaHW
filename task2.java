import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number till which the prime numbers are to be calculated: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        // loop through the numbers one by one (edit include input in range)
        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }

            // print the number if prime
            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        String s = primes.toString().replace("[", "").replace("]", "");
        System.out.println("The number of prime is: " + primes.size() + ", and they are: " + s);
    }
}
