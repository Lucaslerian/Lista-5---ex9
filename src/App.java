import java.util.Scanner;

public class App {

    public static int reverse(int num) {
        String numStr = "" + num;
        String numAtualizado = "";
        for (int a = numStr.length() - 1; a >= 0; a--) {
            numAtualizado += numStr.charAt(a);

        }
        return Integer.parseInt(numAtualizado);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Digite qualquer número:");
        int num = teclado.nextInt();
        System.out.println(" O número digitado ao contrário é: " + reverse(num));
        teclado.close();

    }

}