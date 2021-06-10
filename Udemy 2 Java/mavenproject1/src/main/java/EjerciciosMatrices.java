import  java.util.Scanner;
import javax.swing.JOptionPane;


public class EjerciciosMatrices {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        
        // Ejercicio 1
        
        /*int matriz[][], nFilas, nCol;
        boolean simetrica = true;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de columnas: "));
        
        matriz = new int[nFilas][nCol];

        
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nCol; j++){
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matriz[i][j] = tcl.nextInt(); 
            }
        } 
        System.out.println("La matriz es: ");
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nCol; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        
        if(nFilas == nCol){
            System.out.println("La matriz es cuadrada ");
            int i, j;
            i = 0;
            while(i < nFilas && simetrica == true){
                j = 0;
                while(j < i && simetrica == true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            
            if(simetrica == true){
                System.out.println("y simétrica.");
            }
            else{
                System.out.println("pero no simétrica.");
            }
        }
        else{
            System.out.println("La matriz no es cuadrada ni simétrica.");
        }*/
        
        // Ejercicio 2 y 3
        
        
        
        /*int matriza[][], matrizb[][],matrizc[][], nFilasa, nCola, nFilasb, nColb;
        boolean cuadrada = false;
        
        nFilasa = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de filas: "));
        nCola = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de columnas: "));       
        matriza = new int[nFilasa][nCola];
 
        JOptionPane.showMessageDialog(null, "Define los elementos de la matriz A: ");
        for(int i = 0; i < nFilasa; i++){
            for(int j = 0; j < nCola; j++){
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matriza[i][j] = tcl.nextInt(); 
            }
        } 
        
        nFilasb = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de filas: "));
        nColb = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de columnas: "));
        
        matrizb = new int[nFilasb][nColb];
        
        JOptionPane.showMessageDialog(null, "Define los elementos de la matriz B: ");
        for(int i = 0; i < nFilasb; i++){
            for(int j = 0; j < nColb; j++){
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matrizb[i][j] = tcl.nextInt(); 
            }
        } 
        
        matrizc = new int[nFilasb][nColb];
        
        if(nFilasa == nFilasb && nCola == nColb){
            cuadrada = true;
            if(cuadrada == true){
                for(int i = 0; i < (nFilasa); i++){
                    for(int j = 0; j < (nCola); j++){
                        matrizc[i][j] = matriza[i][j] + matrizb[i][j];
                    }
                }
            }         
        }
        else{
            System.out.println("Las matrices no se pueden sumar.");
        }
        
        System.out.println("La matriz es: ");
        for(int i = 0;i < nFilasb; i++){ // Nº de filas
            for(int j = 0; j < nColb; j++){ // Nº de columnas
                System.out.print(matrizc[i][j] + "");
            }
            System.out.println("");
        }
        
        
        System.out.println("La matriz Ct es: ");
        for(int i = 0;i < nFilasb; i++){ // Nº de filas
            for(int j = 0; j < nColb; j++){ // Nº de columnas
                System.out.print(matrizc[j][i] + "");
            }
            System.out.println("");
        }*/
        
        
        // Ejercicio 4
        
        
        int matriz[][];
        
        matriz = new int[7][7];
        
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("La matriz es: ");
        for(int i = 0;i < 7; i++){
            for(int j = 0;j < 7; j++){
                System.out.print(matriz[i][j] + "");
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
