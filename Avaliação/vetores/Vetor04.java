import java.util.Scanner;

public class Vetor04 {

    public static void main(String[] args) {
      try (Scanner entrada = new Scanner(System.in)) {
        int n = 15;
          int a[] = new int[n];
          double b[] = new double[n]; 
          int i; 

          for (i=0; i<n; i++) {
            System.out.printf("Informe o %2do. elemento de %d: ", (i+1), n);
            a[i] = entrada.nextInt();
          }

          for (i=0; i<n; i++) {
            b[i] = Math.sqrt(a[i]);
          }

          System.out.printf("\n\n i- a[i]   b[i] = sqrt(a[i])\n");
          System.out.printf("*****************\n");
          for (i=0; i<n; i++) {
            System.out.printf("%2d- %4d   %10.5f\n", i, a[i], b[i]);
          }
    }

      System.out.printf("*****************\n");
    }

}