/*
Objetivo:      Receba a quantidade de alimento em quilos. Calcule e mostre 
               quantos dias durará esse alimento sabendo que a pessoa consome 
               50g ao dia. 
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util.Scanner;

public class Lt01_Ex13
{
    public static void main(String[] args) 
    {
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Declare quantos quilos de alimento possui: ");
        
        float quilos = tec.nextFloat();
        
        int dias = (int) (quilos*1000)/50;
        
        System.out.println("O alimento durará: " + dias + " dias");
    }
}
