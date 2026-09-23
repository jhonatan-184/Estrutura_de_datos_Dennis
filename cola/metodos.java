// ejercicio de turno

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class metodos{

    public Queue<ObjTurn> llenarinfo(Queue<ObjTurn> cola, metodos m, Scanner sc){
        boolean cont = true;
        while (cont) {
            ObjTurn o = new ObjTurn();
            o.setTurno(m.validarturno(cola));
            o.setNombre();
        }
       

        
    }
    public Queue<ObjTurn>validarturno(Queue<ObjTurn> cola){
        int turno = 0;
       if (cola.isEmpty()) {
        turno = 1;
       }else{
        turno = cola.size();
       }
       return turno;
    }
    
}