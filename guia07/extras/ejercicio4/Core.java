package guia07.extras.ejercicio4;

import java.util.Scanner;

public class Core {

    public static void main(String[] args) {
        String nombre, rta;
        boolean continuar = true;
        int saldo, retiro;

        try (Scanner leer = new Scanner(System.in)) {
            Cuenta cliente = new Cuenta();

            System.out.println("Ingrese el nombre del titular de la cuenta: ");
            nombre = leer.nextLine();
            System.out.println("Ingrese el saldo de la cuenta:");
            saldo = leer.nextInt();

            cliente.setTitular(nombre);
            cliente.setSaldo(saldo);

            while (continuar) {
                System.out.println("Ingrese el monto a retirar de la cuenta de " + cliente.getTitular());
                retiro = leer.nextInt();

                cliente.retirar_dinero(retiro);

                System.out.println("¿Desea hacer otra operacion? (S/N)");
                do {
                    rta = leer.nextLine().toUpperCase();
                } while (!rta.equals("S") && !rta.equals("N"));
                if (rta.equals("N")) {
                    continuar = false;
                }
            }
        }
    }
}
