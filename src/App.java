import java.util.Scanner;

// public class Comp {
//     int comp[]= new int[lineas];

//     public Comp(int comp) {

//         System.out.println("Name chosen is :" + comp );
//      }

//     //  public void setAge( int comp ) {
//     //     this.comp = comp;
//     //  }

//      public int getAge( ) {
//         System.out.println("Puppy's age is :" + comp );
//         return comp;
//      }
// }

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Digite la cantidad de líneas de los archivos");

        Scanner sc = new Scanner(System.in);
        int lineas = sc.nextInt();

        System.out.println("las líneas son: " + lineas);

        int[] x = new int[lineas];
        int[] y = new int[lineas];
        int[][] z = new int[lineas][lineas];

        for (int i = 0; i < lineas; i++) {
            x[i] = i;
            y[i] = x[i];
            // System.out.println(" vector x, línea " + i + ": " + x[i] + " ");
            // System.out.println(" vector y, línea " + i + ": " + y[i] + " ");
            // System.out.println();
        }

        // for (int i = 0; i < lineas; i++) {
        // System.out.println("vector x[" + i + "] = " + x[i] + " ");
        // }

        // for (int i = 0; i < lineas; i++) {
        // System.out.println("vector y[" + i + "] = " + y[i] + " ");
        // }

        System.out.println("Los grupos de comparaciones son: ");

        // for(int i=0; i<lineas;i++){
        // System.out.println(x[i]+y[i]);
        // System.out.println( "x["+i+"] = "+ x[i] + " con "+ "y["+i+"] = " + y[i] + "
        // ");
        // }

        for (int i = 0; i < lineas; i++) {
            for (int j = 0; j < lineas; j++) {
                z[i][j] = x[i];
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }

        // for (int i = 0; i < lineas; i++) {
        // for (int j = 0; j < lineas; j++) {

        // }

        // }
    }
}
