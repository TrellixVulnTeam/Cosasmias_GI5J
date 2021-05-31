import java.util.Scanner;

public class EjercicioCiclos {
 
    public static void main(String[] args) {
        
        
        Scanner tcl = new Scanner(System.in);
        
        
        
        // Ejercicio 1
        
        /*double numero;
        System.out.println("Introduzca un número: ");
        numero = tcl.nextDouble();
        
        while(numero >= 0){
        System.out.println(Math.pow(numero, 2));
        System.out.println("Introduzca un número: ");
        numero = tcl.nextDouble();
        };*/
        
        //Ejercicio 2
        
        
        /*int numero;
         
        System.out.println("Escriba un numero: ");
        numero = tcl.nextInt();
        
        while(numero != 0){
            if(numero > 0){
                System.out.println("El número es positivo.");
            }
            else{
                System.out.println("El número es negativo.");
            }
            System.out.println("Escriba otro número");
            numero = tcl.nextInt();
        }*/
        
        // Ejercicio 3
        
        /*int numero;
        
        System.out.println("Escriba un número: ");
        numero = tcl.nextInt();
        
        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El número es par");
            }
            else{
                System.out.println("el número es impar");
            }
            System.out.println("Escriba otro número");
            numero = tcl.nextInt();
        }*/
        
        
        // Ejercicio 4
        
        
        /*int numero, i = 0;
        
        System.out.println("Escriba un número: ");
        numero = tcl.nextInt();
        
        
        while(numero >= 0){
            ++i;
            System.out.println("Escriba otro número: ");
            numero = tcl.nextInt();
        }
        System.out.println(i);
        */
        
        
        // Ejercicio 5
        
        /*int numero, numeroU;
        int intentos = 0;
        
        numero = (int)(Math.random()*100);
        
        System.out.println("Escriba un número: ");
        numeroU = tcl.nextInt();
        
        while(numeroU != numero){
            ++intentos;
            if(numeroU > numero){
                System.out.println("Prueba con un número más bajo");
            }
            else{
                System.out.println("Prueba con un número más alto");
            }
            
            numeroU = tcl.nextInt();
        }
        
        System.out.println("Has acertado, el número era: " + numero);
        System.out.println("Intentos: " + intentos);
        */
        
        
        // Ejercicio 6
        
        
        /*int numero, suma = 0;
        
        System.out.println("Escriba un número: ");
        numero = tcl.nextInt();
        
        while(numero != 0){
            suma += numero;
            System.out.println("Escriba otro número: ");
            numero = tcl.nextInt();
        }
        
        System.out.println(suma);
        */
        
        //Ejercicio 7
        
        /*int  numero, media = 0,suma = 0, i = 0;
        
        System.out.println("Escriba un número");
        numero = tcl.nextInt();
        
        while(numero >= 0){
            ++i;
            suma += numero;
            System.out.println("Esciba otro númreo: ");
            numero = tcl.nextInt();
        }
        
        if(i > 0){
        media = suma / i;
        System.out.println(suma + "/" + i);
        System.out.println("Esta es la media: " + media);
        
        }
        else{
            System.out.println("Escribe algún número");
        }*/
        
        // Ejercicio 8
        
        /*int numero,contador = 0;
        
        System.out.println("Escriba un número");
        numero = tcl.nextInt();
        
        while(contador != numero){
            contador++;
            System.out.println(contador);
        }*/
        
        
        // Ejercicio 9 
        
        /*int i;
         
        for(i = 100; i > 0; i -= 7){
            System.out.println(i);
        }*/
        
        // Ejercicio 10
        
        /*int numero = 0, suma = 0;
        
        for(int contador = 0; contador < 10; ++contador){
            System.out.println("Escriba un número: ");
            numero = tcl.nextInt();
            suma += numero;
        }
        System.out.println(suma);
        */        
        
    }
}
