import java.util.Scanner;


public class Arrays {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        /*int[] simbolos = {5, 7, 9, 10};
        
        int[] numeros = new int[3];
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;
        
        for(int i = 0; i < 3; i++){
            System.out.println(numeros[i]);
        }*/
        
        
        /*int nElementos;
        System.out.println("Digita cuántos elementos quieres en el Array: ");
        nElementos = tcl.nextInt();
        
        char[] letras = new char[nElementos];
        
        System.out.println("Digita los elementos del array");
        
        for(int i = 0; i < nElementos; ++i){
            System.out.println((i+1)+ ". " + "Digita un carácter");
            letras[i] = tcl.next().charAt(0);
        }
        
        System.out.println("\nLos caracteres del arreglo son :");
        for(int i = 0; i < nElementos; i++){
            System.out.println(letras[i]);
        }
        */
        
        String[] nombres = {"Alejandro", "Maria", "Luisa", "Juan", "Narcisa", "Luis", "Roberto", "Flor", "Jessica"};
        
        /*for(int i = 0;i < nombres.length; ++i){
            System.out.println(nombres[i]);
            
        }*/
        
        for(String i:nombres){
            System.out.println("Nombre: " + i);
        }
    }
}
