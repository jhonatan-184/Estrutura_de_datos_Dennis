import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjComidaRapida[][] LLenarRegistros(int n) {
        int id = 1;
         Scanner sc = new Scanner(System.in);
        ObjComidaRapida[][] ventas = new ObjComidaRapida[n][n];

        for (int i = 0; i < ventas.length; i++) { // para las filas
            for (int j = 0; j < ventas.length; j++) { // para las columnas
                ObjComidaRapida o = new ObjComidaRapida();
                Metodos m = new Metodos();
                o.setIdPedido(id);
                id++;
                int opt = m.OpcionesMenuComida();
                switch (opt) {
                    case 1:
                        o.setDescipcion("Perro");
                        break;
                    case 2:
                        o.setDescipcion("Salchipapa");
                        break;
                    case 3:
                        o.setDescipcion("Hamburgesa");
                        break;
                    case 4:
                        o.setDescipcion("Perra");
                        break;

                    default:
                        System.out.println("Esa opción no existe ");
                        break;
                }
                System.out.println("Ingrese la cantidad a llevar");
                o.setCantidad(sc.nextInt());
                System.out.println("Ingrese el precio");
                o.setPrecio(sc.nextDouble());
                o.setTotalPagar(o.getCantidad() * o.getPrecio());
                o.setEstadoPedido(0);
                ventas[i][j] = o;

            }
        }

        return ventas;

    }

    public void MostrarTurnosPendientes(ObjComidaRapida[][] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j].getEstadoPedido() == 0) {
                    System.out.println("Turno es:  " + ventas[i][j].getIdPedido());
                    System.out.println("Descripcion del Pedido " + ventas[i][j].getDescipcion());
                    System.out.println("Para una cantidad de: " + ventas[i][j].getCantidad());
                    System.out.println("Precio por unidad " + ventas[i][j].getPrecio());
                    System.out.println("Total a Pagar " + ventas[i][j].getTotalPagar());
                    System.out.println("-------------------------------------------------");

                }
                System.out.println();
            }
        }

    }

    public void MostrarTurnosDespachados(ObjComidaRapida[][] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j].getEstadoPedido() == 1) {
                    System.out.println("Turno es:  " + ventas[i][j].getIdPedido());
                    System.out.println("Descripcion del Pedido " + ventas[i][j].getDescipcion());
                    System.out.println("Para una cantidad de: " + ventas[i][j].getCantidad());
                    System.out.println("Precio por unidad " + ventas[i][j].getPrecio());
                    System.out.println("Total a Pagar " + ventas[i][j].getTotalPagar());
                    System.out.println("-------------------------------------------------");

                }
                System.out.println();
            }
        }

    }

    public ObjComidaRapida[][] Despachar(ObjComidaRapida[][] ventas) {
        System.out.println("Ingrese el turno a despachar");
        int turno = sc.nextInt();
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j].getIdPedido() == turno)

                {
                    ventas[i][j].setEstadoPedido(1);
                }
            }
        }
        return ventas;
    }

    public int OpcionesMenuPrincipal() {
        System.out.println("Bienvenidos a la comida rapida de estructuras de datos");
        System.out.println("Que desea realizar");
        System.out.println("1) Ingresar Pedidos");
        System.out.println("2) Mostrar Pedidos pendientes por despacho");
        System.out.println("3) Mostrar pedidos despachados");
        System.out.println("4) Despachar Pedido");
        System.out.println("5) salir");
        return sc.nextInt();
    }

    public int OpcionesMenuComida() {
        System.out.println("seleccione el pedido de su interes");
        System.out.println("1) Perro");
        System.out.println("2) Salchipapa");
        System.out.println("3) Hamburgesa");
        System.out.println("4) Perra");
        return sc.nextInt();
    }
    




    Scanner sc = new Scanner(System.in);

    public Almacen2[][] LLenarRegistros(int n) {
        int id = 1;
         Scanner sc = new Scanner(System.in);
        Almacen2[][] ventas = new Almacen2[n][n];

        for (int i = 0; i < ventas.length; i++) { // para las filas
            for (int j = 0; j < ventas.length; j++) { // para las columnas
                Almacen2 o = new Almacen2();
                Metodos A = new Metodos();
                o.setIdPedido(id);
                id++;
                int opt = o.OpcionesMenuComida();
                switch (opt) {
                    case 1:
                        o.setDescipcion("bulto de papas");
                        break;
                    case 2:
                        o.setDescipcion("Salchipapa");
                        break;
                    case 3:
                        o.setDescipcion("salchichon manguera");
                        break;
                    case 4:
                        o.setDescipcion("pollo");
                        break;

                    default:
                        System.out.println("Esa opción no existe ");
                        break;
                }
                System.out.println("Ingrese la cantidad a llevar");
                o.setCantidad(sc.nextInt());
                System.out.println("Ingrese el precio");
                o.setPrecio(sc.nextDouble());
                o.setTotalPagar(o.getCantidad() * o.getPrecio());
                o.setEstadoPedido(0);
                ventas[i][j] = o;

            }
        }

        return ventas;

    }

    public void MostrarTurnosPendientes(Almacen2[][] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j].getEstadoPedido() == 0) {
                    System.out.println("Turno es:  " + ventas[i][j].getIdPedido());
                    System.out.println("Descripcion del Pedido " + ventas[i][j].getDescipcion());
                    System.out.println("Para una cantidad de: " + ventas[i][j].getCantidad());
                    System.out.println("Precio por unidad " + ventas[i][j].getPrecio());
                    System.out.println("Total a Pagar " + ventas[i][j].getTotalPagar());
                    System.out.println("-------------------------------------------------");

                }
                System.out.println();
            }
        }

    }

    public void MostrarTurnosDespachados(Almacen2[][] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j].getEstadoPedido() == 1) {
                    System.out.println("Turno es:  " + ventas[i][j].getIdPedido());
                    System.out.println("Descripcion del Pedido " + ventas[i][j].getDescipcion());
                    System.out.println("Para una cantidad de: " + ventas[i][j].getCantidad());
                    System.out.println("Precio por unidad " + ventas[i][j].getPrecio());
                    System.out.println("Total a Pagar " + ventas[i][j].getTotalPagar());
                    System.out.println("-------------------------------------------------");

                }
                System.out.println();
            }
        }

    }



    public int OpcionesMenuPrincipal() {
        System.out.println("Bienvenidos a la comida rapida de estructuras de datos");
        System.out.println("Que desea realizar");
        System.out.println("1) Ingresar Pedidos");
        System.out.println("2) Mostrar Pedidos pendientes por despacho");
        System.out.println("3) Mostrar pedidos despachados");
        System.out.println("4) Despachar Pedido");
        System.out.println("5) salir");
        return sc.nextInt();
    }

    public int OpcionesMenuComida() {
        System.out.println("seleccione el pedido de su interes");
        System.out.println("1) Perro");
        System.out.println("2) Salchipapa");
        System.out.println("3) Hamburgesa");
        System.out.println("4) Perra");
        return sc.nextInt();
    }
    public boolean compararMatricesObjcomidaRapidaYAlmacen2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matrix");
        int n = sc.nextInt();
        ObjComidaRapida[][] ventas1 = new ObjComidaRapida[n][n];
        Almacen2[][] ventas2 = new Almacen2[n][n];
        Metodos m = new Metodos();
        boolean continuar = true;
        while (continuar) {
            int opt = m.OpcionesMenuPrincipal();
            switch (opt) {
                case 1:
                    ventas1 = m.LLenarRegistros(n);
                    ventas2 = m.LLenarRegistros(n);
                    break;
                case 2:
                    System.out.println("se muestran a continuacion los turnos pendiente");
                    m.MostrarTurnosPendientes(ventas1);
                    m.MostrarTurnosPendientes(ventas2);
                    break;
                case 3:
                    System.out.println("los pedidos despachgados son:");
                    m.MostrarTurnosDespachados(ventas1);
                    m.MostrarTurnosDespachados(ventas2);
                    break;
                case 4:
                    ventas1 = m.Despachar(ventas1);
                    ventas2 = m.Despachar(ventas2);
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
        return true;


    }


}
