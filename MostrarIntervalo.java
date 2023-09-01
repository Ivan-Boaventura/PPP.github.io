/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniteste1ppp;

/**
 *
 * @author JENNY MANJATE
 */
import java.util.Scanner;

public class MostrarIntervalo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        System.out.println("Insira o valor que deseja:");
        a = teclado.nextInt();

        if (a >= 0 && a <= 25) {
            System.out.println("O numero inserido encontra-se no intervalo de [0,25].");
        } else if (a >= 25 && a <= 50) {
            System.out.println("O numero inserido encontra-se no intervalo de ]25,50].");
        } else if (a >= 50 && a <= 75) {
            System.out.println("O numero inserido encontra-se no intervalo de ]50,75].");
        } else if (a >= 75 && a <= 100) {
            System.out.println("O numero inserido encontra-se no intervalo de ]75,100].");
        } else {
            System.out.println("Fora de intervalo");
        }
    }

}
