package api;

import java.util.Scanner;

public class LeerNumeroentero {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número, por favor: ");

        int tuNumero = sc.nextInt();
        
        System.out.println("El número introducido es: " + tuNumero);

        sc.close();
    }
}
