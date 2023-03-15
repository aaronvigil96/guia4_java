/*
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
    validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
    sino informe que no lo son.
*/
package ejercicio_2;
import java.util.Scanner;


public class Ejercicio_2 {
    public static void main(String[] args) {
        int numA, numB, opcion;
        boolean estado = true;
        
        Scanner entrada = new Scanner(System.in);
        
        while(estado){
            System.out.println("¿Que quiere hacer?");
            System.out.println("1)- Calcular si el primer numero es multiplo del segundo");
            System.out.println("2)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
            case 1: {
                System.out.println("Ingresá el primer numero");
                numA = entrada.nextInt();
                System.out.println("Ingresá el segundo numero");
                numB = entrada.nextInt();
                multiplo(numA, numB);
                break;
            }
            case 2: {
                estado = false;
                break;
            }
            }
        }
    }
    public static void multiplo(int numA,int numB){
        int resultado = numA % numB;
        if(resultado == 0){
            System.out.println(numA + " SI es multiplo de " + numB);
        }else {
            System.out.println(numA + " NO es multiplo de " + numB);
        }
    }
}
