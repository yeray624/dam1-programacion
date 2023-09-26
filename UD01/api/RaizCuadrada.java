package api;

import java.util.Scanner;


public class RaizCuadrada{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introudce un número: ");
        int numero =  sc.nextInt();

        //¿Cómo podrías formatear la salida por pantalla para presentar solo dos decimales?
            //Casting a int
        System.out.println("La raíz cuadrada de " + numero + " es " + (int)Math.sqrt(numero)); 

        sc.close();
    }
    
}


