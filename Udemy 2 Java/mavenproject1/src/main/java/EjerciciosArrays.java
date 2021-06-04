import java.util.Scanner;

public class EjerciciosArrays {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        
        
        
        // Ejercicio 1
        
        /*int[] numeros = new int[5];
        
        for(int i = 0; i < 5; ++i){
            System.out.println("Escribe un número");
            numeros[i] = tcl.nextInt();
        }
        for(int i = 0; i < 5; ++i){
            System.out.println(numeros[i]);
        }*/
        
        
        // Ejercicio 2
        
        /*int[] numeros = new int[5];
        
        for(int i = 0; i < 5; ++i){
            System.out.println("Escribe un número");
            numeros[i] = tcl.nextInt();
        }
        for(int i = 5; i > 0; --i){
            System.out.println(numeros[i-1]);
        }*/
        
        // Ejercicio 3
        
        /*int contador = 0, median = 0, medias = 0, contn = 0, conts = 0;
        int[] numeros = new int[5];
        
        for(int i = 0; i < 5; ++i){
            System.out.println("Escribe un número");
            numeros[i] = tcl.nextInt();
            if(numeros[i] == 0){
                ++contador;
            } else if(numeros[i] > 0){
                medias += numeros[i];
                ++conts;
            } else {
                median += numeros[i];
                ++contn;
            }
        }
        
        System.out.println("La media positivos es: " + medias/conts);
        System.out.println("La media negativos es: " + median/contn);
        System.out.println("La cantidad de ceros es: " + contador);*/
        
        // Ejercicio 4
        
        /*int[] numeros = new int[10];
        System.out.println("Escriba 10 números");
        for(int i = 0; i < 10; ++i){
            numeros[i] = tcl.nextInt();
        }
        
        for(int i = 0; i < 5; ++i){
            System.out.println(numeros[i]);
            System.out.println(10 - i);
        }*/
        
        
        
        // Ejercicio 5
        
        /*int[] numeros = new int[10];
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[20];
        
        System.out.println("Escriba 10 números");
        for(int i = 0; i < 10; ++i){
            numeros[i] = tcl.nextInt();
        }
        
         System.out.println("Escriba otros 10 números");
        for(int i = 0; i < 10; ++i){
            numeros1[i] = tcl.nextInt();
        }
        
        int j = 0;
        for(int i = 0; i < 10; ++i){
            numeros2[j] = numeros[i];
            ++j;
            numeros2[j] = numeros1[i];
            ++j;
        }
        
        for(int i = 0; i < 20; ++i){
            System.out.println(numeros2[i]);
           
        }*/
        
        
        // Ejercicio 6
        
        
        /*int[] a = new int[12];
        int[] b = new int[12];
        int[] c = new int[24];
        
        System.out.println("Escriba 10 números");
        for(int i = 0; i < 12; ++i){
            a[i] = tcl.nextInt();
        }
        
         System.out.println("Escriba otros 10 números");
        for(int i = 0; i < 12; ++i){
            b[i] = tcl.nextInt();
        }
        
        int j = 0;
        for(int i = 0; i < 12; i += 3){
            c[j] = a[i];
            ++j;
            c[j] = a[i+1];
            ++j;
            c[j] = a[i+2];
            ++j;
            c[j] = b[i];
            ++j;
            c[j] = b[i+1];
            ++j;
            c[j] = b[i+2];
            ++j;            
        }
        
        for(int i = 0; i < 24; ++i){
            System.out.println(c[i]);
           
        }*/
        
        
        
        // Ejercicio 7
        
        /*int[] a = new int[10];
        int contmen = 0;
        int contmay = 0;
        
        System.out.println("Escriba 10 números");
        for(int i = 0; i < 10; ++i){
            a[i] = tcl.nextInt();
        }
        for(int i = 0; i < 9; ++i){
            if(a[i] < a[i + 1]){
                ++contmen;
            }
        }
        
        for(int i = 0; i < 9; ++i){
            if(a[i] > a[i + 1]){
                ++contmay;
            }
        }
        if(contmay == 9){
            System.out.println("Estan ordenados de mayor a menor");
        }
        else if(contmen == 9){
            System.out.println("Estan ordenados de menor a mayor");
        }
        else {
            System.out.println("Estan desordenados");
        }
        */
        
        
        
        
        // Ejercicio 8
        
        
        /*int[] a = new int[10];
        int b;
        int c = 0;
        
        System.out.println("Escriba 10 números: ");
        for(int i = 0; i < 8; ++i){
            a[i] = tcl.nextInt();
        }
        
        System.out.println("Escriba 1 número: ");
            b = tcl.nextInt();
        System.out.println("Y una posicion: ");
            int k = tcl.nextInt();
        
        
        for(int i = k; 0 < (10 -i); ++i){
            a[9-c] = a[8-c];
            ++c;
        }
        
        a[k] = b;
        
        System.out.println("\n");
        for(int i = 0; i < 10; ++i){
            System.out.println(a[i]);
        }
        */
        
        
        
        // Ejercicio 9
        
        /*int[] a = new int[10];
        int c = 0;
        
        System.out.println("Escriba 10 números: ");
        for(int i = 0; i < 10; ++i){
            a[i] = tcl.nextInt();
        }
        c = a[9];
        for(int i = 0; 1 < (10 -i); ++i){
            a[9-i] = a[8-i];
        }
        a[0] = c;
        
        System.out.println("\n");
        for(int i = 0; i < 10; ++i){
            System.out.println(a[i]);
        }
        */
        
        // Ejercicio 10
        
        
        /*int[] a = new int[10];
        int c = 0;
        int n;
        
        System.out.println("Escriba 10 números: ");
        for(int i = 0; i < 10; ++i){
            a[i] = tcl.nextInt();
        }
        
        System.out.println("Escriba cuanto quiere que se desplace: ");
        n = tcl.nextInt();
        
        for(int j = n;0 != j; --j){
            c = a[9];
            for(int i = 0; 1 < (10 -i); ++i){
                a[9-i] = a[8-i];
            }
            a[0] = c;
        }
        
        System.out.println("\n");
        for(int i = 0; i < 10; ++i){
            System.out.println(a[i]);
        }*/
        
        
        
        
        // Ejercicio 11
        
               
        /*int[] a = new int[10];
        boolean crec = true;
        int n, c = 0, sitio = 0;
        
        System.out.println("Escriba 5 números: ");
        do{
            for(int i = 0; i < 5; ++i){
                a[i] = tcl.nextInt();
            }

            for(int i = 1; i < 4; ++i){
                if(a[i] > a[i - 1] && a[i] < a[i +1]){
                    crec = true;
                }   
                else {
                   crec = false;
                   System.out.println("Ordenalos de mayor a menor");
                   break;
                }

            }
            if(crec == true){
                System.out.println("Esta ordenado");
            }
        }while(crec == false);

        System.out.println("Escriba otro número: ");
        n = tcl.nextInt();

        while(c < 5 && a[c] < n){
            ++sitio;
            ++c;
        }
        for(int i = 1; i >= sitio; i--){
            a[i + 1] = a[i];
        }
        
        a[sitio] = n;
        for(int i:a){
            System.out.println(a[i]);
        }*/
    
            
    
    }
        
   
}
