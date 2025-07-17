
// This program prints the numbers 1 to 4 on the same line using different methods.

public class Exercise2_14 {
  public static void main(String[] args) {
      // Using one println (with a single string)
      System.out.println("1 2 3 4");

      // Using four print statements
      System.out.print("1 ");
      System.out.print("2 ");
      System.out.print("3 ");
      System.out.print("4\n");  // \n to end the line

      // Using printf
      System.out.printf("%d %d %d %d\n", 1, 2, 3, 4);
  }
}