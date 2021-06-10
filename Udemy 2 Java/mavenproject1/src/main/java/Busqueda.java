
import java.util.Scanner;


public class Busqueda {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        
        // Búsqueda secuencial
        // arreglo[] = {3,2,1,5,4}; dato = 2;

       /* 
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;
        
        System.out.println("Digite el dato que quiera buscar: ");
        dato = tcl.nextInt();
        
        
        int i = 0;
        while(i < 5 && band == false){
            if(arreglo[i] == dato){
                band = true;
            }
            ++i;
        }
        
        if(band == false){
            System.out.println("Su número no se encuentra en el array.");
        }
        else {
            System.out.println("Su número si se encuentra en el array.");
            System.out.println("Está en la posición: " + (i - 1));
        }
        */
       
       // Búsqueda Binaria
       
       int arreglo[] = {1, 2, 3, 4, 5};
       int dato, inf, sup, mitad, i;
       boolean band = false;
       System.out.println("Digite el dato que quiera buscar: ");
       dato = tcl.nextInt();
        
       
       inf = 0;
       sup = 5;
       i = 0;
       
       mitad = (inf + sup)/2;
       while(inf <= sup && i < 5){
           if(arreglo[mitad] == dato){
               band = true;
               break;
           }
           if(arreglo[mitad] > dato){
               sup = mitad;
               mitad = (inf + sup)/2;
           }
           if(arreglo[mitad] < dato){
               inf = mitad;
               mitad = (inf + sup)/2;
           }
           i++;
        }
        if(band == true){
            System.out.println("El dato está en la posición: " + mitad);
        }
        else{
            System.out.println("El dato no se encuentra en el arreglo");
        }
       
       
       
       
        
        
        
        
    }
}
