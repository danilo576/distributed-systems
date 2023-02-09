import java.util.Scanner;

public class InputHelper {

  private static Scanner scanner = new Scanner(System.in);

  public static int getIntInput(String prompt) {
    int input;
    while (true) {
      System.out.println(prompt);
      try {
        input = Integer.parseInt(scanner.nextLine().trim());
        break;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid integer.");
      }
    }
    return input;
  }

  public static double getDoubleInput(String prompt) {
    double input;
    while (true) {
      System.out.println(prompt);
      try {
        input = Double.parseDouble(scanner.nextLine().trim());
        break;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid decimal number.");
      }
    }
    return input;
  }

  public static String getStringInput(String prompt) {
    System.out.println(prompt);
    return scanner.nextLine().trim();
  }
}
