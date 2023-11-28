package ejercicio;

import java.util.Scanner;

public class ejerciciout5 {
    public static void main(String[] args) {
        int secreto = 1 + (int) (Math.random() * 100);
        int intentos = 0;
        System.out.println("Elige un número entre 1 y 100 :");
        boolean acertado = false;
        Scanner sc = new Scanner(System.in);
        while (!acertado) {
            int numero = sc.nextInt();

            if (numero == secreto) {
                acertado = true;
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            } else if (numero == -1) {
                System.out.println("Te has rendido. El número secreto era " + secreto + ".");
                break;
            } else if (numero < secreto) {
                System.out.println("El número a adivinar es mayor. Inténtalo de nuevo.");
            } else {
                System.out.println("El número a adivinar es menor. Inténtalo de nuevo.");
            }

            intentos++;
        }

    }
}
