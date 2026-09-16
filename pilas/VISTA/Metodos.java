package VISTA;

import java.util.Scanner;
import java.util.Stack;

import MODELO.ObjLibro;

public class Metodos{
    public Stack<ObjLibro> RegistrarLibro(Stack<ObjLibro> o, Scanner sc ){
        boolean cont = true; 
        while (cont) {
            ObjLibro l = new ObjLibro();
            sc.nextLine();
            System.out.println("ingrese el ISBN del libro: ");
            l.setIsbn(sc.nextLine());
            System.out.println("Ingrese el titulo del libro: ");
            l.setTitulo(sc.nextLine());
            System.out.println("Ingrese el Nombre del autor de libro");
            l.setAutor(sc.nextLine());
            System.out.println("Ingrese el año de la publicación");
            l.setAñoPublicacion(sc.nextLine());
            sc.nextLine();

            o.push(l);
            System.out.println("Desea ingresar otro libro: 1) si 2) no");

            int opt = sc.nextInt();
            if (opt == 2) {
                cont = false;
                
            }
        }
         return o;
    }
    public Stack<ObjLibro> RetirarUltimo(Stack<ObjLibro> o, Scanner sc ){
        if (!o.isEmpty()){
            ObjLibro l = o.pop(); 
            System.out.println("Eliminacione exitosa, estos son los tributos que eliminamos");
            System.out.println("EL ISBN es: " + l.getIsbn());
            System.out.println("EL Titulo era: " + l.getTitulo());
            System.out.println("EL Autor era: " + l.getAutor());
            System.out.println("año que fue publica: " + l.getAñoPublicacion());

        }else{
            System.out.println("No hay libros registrados");
        }
        return o;
    }
    public Stack<ObjLibro> ConsultarUltimoLibro(Stack<ObjLibro> o, Scanner sc ){
        if (!o.isEmpty()) {
            ObjLibro l = o.peek();
            System.out.println("EL ultimo libro registrado es: " + l.getTitulo());
            System.out.println("con el ISBN :" + l.getIsbn() + " de " + l.getAutor() + " publicado en " + l.getAñoPublicacion());
        }
        return o;
    }
    public Stack<ObjLibro> MostrarLibros(Stack<ObjLibro> o, Scanner sc ){
         Stack<ObjLibro> aux = new Stack<>();
    System.out.println("\n=== LISTADO DE LIBROS EN LA PILA ===");

    // 3. Vaciamos la pila original mostrando los datos y guardándolos en la auxiliar
    while (!o.isEmpty()) {
        ObjLibro l = o.pop(); // Sacamos el libro de la cima
        
        System.out.println("----------------------------------------");
        System.out.println("ISBN: " + l.getIsbn());
        System.out.println("Título: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Año: " + l.getAñoPublicacion());
        
        aux.push(l); // Lo guardamos temporalmente en la pila auxiliar
    }
    System.out.println("----------------------------------------\n");

    // 4. Devolvemos los libros a la pila original para no perder la información
    while (!aux.isEmpty()) {
        o.push(aux.pop());
    }
        return o;
    }


}