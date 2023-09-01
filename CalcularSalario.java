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

public class CalcularSalario {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double salario = 0;
        double valorh = 0;
        int horas;
        int numeroF;
        System.out.println("Introduza o numero do funcionario");
        numeroF = teclado.nextInt();

        System.out.println("introduza numero de horas trabalhadas");
        horas = teclado.nextInt();

        System.out.println("Introduza o valor recebido por hora");
        valorh = teclado.nextDouble();

        System.out.println("Introduza o salario");
        salario = teclado.nextDouble();
        salario = valorh * horas;

        System.out.println(numeroF);

        System.out.println(salario);

    }
}
