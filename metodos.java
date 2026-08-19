public class metodos{
    public int [][] LLenarMatrizEntera (int [][]m){
        for ( int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                m[i][j] = (int)(Math.random()*50+1);
            }
            
        }
        return m;
    }

    public void  MostrarMatrizEntera (int [][]m){
        for ( int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                System.out.print(m[i][j] + " -");
            }
            System.out.println();
        }
    }
    public void DiagonalMatrizEntera (int [][]m){
        for ( int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                if (i == j){
                    System.out.print(m[i][j] + "-");
                }else{
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
public ObjMatriz [][] LLenarMatrizObjeto (ObjMatriz [][]m){
        for ( int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                m[i][j] = new ObjMatriz((int)(Math.random()*50+1));
            }
            
        }
        return m;
    }
    public void  MostrarMatrizObjeto (ObjMatriz [][]m){
        for ( int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                System.out.print(m[i][j].getDato() + " -");
            }
            System.out.println();
        }
    }
}
