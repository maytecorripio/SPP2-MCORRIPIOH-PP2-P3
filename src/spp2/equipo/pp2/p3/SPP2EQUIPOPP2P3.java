/*
Orianna Linette Virgen Mar       A01411515
María Teresa Corripio Herrera  A01410393
Rafael Alejandro Cisneros Gual A01410038
Leticia Vianey Narváez Reyes     A01410432
Ana Martha Alanis Cortaza        A01411418
 */
package spp2.equipo.pp2.p3;
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2EQUIPOPP2P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al programa#3 que imprime * de acuerdo a las dimensiones y contenido del arreglo. ");
        matriz();
    }
    public static void matriz(){
        int m,n;
        
        System.out.println("Introduzca las dimensiones de la matriz");
        m=solicitaTamaño("valor deseado para el número de filas");
        n=solicitaTamaño("valor deseado para el número de columnas");
        System.out.println("\nValores de la matriz: \n");
        int[][]arreglo=solicitaValores(m,n);
        System.out.println("\nCadena de caracteres *:");
        for (int i = 0; i < arreglo.length; i++){
            System.out.println();
            for (int j = 0; j < arreglo[0].length; j++){
                for(int k=1;k<=arreglo[i][j];k++){
                    System.out.print("*");
                }
                if(!(j==(arreglo[0].length-1)))System.out.print(" - ");
            }
            System.out.print("\n");
        }
        
        }
        public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("Lo que introdujo no es un entero, Inténtalo de nuevo");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        
        return n;
        }
        public static int[][] solicitaValores(int m, int n){
            int[][] arreglo = new int [m][n];
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    System.out.println("Introduzca el valor para "+i+", "+j);
                    arreglo [i][j]=solicitaEntero();
                }    
            }

            return arreglo;
        }
    
    
        public static int solicitaTamaño(String dimension){
            int x;
            boolean flag;
            System.out.println("Valor del "+dimension);
            do{
                x=solicitaEntero();
                flag=true;
                if(x<1){
                    System.out.println("Favor de introducir un valor entero positiv)");
                    flag=false;
                }
            }while(flag==false);

            return x; 
}
}