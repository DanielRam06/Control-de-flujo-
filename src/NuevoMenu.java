import java.util.Scanner;

public class NuevoMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operacion;
        while (true) {
            System.out.println("1. Calculos de un Circulo");
            System.out.println("2. Calculos de un Cuadrado");
            System.out.println("3. salir");
            System.out.print("Inserte opcion : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Inserta el radio del circulo: ");
                    double lado1 = scanner.nextDouble();
                    Circulo2 circle = new Circulo2(lado1);
                    System.out.println("¿Qué operación deseas realizar? (elija: area o circunferencia)");
                    operacion = scanner.next();
                    if (operacion.equals("circunferencia")) {
                        System.out.println("La circunferencia del círculo es: " + circle.getCircunferencia());
                    } else if (operacion.equals("area")) {
                        System.out.println("El área del círculo es: " + circle.getArea());
                    } else {
                        System.out.println("Operación inválida para un círculo");
                    }
                    break;
                case 2:
                    System.out.print("Inserta el tamaño del lado del cuadrado: ");
                    double lado11 = scanner.nextDouble();
                    Cuadrado1 square = new Cuadrado1((double) lado11);
                    System.out.println("¿Qué operación deseas realizar? (elija: diagonal, perimetro, area)");
                    operacion = scanner.next();
                    if (operacion.equals("diagonal")) {
                        System.out.println("La diagonal del cuadrado es: " + square.getDiagonal());
                    } else if (operacion.equals("perimetro")) {
                        System.out.println("El perímetro del cuadrado es: " + square.getPerimetro());
                    } else if (operacion.equals("area")) {
                        System.out.println("El área del cuadrado es: " + square.getArea());
                    } else {
                        System.out.println("Operación inválida para un cuadrado");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Accion invalidad, Porfavor Coloque una accion valida.");
                    break;
            }
        }
    }
}
