import java.util.Map;
import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.PrintWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class LinePlanePosition {
  public static void main(String[] args) {
    // Create a Scanner object for reading input
    Scanner scanner = new Scanner(System.in);

    Map<String, String> translations = Map.of();

    System.out.print("Select the language: (1 - English, 2 - Ukrainian):");

    switch (scanner.nextInt()) {
      case 1:
        translations = Map.of(
          "enterLine", "Enter the line in canonical equation form ((x - x0) / l = (y - y0) / m = (z - z0) / n): \n",
          "enterPlane","Enter the plane in general equation form (ax + by + cz + d = 0):\n",
          "formattedLine", "The line is in the following form: (x - %.2f) / %.2f = (y - %.2f) / %.2f = (z - %.2f) / %.2f)\n",
            "formattedPlane", "The plane is in the following form: (%.2f * x + %.2f* y + %.2f * z + %.2f = 0)\n",
          "belongs", "The line belongs to the plane.",
          "parallel", "The line and plane are parallel to each other.",
          "perpendicular", "The line and plane are perpendicular.",
            "angle", "The line and plane intersect at an angle of %.2f degrees.");;
        break;
      case 2:
        translations = Map.of(
          "enterLine", "Введіть рівняння прямої у канонічному вигляді ((x - x0) / l = (y - y0) / m = (z - z0) / n): \n",
          "enterPlane","Введіть рівняння площини у загальному вигляді (ax + by + cz + d = 0):\n",
          "formattedLine", "Пряма задана рівнянням: (x - %.2f) / %.2f = (y - %.2f) / %.2f = (z - %.2f) / %.2f)\n",
          "formattedPlane", "Площина задана рівнянням: (%.2f * x + %.2f* y + %.2f * z + %.2f = 0)\n",
          "belongs", "Пряма належить площині.",
          "parallel", "Пряма паралельна площині.",
          "perpendicular", "Пряма перпендикулярна площині.",
          "angle", "Пряма та площина перетинаються під кутом %.2f градусів.");
        break;
      default:
        System.out.println("Invalid language selected. Exiting...");
        System.exit(1);
    }

    // Read the line in the canonical equation form
    System.out.print(translations.get("enterLine"));
    System.out.print("x0:");
    double x0 = scanner.nextDouble();
    System.out.print("y0:");
    double y0 = scanner.nextDouble();
    System.out.print("z0:");
    double z0 = scanner.nextDouble();
    System.out.print("l:");
    double l = scanner.nextDouble();
    System.out.print("m:");
    double m = scanner.nextDouble();
    System.out.print("n:");
    double n = scanner.nextDouble();

    // Read the plane in the general equation form
    System.out.print(translations.get("enterPlane"));
    System.out.print("a:");
    double a = scanner.nextDouble();
    System.out.print("b:");
    double b = scanner.nextDouble();
    System.out.print("c:");
    double c = scanner.nextDouble();
    System.out.print("d:");
    double d = scanner.nextDouble();


    try {
      FileWriter myWriter = new FileWriter("answer.txt");
      PrintWriter printWriter = new PrintWriter(myWriter);

      System.out.format(translations.get("formattedLine"), x0, l, y0, m, z0, n);
      System.out.format(translations.get("formattedPlane"), a, b, c, d);

      printWriter.printf(translations.get("formattedLine"), x0, l, y0, m, z0, n);
      printWriter.printf(translations.get("formattedPlane"), a, b, c, d);

      if (a * l + b * m + c * n == 0) {
        if (a * x0 + b * y0 + c * z0 + d == 0) {
          System.out.println(translations.get("belongs"));
          myWriter.write(translations.get("belongs"));
        } else {
          System.out.println(translations.get("parallel"));
          myWriter.write(translations.get("parallel"));
        }
      } else if (a / l == b / m && b / m == c / n) {
        System.out.println(translations.get("perpendicular"));
        myWriter.write(translations.get("perpendicular"));
      } else {
        double angle = Math.toDegrees(Math.asin(Math.abs(a * l + b * m + c * n)
            / (Math.sqrt(a * a + b * b + c * c) * Math.sqrt(l * l + m * m + n * n))));
        System.out.format(translations.get("angle"), angle);
        printWriter.printf(translations.get("angle"), angle);
      }
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }



    System.exit(0);
  }
}