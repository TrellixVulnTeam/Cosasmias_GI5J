import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ordenamientos {
    public static void main(String[] args) {
            Scanner tcl = new Scanner(System.in);
            
            // Metodo burbuja
            /*int arreglo[], nElementos, aux;
                   
            System.out.println("Digite el nº de Elementos de arreglo: ");
            nElementos = tcl.nextInt();
            arreglo = new int[nElementos];
            
            for(int i = 0; i < nElementos; ++i){
                System.out.println((i + 1) + ". Digite un número: ");
                arreglo[i] = tcl.nextInt();
            }
            
            for(int i = 0; i < nElementos - 1; ++i){
                for(int j = 0; j < (nElementos - 1); ++j){
                    if(arreglo[j] > arreglo[j + 1]){ // Si numeroactual > numerosiguiente
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                    }
                }
            }
                
            // Mostrando el arreglo en forma creciente
            System.out.println("Arreglo: ");
            for(int i = 0; i < nElementos; ++i){
                System.out.print(arreglo[i] + " - ");
            }
            System.out.println("\nArreglo ordenado en forma decreciente: ");
            for(int i = (nElementos - 1); i >= 0; --i){
                System.out.print(arreglo[i] + " - "); 
            }*/
            
            
            // Metodo de inserción
            
            
            /*int arreglo[], nElementos, pos = 0, aux = 0;
            
            System.out.println("Digite el nº de Elementos de arreglo: ");
            nElementos = tcl.nextInt();
            arreglo = new int[nElementos];
            
            for(int i = 0; i < nElementos; ++i){
                System.out.println((i + 1) + ". Digite un número: ");
                arreglo[i] = tcl.nextInt();
            }
            
            for(int i = 0; i < nElementos; i++){
                pos = i;
                aux = arreglo[i];
                
                while((pos > 0) && (arreglo[pos - 1] > aux)){
                    arreglo[pos] = arreglo[pos - 1];
                    pos--;
                }
                arreglo[pos] = aux;
            }
            
            
            System.out.println("\nOrden Ascendente");
            for(int i = 0; i < nElementos; i++){
                System.out.print(arreglo[i] + "-");
            }
            System.out.println("\nOrden Descendente");
            for(int i = 0; i < nElementos; i++){
                System.out.print(arreglo[nElementos - 1 -i] + "-");
            }
            */
            
            // Metodo de selección
            
            int arreglo[], nElementos, min, aux;
            
            System.out.println("Digite el nº de Elementos de arreglo: ");
            nElementos = tcl.nextInt();
            arreglo = new int[nElementos];
             
            for(int i = 0; i < nElementos; ++i){
                System.out.print((i + 1) + ". Digite un número: ");
                arreglo[i] = tcl.nextInt();
            }
            
            for(int i = 0; i <nElementos; i++){
                min = i;
                for(int j = i +1; j < nElementos; j++){
                    if(arreglo[j] < arreglo[min]){
                        min = j;
                    }
                }
                aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min]  = aux;
            }
            System.out.println("\nOrden Ascendente");
            for(int i = 0; i < nElementos; i++){
                System.out.print(arreglo[i] + "-");
            }
            System.out.println("\nOrden Descendente");
            for(int i = 0; i < nElementos; i++){
                System.out.print(arreglo[nElementos - 1 -i] + "-");
            }
            
    } 
}
