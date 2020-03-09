/*
Objetivo:      Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 
               3º ângulo. 
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util.Scanner;

public class Lt01_Ex14
{
    public static void main(String[] args) 
    {
        Scanner tec = new Scanner(System.in);
        System.out.print("Primeiro ângulo: ");
        int ang1 = tec.nextInt();
        System.out.print("Segundo ângulo: ");
        int ang2 = tec.nextInt();
        
        int ang3 = 180 - (ang1 + ang2);
        
        System.out.println("O terceiro ângulo é de: " + ang3 + " graus");
        
    }   
}
