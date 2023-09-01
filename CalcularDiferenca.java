/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.miniteste1ppp;

/**
 *
 * @author JENNY MANJATE
 */
import java.util.Scanner;

public class CalcularDiferenca {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d;
        float diferenca;
        System.out.println("Insira o primeiro valor:");
        a = teclado.nextInt();
        System.out.println("Insira o segundo valor:");
        b = teclado.nextInt();
        System.out.println("Insira o terceiro valor:");
        c = teclado.nextInt();
        System.out.println("Insira o quarto valor:");
        d = teclado.nextInt();

        diferenca = (a * b - c * d);
        System.out.println("A difernca e igual a: "+diferenca);

    }
}
