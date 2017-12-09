import java.util.Scanner;

public class Satusdn  {
    public static void main(String[] args) {
        System.out.print("Bilangan bulat n = ");
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        kbd.close();

        int i = 1;
        while (i <= n) {
            System.out.println(i);

            i++;
        }
    }
}
