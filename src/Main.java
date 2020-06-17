import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input purchase amount.");

        String input_text = scanner.nextLine();

        scanner.close();

        int input_price = 0;

        try {
            input_price = Integer.parseInt(input_text);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }



    }
}
