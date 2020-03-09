/*
Objetivo:      Receba 2 valores inteiros. Calcule e mostre o resultado da 
               diferença do maior pelo menos valor
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util.Scanner;

public class Lt01_Ex18
{
    public static void main(String[] args) 
    {
        Scanner tec = new Scanner(System.in);
        System.out.print("Declare o primeiro número: ");
        int n1 = tec.nextInt();
        System.out.print("Declare o segundo número: ");
        int n2 = tec.nextInt();
        
        int dif = (n1>n2)?n1-n2:n2-n1;
        
        System.out.println("A diferença do maior número pelo menor é: " + dif);  
    }
}
