public class Vetor12 {

    public static void main(String[] args) {
      int n = 10; 
      int a[] = new int[n]; 
      int i; 
      int sm = 0; 

      for (i=0; i<n; i++) {
        a[i] = (int)Math.round(Math.random() * 100); 

        sm = sm + a[i];

        System.out.printf("a[%d] = %2d\n", i, a[i]);
      }

      System.out.printf("\nA Soma dos elementos do vetor é: %d.\n", sm);
    }

}