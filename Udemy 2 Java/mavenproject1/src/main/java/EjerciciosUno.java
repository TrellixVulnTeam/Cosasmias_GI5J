import  java.util.Scanner;

public class EjerciciosUno {
    
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        // Ejercicio 1
        /*float numero1, numero2, numero3;
        

        System.out.println("Introduce tres numeros: ");
        numero1 = tcl.nextFloat();
        numero2 = tcl.nextFloat();
        numero3 = tcl.nextFloat();

        Float resultado = numero1 + numero2 + numero3;
    
        System.out.println(resultado);*/
        
        // Ejercicio 2
        /*float salariosem, horas, salarioh;
        
        System.out.println("Introduce tus horas semanales: ");
        horas = tcl.nextFloat();
        System.out.println("Introduce tu salario por hora: ");
        salarioh = tcl.nextFloat();
        
        salariosem = horas * salarioh;
        System.out.println(salariosem);*/
        
        // Ejercicio 3
        
        /*float dolarg, dolarl, dolarj, dolart;
        
        System.out.println("Cuanto dinero tiene Guillermo?");
        dolarg = tcl.nextFloat();
        dolarl = dolarg/2;
        dolarj = (dolarg + dolarl)/2;
        
        dolart = dolarg + dolarl + dolarj;
        System.out.println(dolart);*/
        
        //Ejercicio 4
        
        /*float salariom = 1000, comision = 150,valorCoche, salariomt;
        int n;
        
        System.out.println("Teclee cuantos coches ha vendido");
        n = tcl.nextInt();
        
        System.out.println("Teclee cuantovale el coche");
        valorCoche = tcl.nextFloat();
        
        
        salariomt = salariom + comision*n + 0.05f* valorCoche*n;
        
        System.out.println(salariomt);*/
        
        
        // Ejercicio 5
        
        /*float participacion, pp, sp, ef, nf;
        
        System.out.println("Digite la participación: ");
        participacion = tcl.nextFloat();
                
        System.out.println("Digite el primer parcial: ");
        pp = tcl.nextFloat();
                
        System.out.println("Digite el segundo parcial: ");
        sp = tcl.nextFloat();
        
        System.out.println("Digite el examen final: ");
        ef = tcl.nextFloat();
        
        participacion *= 0.1;
        pp *= 0.25;
        sp *= 0.25;
        ef *= 0.4;
       
        nf = participacion + pp  + sp + ef;
        System.out.println(nf);*/
        
        // Ejercicio 6
        
        /*float a, b, total;
        
        System.out.println("Digite a y b: ");
        a = tcl.nextFloat();
        b = tcl.nextFloat();
        
        total = (float)Math.pow(a, 2) + (float)Math.pow(b, 2) + 2 * a * b;
        System.out.println(total);*/
        
        // Ejercicio 7
        
        /*int horas, semanas, dias, horasf;
        
        System.out.println("Digite las horas totales: ");
        horas = tcl.nextInt();
        
        semanas = horas / (24 * 7);
        dias = (horas % (24 * 7))/24;
        horasf = (horas % (24 * 7) % 24);
        System.out.println("Son : " + semanas + "semanas," + dias + "dias," + horasf + "horas");*/
        
        // Ejercicio 8
        
        
        double a, b, c, r1, r2;
        System.out.println("Digite a, b y c: ");
        a = tcl.nextDouble();
        b = tcl.nextDouble();
        c = tcl.nextDouble();
        
        r1= (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/2 * a;
        r2= (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/2 * a;
        System.out.println("Raiz 1(+): " + r1);
        System.out.println("Raiz 2(-): " + r2);
        
        
        
    }
}
