import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7; 
        int intento = 0;
        
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tengo un número pensado del 1 al 10. ¿Puedes adivinarlo?");
        
        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt(); 
            
            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Lograste adivinar el número.");
            } else {
                System.out.println("Cerca, pero no. ¡Inténtalo de nuevo!");
            }
        }
        
        System.out.println("Gracias por jugar.");
        scanner.close(); 
    }
}