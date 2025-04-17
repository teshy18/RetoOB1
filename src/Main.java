import java.util.Random;
import java.util.Scanner;

public class Main {



        public static void main(String[] args) {

            int maximosIntentos = 5;
            int intentoActual = 1;
            int numeroMaximo = 10;

            int numeroGenerado = new Random().nextInt(numeroMaximo); // genera un número aleatorio entre 0 y 100

            Scanner scanner = new Scanner(System.in);


            while (intentoActual <= maximosIntentos) {

                System.out.print("Ingrese un número entre 0 y " +  numeroMaximo + ":");

                int numeroDelUsuario = scanner.nextInt();
                intentoActual++;

                if (numeroDelUsuario == numeroGenerado) {
                    System.out.println("Felicidades!!! Acertaste el número en el " + intentoActual + "º intento!");
                    break;
                } else if (numeroDelUsuario < numeroGenerado) {
                    System.out.println("El número que escribiste es menor al número generado.");
                } else {
                    System.out.println("El número que escribiste es mayor al número generado.");
                }
            }

            if (intentoActual > 5) {
                System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentoActual. El número era " + numeroGenerado);
            }
        }



};

