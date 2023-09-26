package operadores;

import java.time.LocalDate;
import java.util.Scanner;


public class E0104b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int anoNacimiento;

        int anoActual = LocalDate.now().getYear(); // ACCEDE AL AÑO ACTUAL



        System.out.println("Introduce tu año de nacimiento: ");
        
        anoNacimiento = sc.nextInt();

        System.out.println("Tienes " + (anoActual - anoNacimiento) + " años.");

        sc.close();
    }
    
}
