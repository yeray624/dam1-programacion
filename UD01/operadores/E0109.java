package operadores;

import java.util.Scanner;

public class E0109 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int tuNum;

        
        System.out.println("Introduce un número, por favor");

        tuNum = sc.nextInt();

        String parImpar = (tuNum % 2 != 0) ? "Impar" : "Par";

        System.out.println(parImpar);

        sc.close();
    }
    
    


}
