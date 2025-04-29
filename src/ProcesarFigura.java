
import java.util.Scanner;

public class ProcesarFigura {

    static Scanner linea = new Scanner(System.in);

    public static void main(String[] args) {
        //procesarCirculo();
        procesarCilindro();
    }

    public static void procesarCirculo() {
        int op = 0;
        double radio;

        do {
            System.out.println("Ingrese radio :");
            radio = linea.nextDouble();

            if (radio < 0) {
                System.out.println("Radio no puede ser menor a cero!");
                op = 1;
            } else if (radio == 0) {
                System.out.println("Radio no puede ser igual a cero ");
                op = 2;
            } else {
                op = 0;
            }
        } while (op != 0);

        {
            Circulo c = new Circulo(radio);
            System.out.println("área " + c.calcularArea());
            System.out.println("Longitud :" + c.calcularLongitud());
        }
    }

    public static void procesarCilindro() {
        double radio, altura;
        int opcion = 0;
        try {
            do {
                System.out.print("Ingrese el radio: ");
                radio = linea.nextDouble();
                if (radio < 0) {
                    System.out.println("Radio no puede ser menor a cero");
                    opcion = 1;
                } else if (radio == 0) {
                    System.out.println("Radio no puede ser igual a cero ");
                    opcion = 2;
                } else {
                    opcion = 0;
                }
                
                System.out.print("Ingrese la altura: ");
                altura = linea.nextDouble();
                if (altura < 0) {
                    System.out.println("La altura no puede ser menor a cero");
                    opcion = 1;
                } else if (altura == 0) {
                    System.out.println("La altura no puede ser igual a cero");
                    opcion = 1;
                } else {
                    opcion = 0;
                }
            } while (opcion != 0);
            
            Cilindro cil = new Cilindro(radio, altura);
            System.out.printf("El área del cilindro es %f%n", cil.calcularArea());
            System.out.printf("El volúmen del cilindro es %f", cil.calcularVolumen());
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: La entrada no es un número entero válido.\n");
            linea.nextLine(); // Limpiar el buffer de entrada.

            System.out.print("Por favor, ingrese un número válido para el radio: ");
            radio = linea.nextDouble();
            if (radio < 0) {
                System.out.println("Radio no puede ser menor a cero!");
                opcion = 1;
            } else if (radio == 0) {
                System.out.println("Radio no puede ser igual a cero ");
                opcion = 2;
            } else {
                opcion = 0;
            }

            System.out.print("Por favor, ingrese un número válido para la altura: ");
            altura = linea.nextDouble();

            if (altura < 0) {
                System.out.println("Radio no puede ser menor a cero!");
                opcion = 1;
            } else if (altura == 0) {
                System.out.println("Radio no puede ser igual a cero ");
                opcion = 2;
            } else {
                opcion = 0;
            }

            Cilindro cil = new Cilindro(radio, altura);
            System.out.printf("El área del cilindro es %f%n", cil.calcularArea());
            System.out.printf("El volúmen del cilindro es %f", cil.calcularVolumen());

        } finally {
            linea.close();
        }
    }

}
