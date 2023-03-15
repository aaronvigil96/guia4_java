/*
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”
*/
package ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       boolean estado = true;
       String nombre, opcion;
       int edad;
       
       while(estado){
           System.out.println("Ingresá el nombre de la persona");
           nombre = entrada.nextLine();
           System.out.println("Ingresá la edad de la persona");
           edad = entrada.nextInt();
           mostrarPersona(nombre, edad);
           System.out.println("¿Quiere seguir agregando persona?");
           System.out.println("S/N");
           entrada.skip("\n");
           opcion = entrada.nextLine();
           switch(opcion){
               case "s": {
                   break;
               }
               case "S": {
                   break;
               }
               case "n": {
                   estado = false;
                   break;
               }
               case "N": {
                   estado = false;
                   break;
               }
           }
       }
    }
    public static void mostrarPersona(String nombre, int edad){
        if(edad < 18){
            System.out.println("-------------------------");
            System.out.println(nombre + " es menor de edad");
            System.out.println("-------------------------");
        }else {
            System.out.println("-------------------------");
            System.out.println(nombre + " es mayor de edad");
            System.out.println("-------------------------");
        }
    }
    
}
