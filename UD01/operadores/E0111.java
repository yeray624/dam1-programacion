package operadores;

import java.util.Scanner;


public class E0111 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        double perasKg, manzanasKg;

        double precioPera = 2.35;

        double precioManzana = 1.95;




        System.out.println("Cuántos kilos de manzanas has vendido?");

        perasKg = sc.nextDouble();

        double totalPeras = precioPera * perasKg;


        System.out.println("Cuántos kilos de peras has vendidos");

        manzanasKg = sc.nextDouble();

        double totalManzanas = precioManzana * manzanasKg;



        System.out.println("Has facturado: Manzanas = " +  totalManzanas);
        
        System.out.println("Has facturado: Peras = " +  totalPeras);
        

        

    }
    
}
