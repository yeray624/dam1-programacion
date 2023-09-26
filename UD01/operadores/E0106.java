package operadores;

import java.util.Scanner;

public class E0106 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nota1 ;

        int nota2;
        
        

        System.out.println("Introduce la nota número 1:");

        nota1 = sc.nextInt();

        System.out.println("Introduce la nota número 2");

        nota2= sc.nextInt();

        double media = ((double)nota1 + (double)nota2) / 2;



        System.out.println("La media de " + nota1 + " y " + nota2 + " es: " + media);


        sc.close();
    }
}
