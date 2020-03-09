/*
Objetivo:      Receba 2 números reais. Calcule e mostre a diferença desses 
               valores
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util.Scanner;

public class Lt01_Ex10
{

    public static void main(String[] args) 
    {
        Scanner dados = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float n1 = dados.nextFloat();
        System.out.print("Digite outro número: ");
        float n2 = dados.nextFloat();
        
        float dif;
        
        dif = (n1<n2)? n2 - n1: n1 - n2;
        
        System.out.println("A diferença entre os dois números é: " + dif);
    }
    
}
