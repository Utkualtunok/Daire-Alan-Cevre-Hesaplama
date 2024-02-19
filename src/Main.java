import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int r, a;
      double pi = 3.14;

      Scanner input = new Scanner(System.in);
      System.out.println("Dairenin yarı çapını giriniz : ");
      r = input.nextInt();
      System.out.println("Açı ölçüsü : ");
      a = input.nextInt();

      // Alan formülü
      double alan = (pi * (r * r) * a) / 360;
      System.out.println("Dairenin alanı : " + alan);

    }
}