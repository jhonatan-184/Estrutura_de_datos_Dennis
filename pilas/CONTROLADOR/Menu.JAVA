package CONTROLADOR;

import java.util.Scanner;
import java.util.Stack;

import MODELO.ObjLibro;
import VALIDACIONES.Validar;
import VISTA.Metodos;
public class Menu{
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<ObjLibro> o = new Stack<>();
    Metodos m = new Metodos(); 
    boolean cont = true;
    while (cont){
        System.out.println("Bienvenido al registro de libros");
         System.out.println("1- Registrar un libro");
            System.out.println("2- Eliminar ultimo libro registrado");
            System.out.println("3- Consultar ultimo libro registrado");
            System.out.println("4- mostrar todos los libros");
            System.out.println("5- Salir");
            int opt = sc.nextInt();
        switch (opt){
            case 1:
                    m.RegistrarLibro(o, sc);
                    break;
                case 2:
                    m.RetirarUltimo(o, sc);
                    break;
                case 3:
                    m.ConsultarUltimoLibro(o, sc);
                    break;
                case 4:
                    m.MostrarLibros(o);
                    break;
                case 5:
                    cont=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
        }

    }
   }

}