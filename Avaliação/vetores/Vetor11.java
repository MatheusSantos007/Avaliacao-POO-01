public class Vetor11 {

    public static void main(String[] args) {
      int n = 10; 
      int a[] = new int[n]; 
      int i;
      int numpar = 0;

      for (i=0; i<n; i++) {
        a[i] = (int)Math.round(Math.random() * 100);

        if ((a[i] % 2) == 0) {
           numpar = numpar + 1; 
           System.out.printf("a[%d] = %2d <--- %do. número par\n", i, a[i], numpar);
        }
        else System.out.printf("a[%d] = %2d\n", i, a[i]);
      }

      System.out.printf("\n\nNo vetor existem %d números pares.\n", numpar);
    }

}