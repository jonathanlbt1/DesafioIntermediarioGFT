import java.io.IOException;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int media = 0;
        char O = leitor.next().charAt(0);
        double soma = 0.0;
        double[][] n = new double[12][12];

        for (int l = 0; l < 12; l++)
            for (int c = 0; c < 12; c++)
                n[l][c] = leitor.nextDouble();


        for (int l = 0; l < 12; l++) {
            for (int c = 0; c < 12; c++) {
                if (c > l) {
                    soma += n[l][c];
                    if (n[l][c] != 0) {
                        media++;
                    }
                }
            }
        }
        if (O == 'S') {
            System.out.printf("%.1f\n", soma);
        }

        if (O == 'M') {
            System.out.printf("%.1f\n", (soma / media));
        }

        leitor.close();
    }
}



