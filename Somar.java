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

public class Somar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,soma;
        
        System.out.println("Insira o primeiro numero:");
        a = teclado.nextInt();
         System.out.println("Insira o segundo numero:");
        b = teclado.nextInt();
        soma=a+b;
        System.out.println("A soma dos dois números inseridos é: "+soma);
    }

}
