import java.util.Scanner;

public class TestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNumberOk = false;
        System.out.println("Enter the number: ");

        while (!isNumberOk) {
            int userNumber = scanner.nextInt();
            if (userNumber > 100 && userNumber < 200 && userNumber % 3 == 0) {
                isNumberOk = true;
                System.out.println("Number is ok.");
            } else {
                System.out.println("Number is wrong. \n Give a new number: ");
            }
        }
    }
}
