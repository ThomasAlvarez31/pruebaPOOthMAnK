import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Steve steve = new Steve("Steve", 100, 1, "picota");
        Alex alex = new Alex("Alex",100,1,"silicio");
        EnemigoMinecraft enemigo = new EnemigoMinecraft("Enderman",20);

        while (true) {
            System.out.println("elija una opcion");
            System.out.println("1. Steve recolecta recursos");
            System.out.println("2. alex construye");
            System.out.println("3. el enemigo ataca");
            System.out.println("4. salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    steve.accion();
                    break;
                case 2:
                    alex.accion();
                    break;
                case 3:
                    enemigo.atacar(steve);
                    enemigo.atacar(alex);
                    System.out.println("la vida de steve es de "+ steve.getSalud());
                    System.out.println("la vida de alex es de"+ alex.getSalud());
                    break;
                case 4:
                    System.out.println("saliendo del programa :D");
                    scanner.close();
                    return;
                default:
                    System.out.println("Elija bien >:(");
            }
        }
    }
    }
