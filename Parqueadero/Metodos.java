import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Objvehiculos[][] LLenarRegistros(int n) {
        int id = 1;
         Scanner sc = new Scanner(System.in);
        Objvehiculos[][] Registro = new Objvehiculos[n][n];

        for (int i = 0; i < registro.length; i++) {
            for (int j = 0; j < registro[i].length; j++) {
                Objvehiculos V = new Objvehiculos();
                Metodos m = new Metodos();
                V.setPlaca(m.ingresarPlaca(id));
                V.setVehiculo(m.ingresarVehiculo(id));
                V.setPlan_pago(m.ingresarPlanPago(id));
                V.setNompropietatario(m.ingresarNombrePropietario(id));
                V.setIdpropietario(m.ingresarIdPropietario(id));
                V.setValorplan(m.ingresarValorPlan(id));
                System.out.println("Ingrese el vehículo carro o moto " + id);
                String vehiculo = sc.nextLine();
                System.out.println("Ingrese la placa " + id);
                String placa = sc.nextLine();
                System.out.println("Ingrese el plan de pago mensual, quincenal o semestral " + id);
                String plan_pago = sc.nextLine();
                System.out.println("Ingrese el nombre del propietario " + id);
                String nompropietatario = sc.nextLine();
                System.out.println("Ingrese el ID del propietario " + id);
                int idpropietario = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea
                System.out.println("Ingrese el valor del plan " + id);
                int valorplan = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea

                Registro[i][j] = new Objvehiculos(vehiculo, placa, plan_pago, nompropietatario, idpropietario, valorplan);
                id++;
            }
            System.out.println("Ingrese porcentage de descuento " + (i + 1) + ":");
            V.setTiempo(sc.nextInt());
                V.setDescuento(sc.nextDouble());
                V.setTotalPagar(V.getCantidad() * V.getPrecio());
                V.setValorportiempo(V.getTiempo() * V.getDescuento());
                ventas[i][j] = V;
        }
        return Registro;
    }