package operadores;

import java.util.Scanner;

public class E0107 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double radioCirculo;


        System.out.println("Introduce el radio de una circunferencia: ");

        radioCirculo = sc.nextDouble();

        double perimetroCirculo = 2 * Math.PI * radioCirculo;

        double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);


        System.out.printf("Para una circunferencia con radio " + radioCirculo + " :\nPerímetro = " + "%.2f", perimetroCirculo);

        System.out.printf("\nÁrea = " + "%.2f", areaCirculo);


        sc.close();



    }
}
