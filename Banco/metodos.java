import java.util.Queue;
import java.util.Scanner;

public class metodos {
    public Queue<Objbanco>LLenarBanco(Queue<Objbanco> cola, Scanner sc){
        boolean cont = true;
        while(cont){
            Objbanco o = new Objbanco();
            System.out.println("Bienvenido al banco, porfavor llenar los datos\n" +"ingrese su cedula");
            o.setIdent(sc.nextInt());
            System.out.println("Ingrese su nombre");
            o.setNombre(sc.next());
            System.out.println("Ingrese el tipo de tramite que va realizar");
            o.setTipo_de_trámite(sc.next());
            System.out.println("iIngrese la edad");
            o.setEdad(sc.nextInt());
            System.out.println("¿Tiene alguna condicion especial? si) 1 no) 0");
            o.setCondición_especial(sc.nextInt());
            if (cola.o.setEdad()> 68) {
                System.out.println("Usted tiene prioridad");
                
            }
            
        }

        return cola;
    }
    
}
