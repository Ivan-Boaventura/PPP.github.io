/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.miniteste1ppp;

/**
 *
 * @author JENNY MANJATE
 */
import java.util.Scanner;

public class CalcularValor_Pecas {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double valor1 = 0;
        int numeropeca1;
        int codigopeca1;

        double valor2 = 0;
        int numeropeca2;
        int codigopeca2;

        double valortotal = 0;

        System.out.println("digite o codigo de peca1");
        codigopeca1 = teclado.nextInt();

        System.out.println("Digite o numero de peca 1");
        numeropeca1 = teclado.nextInt();

        System.out.println("digite o valor unitario da peca 1");
        valor1 = teclado.nextDouble();

        System.out.println("digite o codigo de peca2");
        codigopeca2 = teclado.nextInt();

        System.out.println("Digite o numero de peca 2");
        numeropeca2 = teclado.nextInt();

        System.out.println("digite o valor unitario da peca 2");
        valor2 = teclado.nextDouble();

        valortotal = (numeropeca1 * valor1) + (numeropeca2 * valor2);

        System.out.println("Valor total a ser pago" + valortotal);
    }
}
