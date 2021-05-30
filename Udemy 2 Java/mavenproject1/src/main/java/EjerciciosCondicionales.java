import java.util.Scanner;
public class EjerciciosCondicionales {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        
        
        
        // Ejercicio 1
        
        /*double numero;
        System.out.println("Digita un numero: "); 
        numero = tcl.nextDouble();
        
        
        if (numero % 10 == 0){
            System.out.println("Es multiplo de 10");
        }
        else {
            System.out.println("No es multiplo de 10");
        }*/
               
        
        
        
        // Ejercicio 2
        
        
        /*double numero1, numero2;
        
        System.out.println("Digita dos números: ");
        numero1 = tcl.nextDouble();
        numero2 = tcl.nextDouble();
        
        if (numero1 > numero2){
            System.out.println("El primer numero es mayor que el segundo");
        }
        else if(numero2 > numero1){
            System.out.println("El segundo numero es mayor que el primero");
        }
        else{
            System.out.println("Son iguales");
        }*/
        
        // Ejercicio 3
        
        
        /*char letra;
        
        System.out.println("Escribe una letra: ");
        letra = tcl.next().charAt(0);
        
        if (Character.isUpperCase(letra)){
            System.out.println("Es mayúscula");
        } 
        else{
            System.out.println("Es minuscula");
        }*/
        
        // Ejercicio 4
        
        /*double compra;
        
        System.out.println("Escriba el precio de la compra");
        compra = tcl.nextDouble();
        
        if (compra > 300){
            compra -= compra * 0.2;
            System.out.println("El precio es: " + compra);
        }
        else {
            System.out.println("El precio es: " + compra);
        }*/
        
        // Ejercicio 5
        
        /*double salariosem;
        int horas;
        
        System.out.println("Cuantas horas has trabajado esta semana?");
        horas = tcl.nextInt();
        
        if (horas <= 40){
            
            salariosem =  16 * horas;
        }
        else {
            salariosem = 40 * 16 + (horas-40) * 20;
        }
        
        System.out.println("Tu sueldo de esta semana es: " + salariosem);*/
        
        // Ejercicio 6
        
        /*double numero1, numero2;
        
        System.out.println("Digita dos numeros: ");
        numero1 = tcl.nextDouble();
        numero2 = tcl.nextDouble();
        
        if ((numero1 % 2 == 0) && (numero2 % 2 == 0)){
            System.out.println("Los dos son pares");
        }
        else if ((numero1 % 2 != 0 && numero2 != 0)){
            System.out.println("Los dos son impares");
        } 
        else if ((numero1 % 2 == 0) && (numero2 % 2 != 0)){
            System.out.println("El primero es par y el segundo es impar");
        }
        else {
            System.out.println("Los dos son impares");               
        }*/
        
        
        // Ejercicio 7 caca
        
        // Ejercicio 8
        
        /*int numero;
        
        System.out.println("Digita un numero entre 0 y 99.999");
        numero = tcl.nextInt();
        
        otro de muchos ifs
        */
        
        // Ejercicio 9
        
        /*int mes, dia, año;
        
        System.out.println("Dime el dia, el mes y el año: \n");
        dia = tcl.nextInt();
        mes = tcl.nextInt();
        año = tcl.nextInt();
        switch(mes){
            case 1,3,5,7,8,10,12:   if(dia > 31){
                                        System.out.println("Es falso, dia incorrecto");
                                    } 
                                    else if (año == 0 ){
                                        System.out.println("Año incorrecto");
                                    }                             
                                    else{
                                        System.out.println("Es correcto");
                                    }
                                    break;
            case 4,6,9,11:  if (dia > 30){
                                System.out.println("Es falso, dia incorrecto");
                            }
                            else if (año == 0 ){
                                System.out.println("Año incorrecto");
                            } 
                            else{
                                System.out.println("Es correcto");
                            } 
                            break;
            case 2: if (dia > 28){
                        System.out.println("Es falso, dia incorrecto");
                    } 
                    else if (año == 0 ){
                        System.out.println("Año incorrecto");
                    } 
                    else{
                        System.out.println("Es correcto");
                    }
            default:System.out.println("Es falso, mes inconrrecto");
                    break; 
        }*/
    
        
        // Ejercicio 10
        
        
        
    
        
    
        
    }
}