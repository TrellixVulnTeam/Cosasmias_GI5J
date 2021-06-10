
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Matrices {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        
        // Introducción de matriz manual
        
        /*int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i = 0;i < 3; i++){ // Nº de filas
            for(int j = 0; j < 3; j++){ // Nº de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }*/
        
        int matriz[][], nFilas, nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el nº de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el nº de columnas: "));
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite la matriz: ");
        for(int i= 0;i < nFilas; i++){
            for(int j = 0; j < nCol; j++){
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        System.out.println("La matriz es: ");
        for(int i = 0;i < nFilas; i++){ // Nº de filas
            for(int j = 0; j < nCol; j++){ // Nº de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}
