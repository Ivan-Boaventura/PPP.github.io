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

public class NumeroPositivo_Negativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        System.out.println("Insira o valor que deseja:");
        a = teclado.nextInt();
        if(a>0){
            System.out.println("O número inserido é positivo.");
        }else{
            System.out.println("O número inserido é negativo.");
        }
    }

}
