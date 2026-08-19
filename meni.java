public static void main(String[] args) {
    boolean continuar  = true;
    int n = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println(x:"Ingrese el tamaño de la matriz");
    n = sc.nextInt();
    metodos m = new metodos();
    int [][] matrizEntera = new int[n][n];
    ObjMatriz [][] matrizObjeto = new ObjMatriz[n][n];
    while (continuar){
        System.out.println("1. Llenar Matriz Entera");
        System.out.println("2. Mostrar Matriz Entera");
        System.out.println("3. mostrar diagonal de la matriz entera");
        System.out.println("4. Llenar Matriz Objeto");
        System.out.println("5. Mostrar Matriz Objeto");
        System.out.println("6. Salir");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                matrizEntera = m.LLenarMatrizEntera(matrizEntera);
                break;
            case 2:
                m.MostrarMatrizEntera(matrizEntera);
                break;
            case 3:
                m.DiagonalMatrizEntera(matrizEntera);
                break;
            case 4:
                matrizObjeto = m.LLenarMatrizObjeto(matrizObjeto);
                break;
            case 5:
                m.MostrarMatrizObjeto(matrizObjeto);
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
