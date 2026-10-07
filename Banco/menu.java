import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Objbanco> colaNormal = new LinkedList<>();
         Queue<Objbanco> colaPreferencial = new LinkedList<>();
        metodos m = new metodos();
        boolean continuar = true;
        while (continuar) {
            System.out.println("bienvenidos a la clase de colas(Nacho lee 3)");
            System.out.println("Que desea realizar");
            System.out.println("1) llenar registros ");
            System.out.println("2) Mostrar turnos pendientes ");
            System.out.println("3) Atender Turno ");
            System.out.println("4) Eliminar Turno ");
            System.out.println("5) Mostrar Pedidos Atendidos");
            int opt = m.ValidarEentero(sc);
            switch (opt) {
                case 1:
                    colaNormal = m.llenarRegistros(colaNormal, sc);
                    break;
                case 2:
                    m.mostrarTurnos(colaNormal, colaPreferencial, 1);
                    break;
                case 3:
                    m.Atender(colaNormal, colaPreferencial, sc);
                    break;
                case 4:
                    m.EliminarTurno(colaNormal, colaPreferencial);
                    break;
                case 5:
                    m.mostrarTurnos(colaNormal, colaPreferencial, 3);
                    break;
            }
        }
    }
}