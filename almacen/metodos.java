public class metodos {
    public ObjAlmacen[][] llenarAlmacen(ObjAlmacen[][] a,Scanner sc){ {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el precio del producto: ");
                double precio = sc.nextDouble();
                sc.nextLine(); // Limpiar el buffer
                System.out.println("Ingrese el stock del producto: ");
                int cantidad = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
                Objalmacen o =new ObjAlmacen(nombre, precio,stock);
                a[i][j] = o;
            }
        }
        return a;
    }
    for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("El nombre del producto es: " + a[i][j].getNombre());
                System.out.println("El precio del producto es: " + a[i][j].getPrecio());
                System.out.println("El stock del producto es: " + a[i][j].getStock());

            }
        }
}