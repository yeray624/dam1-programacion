package operadores;

import java.util.Scanner;

public class E0110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Está lloviendo (Introduce true / false)");

        boolean lluvia = sc.nextBoolean();

        System.out.println("Has terminado tus tareas (Introduce true / false)");

        boolean tareas = sc.nextBoolean();

        System.out.println("Tienes recados que hacer ()Introudce true / false ");

        boolean recados = sc.nextBoolean();

        boolean salir = (lluvia == false && tareas == true && recados == false) ? true : false;
        // bollean salir = recados || (!tareas && !llueve);   
        System.out.println("PUEDES SALIR = " + salir);
        
    }
    
}
