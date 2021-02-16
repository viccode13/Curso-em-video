import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int num;

    for (int i = 0; i < 5; i++) {
      System.out.println("Entre com um número: ");
      num = scan.nextInt();
    }
  }
}