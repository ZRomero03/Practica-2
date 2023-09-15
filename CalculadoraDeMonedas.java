/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clculadorademonedas;
import java.util.Scanner;
public class CalculadoraDeMonedas {

    /** 
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe cantidad en pesos");
        double pesos = lectura.nextDouble();
        
        double euros = pesos/18.21;
        System.out.println("la cantidad ingresada en euros es " + euros);
        double dolares = pesos/17.07;
        System.out.println("la cantidad ingresada en dolares es " + dolares);
        double yen = pesos/0.12;
        System.out.println("la cantidad ingresada en yenes es " + yen);
        double libras = pesos/21.18;
        System.out.println("la cantidad ingresada en libras es " + libras);
    }
}

