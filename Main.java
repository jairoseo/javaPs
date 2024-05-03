package C24B2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Donde vives");
        String ciudad = scanner.next();

        System.out.println("Cual es tu edad");
        String edad = scanner.next();

        System.out.println("Ingresa tu telefono");
        String telefono = scanner.next();

        System.out.println("Cual fue tu ultimo estudio");
        String estudio = scanner.next();

        System.out.println(ciudad + " es la mejor ciudad");
        System.out.println(edad + " estas muy joven.");
        System.out.println("Tu numero de telefono " +telefono);
        System.out.println("Tu ultimo estudio " +estudio);

        scanner.close();

    }

}
