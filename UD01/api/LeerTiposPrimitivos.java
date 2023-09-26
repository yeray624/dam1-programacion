package api;

import java.util.Locale;
import java.util.Scanner;

public class LeerTiposPrimitivos{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Introduce un dato de tipo byte: ");
        byte varByte = sc.nextByte();


        System.out.println("Introduce un dato de tipo short: ");
        short varShort = sc.nextShort();


        System.out.println("Introudce un dato de tipo int: ");
        int varInt = sc.nextInt();


        System.out.println("Introduce un dato de tipos long: ");
        long varLong = sc.nextLong();


        System.out.println("Introduce un ddato de tipo float: ");
        float varFloat =  sc.nextFloat();


        System.out.println("Introduce un dato de tipo double: ");
        double varDouble = sc.nextDouble();


        System.out.println("Introduce un dato de tipo char: ");
        char varChar = sc.next().charAt(0); 
        sc = new Scanner(System.in);

       
        System.out.println("Introduce una cadena de caracteres: ");
        String varString = sc.nextLine();
        sc = new Scanner(System.in);
        
        
        System.out.println("Introduce un dato de tipo boolean: ");
        boolean varBoolean = sc.nextBoolean();


        System.out.println("Tus datos introducidos son:\nPara byte = " + varByte);
        System.out.println("Para short = " + varShort);
        System.out.println("Para int = " + varInt);
        System.out.println("Para long = " + varLong);
        System.out.println("Para float = " + varFloat);
        System.out.println("Para double = " + varDouble);
        System.out.println("Para char = " + varChar);
        System.out.println("Para boolean = " + varBoolean);


        sc.close();
    }
}