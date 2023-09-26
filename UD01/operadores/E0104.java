package operadores;

import java.util.Scanner;

public class E0104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int anoNacimiento;

        int anoActual;



        System.out.println("Introduce tu año de nacimiento: ");
        
        anoNacimiento = sc.nextInt();

        System.out.println("Introduce el año actual: ");

        anoActual = sc.nextInt();


        System.out.println("Tienes " + (anoActual - anoNacimiento) + " años.");

        sc.close();
    }
    
}
