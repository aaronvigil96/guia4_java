/*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a 
    dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
    este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
*   0.86 libras es un 1 €
*   1.28611 $ es un 1 €
*   129.852 yenes es un 1 €

*/
package ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bucle = true;
        int opcion, euro, moneda;
        String nombreMoneda;
        while(bucle){
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Conversión de moneda");
            System.out.println("2)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println("Ingresá la cantidad de euros");
                    euro = entrada.nextInt();
                    if(euro > 1){
                        System.out.println("¿A que moneda quiere convertir los: " + euro + " euros?.");
                    }else {
                        System.out.println("¿A que moneda quiere convertir el: " + euro + " euro.");
                    }
                    System.out.println("1)- libras");
                    System.out.println("2)- pesos");
                    System.out.println("3)- yenes");
                    moneda = entrada.nextInt();
                    
                    switch(moneda){
                        case 1: {
                            nombreMoneda = "libras";
                            convertirMoneda(euro, nombreMoneda);
                            break;
                        }
                        case 2: {
                            nombreMoneda = "pesos";
                            convertirMoneda(euro, nombreMoneda);
                            break;
                        }
                        case 3: {
                            nombreMoneda = "yenes";
                            convertirMoneda(euro, nombreMoneda);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    bucle = false;
                    break;
                }
            }
        }
    }
    
    public static void convertirMoneda(int euro, String moneda){
        double tipoMoneda = 0;
        if(moneda.equals("libras")){
            tipoMoneda = 0.86;
        }else if(moneda.equals("pesos")){
            tipoMoneda = 1.28611;
        } else if(moneda.equals("yenes")){
            tipoMoneda = 129.852;
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Los " + euro + " euros convertidos a " + moneda + " son: " + (tipoMoneda * euro));
        System.out.println("-------------------------------------------------------------------------");
    }
}
