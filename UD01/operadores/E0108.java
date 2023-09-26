package operadores;

import java.util.Scanner;
public class E0108 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tuEdad;

        System.out.println("Introduce tu edad, por favor");

        tuEdad = sc.nextInt();

        boolean mayorEdad = (tuEdad >=18) ? true : false;

        System.out.println(mayorEdad);
        
       sc.close();

    }
}
