
// Clase que define nuestra plantilla para las mascotas
class Mascota {
    // 1. Atributos privados (Esto es la Encapsulación)
    private String nombre;
    private int edad;
    private int energia;

    // 2. Constructor: Método especial para crear la mascota con datos iniciales
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.energia = 100; // Toda mascota nace con 100% de energía
    }

    // 3. Getters: Métodos públicos para leer los atributos privados (Encapsulación)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getEnergia() {
        return energia;
    }

    // 4. Métodos: Acciones que la mascota puede realizar
    public void jugar() {
        if (energia >= 20) {
            energia -= 20; // Jugar gasta energía
            System.out.println(nombre + " está jugando felizmente. Energía restante: " + energia + "%");
        } else {
            System.out.println(nombre + " está muy cansado(a) para jugar. Necesita dormir.");
        }
    }

    public void alimentar() {
        energia += 30; // Comer recupera energía
        if (energia > 100) {
            energia = 100; // La energía no puede pasar de 100
        }
        System.out.println(nombre + " está comiendo. Energía actual: " + energia + "%");
    }

    public void dormir() {
        energia = 100; // Dormir restaura toda la energía
        System.out.println(nombre + " está durmiendo profundamente... Zzz. Energía restaurada al 100%.");
    }
}

// Clase principal donde se ejecuta el programa
public class Main {
    public static void main(String[] args) {
        System.out.println("=== BIENVENIDO AL SIMULADOR DE MASCOTAS ===");
        System.out.println("-------------------------------------------\n");

        // Instanciando (creando) los objetos a partir de la clase Mascota
        Mascota mascota1 = new Mascota("Tami", 4);
        Mascota mascota2 = new Mascota("Tuna", 2);
        Mascota mascota3 = new Mascota("Yoko", 5);

        // Demostración del uso de Getters
        System.out.println("Mis mascotas registradas son:");
        System.out.println("- " + mascota1.getNombre() + " (" + mascota1.getEdad() + " años)");
        System.out.println("- " + mascota2.getNombre() + " (" + mascota2.getEdad() + " años)");
        System.out.println("- " + mascota3.getNombre() + " (" + mascota3.getEdad() + " años)\n");

        // Interactuando con las mascotas usando los métodos
        System.out.println("--- Iniciando interacciones ---");
        
        mascota1.jugar();
        mascota1.jugar();
        mascota1.jugar();
        mascota1.jugar();
        mascota1.jugar(); // Aquí Tami debería quedarse casi sin energía
        mascota1.jugar(); // Tami ya no puede jugar, el sistema avisa

        System.out.println(); // Salto de línea por orden

        mascota1.dormir(); // Tami recupera energía
        mascota2.alimentar(); // Tuna come algo
        
        System.out.println();
        System.out.println("Estado final de " + mascota3.getNombre() + ": Energía al " + mascota3.getEnergia() + "%");
    }
}
