package C24B3;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] edad = new int[5];

        System.out.println("Estudiante #1 Ingrese su edad:");
        edad[0] = scanner.nextInt();

        System.out.println("Estudiante #2 Ingrese su edad:");
        edad[1] = scanner.nextInt();

        System.out.println("Estudiante #3 Ingrese su edad:");
        edad[2] = scanner.nextInt();

        System.out.println("Estudiante #4 Ingrese su edad:");
        edad[3] = scanner.nextInt();

        System.out.println("Estudiante #5 Ingrese su edad:");
        edad[4] = scanner.nextInt();

        int suma = edad[0] + edad[1] + edad[2] + edad[3] + edad[4];
        int promedio = suma / edad.length;

        System.out.println("El promedio de edad es: "+ promedio);

        scanner.close();
    }

}
