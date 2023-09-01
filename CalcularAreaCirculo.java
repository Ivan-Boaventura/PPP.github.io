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

public class CalcularAreaCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %.4f%n", area);

    }
}
