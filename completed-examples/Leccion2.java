/******************************************************************************

Lección 2: variables y tipos de datos en Java


*******************************************************************************/
public class Main {
    public static void main(String[] args) {

        // =====================================
        // Declarando variables
        // =====================================

        // String almacena texto
        String nombre = "Carlos";

        // int almacena números enteros
        int edad = 15;

        // =====================================
        // Mostrar variables en pantalla
        // =====================================

        System.out.println(nombre);
        System.out.println(edad);

        System.out.println("Mi edad es:");
        System.out.println(edad);


        // =====================================
        // Más ejemplos con String
        // =====================================

        String ciudad = "Lima";
        String colegio = "San Martín";
        String videojuego = "Minecraft";

        System.out.println(ciudad);
        System.out.println(colegio);
        System.out.println(videojuego);


        // =====================================
        // Uniendo texto y variables
        // =====================================

        System.out.println("Hola " + nombre);

        System.out.println("Tengo " + edad + " años");


        // =====================================
        // Tipo double
        // =====================================

        // double almacena números con decimales
        double altura = 1.75;
        double promedio = 17.5;
        double precio = 29.99;

        System.out.println("Mi altura es: " + altura);
        System.out.println("Mi promedio es: " + promedio);
        System.out.println("El precio es: " + precio);


        // =====================================
        // Tipo boolean
        // =====================================

        // boolean solo puede almacenar true o false
        boolean aprobado = true;
        boolean tieneMembresia = false;

        System.out.println("¿Aprobó?: " + aprobado);
        System.out.println("¿Tiene membresía?: " + tieneMembresia);


        // =====================================
        // Ejemplo completo de un estudiante
        // =====================================

        String nombreEstudiante = "María";
        int edadEstudiante = 16;
        double promedioEstudiante = 18.5;
        boolean aproboCurso = true;

        System.out.println("Nombre: " + nombreEstudiante);
        System.out.println("Edad: " + edadEstudiante);
        System.out.println("Promedio: " + promedioEstudiante);
        System.out.println("¿Aprobó?: " + aproboCurso);


        // =====================================
        // Reto: Crear nuestras propias variables
        // =====================================

        // Mi nombre
        String nombreEjercicio = "Leonardo";

        // Mi edad
        int edadEjercicio = 20;

        // Mi comida favorita
        String comidaFavoritaEjercicio = "Lomo Saltado";

        // Mi estatura
        double estaturaEjercicio = 1.70;

        // ¿Me gusta programar?
        boolean meGustaProgramarEjercicio = true;

        // Mostrar toda la información
        System.out.println("Nombre: " + nombreEjercicio);
        System.out.println("Edad: " + edadEjercicio);
        System.out.println("Comida favorita: " + comidaFavoritaEjercicio);
        System.out.println("Estatura: " + estaturaEjercicio + " metros");
        System.out.println("¿Me gusta programar?: " + meGustaProgramarEjercicio);

    }
}
