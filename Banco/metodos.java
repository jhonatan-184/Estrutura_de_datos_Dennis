import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class metodos {
    public Queue<Objbanco> LlenarBanco(Queue<Objbanco> colaNormal, Queue<Objbanco> colaPreferencial, Scanner sc) {
        boolean cont = true;
        while (cont) {
            Objbanco o = new Objbanco();
            System.out.println("Bienvenido al banco, por favor llenar los datos\ningrese su cedula");
            o.setIdent(sc.nextInt());
            System.out.println("Ingrese su nombre");
            o.setNombre(sc.next());
            System.out.println("Ingrese el tipo de tramite que va realizar");
            o.setTipo_de_trámite(sc.next());
            System.out.println("Ingrese la edad");
            o.setEdad(sc.nextInt());
            o.setEstate(0);
            System.out.println("¿Tiene alguna condicion especial? si) 1 no) 0)");
            int tieneCondicion = sc.nextInt();

            if (tieneCondicion == 1) {
                int opcionCondicion = CondicionesEspeciales(sc);
                o.setCondición_especial(opcionCondicion);
            } else {
                o.setCondición_especial(0);
            }

            if (o.getEdad() > 68 || (o.getCondición_especial() >= 1 && o.getCondición_especial() <= 3)) {
                colaPreferencial.add(o);
                System.out.println("¡Cliente asignado a la cola Preferencial!");
            } else {
                colaNormal.add(o);
                System.out.println("Cliente asignado a la cola Normal.");
            }

            System.out.println("¿Desea continuar? si) 1 no) 0)");
            int continuar = sc.nextInt();
            if (continuar == 0) {
                cont = false;
            }
        }
        return colaNormal;
    }

    public int validarTurno(Queue<Objbanco> colaNormal, Queue<Objbanco> colaPreferencial) {
        int turno = 0;
        if (colaNormal.isEmpty() && colaPreferencial.isEmpty()) {
            System.out.println("No hay personas en ninguna cola");
            turno = 1;
        } else {
            turno = colaNormal.size() + colaPreferencial.size() + 1;
        }
        return turno;
    }

    public int CondicionesEspeciales(Scanner sc) {
        System.out.println("Que condicion especial tiene; escoja una opcion");
        System.out.println("1 adulto mayor");
        System.out.println("2 situacion de embarazo");
        System.out.println("3) Discapacidad fisica");
        return sc.nextInt();
    }
     public Queue<Objbanco> Atender(Queue<Objbanco> colaNormal, Queue<Objbanco> colaPreferencial, Scanner sc) {
        Queue<Objbanco> cola = new LinkedList<>();
        if (!colaNormal.isEmpty()) {
            cola = colaNormal;
        } else if (!colaPreferencial.isEmpty()) {
            cola = colaPreferencial;
        }

        for (Objbanco o : cola) {
            if (o.getEstate() == 0) {
                System.out.println("El siguiente turno es " + o.getNúmero_turno() + " con un pedido de :" + o.getNombre());
                o.setEstate(1);
                System.out.println("Turno atendido correctamente");
                return cola;
            }
        }

        System.out.println("No hay turnos pendientes para atender.");
        return cola;
    }

   
    public Queue<Objbanco> mostrarTurnos(Queue<Objbanco> colaNormal, Queue<Objbanco> colaPreferencial, int opt) {
        Queue<Objbanco> cola = new LinkedList<>();
        if (!colaNormal.isEmpty()) {
            cola = colaNormal;
        } else if (!colaPreferencial.isEmpty()) {
            cola = colaPreferencial;
        }
        switch (opt) {
            case 1:
                for (Objbanco o : cola) {
                    System.out.println("Turno: " + o.getNúmero_turno());
                    System.out.println("Nombre: " + o.getNombre());
                    System.out.println("Tipo de trámite: " + o.getTipo_de_trámite());
                    System.out.println("Edad: " + o.getEdad());
                    System.out.println("cedula: " + o.getIdent());

                    if (o.getEstate() == 0 ){
                        System.out.println("Estado: Pendiente");
                    } else {
                        System.out.println("Estado: Atendido");
                    }
                    System.out.println("----------------------------------------- \n");

                }

                break;
            }
        return cola;

    }
    public Queue<Objbanco> EliminarTurno(Queue<Objbanco> colaNormal, Queue<Objbanco> colaPreferencial){
        if (!colaNormal.isEmpty()) {
            colaNormal.remove();
        } else if (!colaPreferencial.isEmpty()) {
            colaPreferencial.remove();
        } else {
            System.out.println("No hay turnos para eliminar.");
        }

        return colaNormal;
    }


}