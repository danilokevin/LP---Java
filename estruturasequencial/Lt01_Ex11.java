/*
Objetivo:      Receba o raio de uma circunferência. Calcule e mostre o 
               comprimento da circunferência.
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util. Scanner;

        
public class Lt01_Ex11
{
    public static void main(String[] args) 
    {
        Scanner tec = new Scanner (System.in);
        System.out.println("Digite o raio da circunferência: ");
        float raio = tec.nextFloat();
        
        float circ = (float) ((raio*2)* Math.PI);
        
        System.out.printf("O comprimento da circunferência é: %.2f \n", circ);
    } 
}
