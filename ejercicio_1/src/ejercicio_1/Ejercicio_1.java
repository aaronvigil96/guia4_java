/*
    Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
    y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
    Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
    Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
    La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        boolean estado = true;
        int opcion;
        String pregunta, frase, fraseEncriptada;
        Scanner entrada = new Scanner(System.in);
        while(estado){
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Ingresar un caracter/frase");
            System.out.println("2)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    entrada.skip("\n");
                    System.out.println("Ingresa un caracter/frase: ");
                    frase = entrada.nextLine();
                    fraseEncriptada = encriptador(frase);
                    System.out.println("-------------------------------------------");
                    System.out.println("La frase encriptada es: " + fraseEncriptada);
                    System.out.println("-------------------------------------------");
                    break;
                }
                case 2: {
                    System.out.println("¿Está seguro que quiere salir? S/N");
                    pregunta = entrada.next();
                    if(pregunta.equals("S")){
                        estado = false;
                    }
                    break;
                }
            }
        }
        
    }
    public static String encriptador(String letras){
        String letra;
        String fraseEncriptada = "";
        for (int i = 0; i < letras.length(); i++) {
            letra = letras.substring(i, i + 1);
            switch(letra){
                case "a": {
                    letra = "@";
                    break;
                }
                case "e": {
                    letra = "#";
                    break;
                }
                case "i": {
                    letra = "$";
                    break;
                }
                case "o": {
                    letra = "%";
                    break;
                }
                case "u": {
                    letra = "*";
                    break;
                }
            }
            fraseEncriptada = fraseEncriptada.concat(letra);
        }
        return fraseEncriptada;
    }
}
