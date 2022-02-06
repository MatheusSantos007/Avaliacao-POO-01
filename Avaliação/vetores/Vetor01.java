
import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int n = 5;
            int a[] = new int[n];
            int b[] = new int[n];
            int i;

            for (i=0; i<n; i++){
                System.out.printf("Informe %do. elemento de %d: ", (i+1), n);
                a[i] = entrada.nextInt();
            }
            for (i=0; i<n; i++){
                b[i] = a[i];
            }

            System.out.printf("\n\n");
            for (i=0; i<n; i++){
                System.out.printf("a[%d] = %3d b[%d] = %3d\n", i, a[i], i, b[i]);
            }
        }
    }
}