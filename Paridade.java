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

public class Paridade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        double numero = input.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("O numero" + " " + numero + " " + "e par");
        } else {
            System.out.println("O numero" + " " + numero + " " + "e impar");
        }
    }

}


