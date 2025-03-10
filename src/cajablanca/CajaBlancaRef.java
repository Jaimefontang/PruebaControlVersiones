/* HOLA HOLA HOLA HOLA
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajablanca;

import java.util.Scanner;

/**
 * Clase principal que contiene métodos para generar un número aleatorio y mostrar un mensaje en la consola.
 * 
 * @author damiansu
 */
public class CajaBlancaRef {

    /**
     * Genera un número aleatorio entre 0 y 199.
     * 
     * @param b Parámetro que no se utiliza en el método.
     * @return Un número entero aleatorio entre 0 y 199.
     */
    private static int generarNumeroAleatorio(int b) {
        return (int) (Math.random() * 200 - 1);
    }

    /**
     * Muestra un mensaje en la consola pidiendo al usuario que adivine un número.
     */
    public static void mostrarMensajeAdivinanza() {
        System.out.print("Adivina el número del 1 al ... ");
    }

    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Muestra el mensaje de adivinanza
        mostrarMensajeAdivinanza();

        // Crea un objeto Scanner para leer la entrada del usuario (aunque no se usa en este ejemplo)
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = -900;

        // Genera un número aleatorio
        numeroAleatorio = generarNumeroAleatorio(numeroAleatorio);

        // Imprime el número generado
        System.out.println(numeroAleatorio);
    }
}