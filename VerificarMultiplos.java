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

public class VerificarMultiplos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.print("Digite o primeiro valor inteiro : ");
        a = teclado.nextInt();

        System.out.print("Digite o segundo valor inteiro : ");
        b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
