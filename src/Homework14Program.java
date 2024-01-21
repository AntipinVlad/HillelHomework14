import java.util.Scanner;

public class Homework14Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        int randomNumber = scanner.nextInt();
        int sumOfDigits = 0;

        for (char element : String.valueOf(randomNumber).toCharArray()) {
            sumOfDigits += Character.getNumericValue(element);
        }

        System.out.println("Your random number " + randomNumber);
        System.out.println("The sum of the digits of your number is " + sumOfDigits);

    }
}
