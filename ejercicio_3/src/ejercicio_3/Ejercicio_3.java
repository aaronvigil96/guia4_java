/*
    Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
    La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
*/
package ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        boolean estado = true;
        int numA, numB, opcion, resultado;
        int contadorMenu = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        while(estado){
            if(contadorMenu == 0){
                System.out.println("Bienvenido a la Calculadora.");
            }else {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("Bienvenido otra vez.");
            }
            contadorMenu = contadorMenu + 1;
            System.out.println("Ingresa un numero");
            numA = entrada.nextInt();
            System.out.println("Ingresa otro numero");
            numB = entrada.nextInt();
            
            System.out.println("¿Que quiere hacer?");
            System.out.println("1)- Sumar");
            System.out.println("2)- Restar");
            System.out.println("3)- Multiplicar");
            System.out.println("4)- Dividir");
            System.out.println("5)- Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: {
                    resultado = sumar(numA, numB);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                }
                case 2: {
                    resultado = resta(numA, numB);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                }
                case 3: {
                    resultado = multiplicacion(numA, numB);
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                }
                case 4: {
                    resultado = dividir(numA, numB);
                    System.out.println("El resultado de la division es: " + resultado);
                    break;
                }
                case 5: {
                    estado = false;
                    break;
                }
            }
        }
        System.out.println("Espero que hayas disfrutado de la calculadora.");
    }
    public static int sumar(int numA,int numB){
        return numA + numB;
    }
 
    public static int resta(int numA,int numB){
        return numA - numB;
    }
    public static int multiplicacion(int numA,int numB){
        return numA * numB;
    }
    public static int dividir(int numA,int numB){
        return numA / numB;
    }
    
}
