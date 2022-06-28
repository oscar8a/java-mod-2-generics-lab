import java.util.Arrays;

class Converter {
  static <Gen> String convertToString(Gen[] array) {
    return Arrays.toString(array);
  }
}

public class StringRunner {
  public static void main(String[] args) {
    Integer[] inputInt = { 1, 2, 3 };
    String[] inputStr = { "Cake", "Donut", "Cupcake" };

    System.out.println(Converter.convertToString(inputInt)); // [1, 2, 3]
    System.out.println(Converter.convertToString(inputStr)); // [Cake, Donut, Cupcake]
  }
}