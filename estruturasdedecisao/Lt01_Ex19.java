/*
Objetivo:      Receba 2 valores reais. Calcule e mostre o maior deles.
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util.Scanner;

public class Lt01_Ex19
{
    public static void main(String[] args) 
    {
        Scanner tec = new Scanner(System.in);
        System.out.print("Declare um número: ");
        float n1 = tec.nextFloat();
        System.out.print("Declare outro número: ");
        float n2 = tec.nextFloat();
        
        float maior = (n1>n2)?n1:n2;
        
        System.out.println("O maior número é: " + maior);
    }   
}
