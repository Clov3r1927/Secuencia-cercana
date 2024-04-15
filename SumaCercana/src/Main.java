import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Ingrese el tamaño del datos:");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el valor de X:");
        int X = scanner.nextInt();

     
        int result = SumaCercana.sumaMasCercana(arr, X);
        System.out.println("Suma más cercana a " + X + ": " + result);

        scanner.close();
    }
}
