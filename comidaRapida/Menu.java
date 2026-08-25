import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matrix");
        int n = sc.nextInt();
        ObjComidaRapida[][] ventas = new ObjComidaRapida[n][n];
        Metodos m = new Metodos();
        boolean continuar = true;
        while (continuar) {
            int opt = m.OpcionesMenuPrincipal();
            switch (opt) {
                case 1:
                    ventas = m.LLenarRegistros(n);
                    break;
                case 2:
                    System.out.println("se muestran a continuacion los turnos pendiente");
                    m.MostrarTurnosPendientes(ventas);
                    break;
                case 3:
                    System.out.println("los pedidos despachgados son:");
                    m.MostrarTurnosDespachados(ventas);
                    break;
                case 4:
                    ventas = m.Despachar(ventas);
                    break;
                case 5:
                    System.out.println("Que tenga un feliz día");
                    continuar = false;
                    break;

                default:
                    System.out.println("Esta opción no existe por favor valide de nuevo ");
                    break;
            }
        }
         Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matrix");
        int n = sc.nextInt();
        Almacen2[][] ventas = new Almacen2[n][n];
        Metodos A = new Metodos();
        boolean continuar = true;
        while (continuar) {
            int opt = A.OpcionesMenuPrincipal();
            switch (opt) {
                case 1:
                    ventas = A.LLenarRegistros(n);
                    break;
                case 2:
                    System.out.println("se muestran a continuacion los turnos pendiente");
                    A.MostrarTurnosPendientes(ventas);
                    break;
                case 3:
                    System.out.println("los pedidos despachgados son:");
                    A.MostrarTurnosDespachados(ventas);
                    break;
                case 4:
                    ventas = A.Despachar(ventas);
                    break;
                case 5:
                    System.out.println("Que tenga un feliz día");
                    continuar = false;
                    break;

                default:
                    System.out.println("Esta opción no existe por favor valide de nuevo ");
                    break;
            }
        }
    }
}
