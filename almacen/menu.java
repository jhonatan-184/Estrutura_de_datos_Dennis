import java .util.Scanner;
public class menu {
    run| debug 
    oublic static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean contunuar = true;
        while
(contunuar) {
            System.out.println("Bienvenido al malmacen estruturas de noche");
            System.out.println("que desea realizar ");
            System.out.println("1. Llenar Almacen");
            System.out.println("2. mostrar almacen");
             System.out.println("3. llenar almacen2 ");
              System.out.println("4. Buscar producto");
               System.out.println("5 unificar almacen");
                System.out.println("6. mostrar almacen unificado");
                 System.out.println("7. buscar producto en almacen unificado");
                  System.out.println("8. salir");
        
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    llenarAlmacen(sc);
                    break;
                case 2:
                    contunuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
      
    }