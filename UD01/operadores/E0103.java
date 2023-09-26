package operadores;

import java.util.Scanner;

public class E0103{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tuEdad;


        System.out.println("Introduce tu edad: ");

        tuEdad = sc.nextInt();

        System.out.println("El año que viene tendrás: " + (tuEdad + 1) + " años");

        sc.close();
    }
}