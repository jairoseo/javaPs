package C24B3;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("El numero "+ numero1 + " es mayor que "+ numero2);
        }else{
            System.out.println("El numero "+ numero2 + " es mayor que "+ numero1);
        }

        scanner.close();

    }
}
