/*
Objetivo:      Receba os valores de 2 catetos de um triângulo retângulo. 
               Calcule e mostre a hipotenusa.
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util.Scanner;

public class Lt01_Ex15 
{
    public static void main(String[] args) 
    {
        Scanner tec = new Scanner (System.in);
        System.out.print("Declare o valor do primeiro cateto: ");
        int cat1 = tec.nextInt();
        System.out.print("Declare o valor do segundo cateto: ");
        int cat2 = tec.nextInt();
        
        int soma = (int) (Math.pow(cat1,2) + Math.pow(cat2,2));
        
        int hip = (int) Math.sqrt(soma);
        
        System.out.println("Valor da Hipotenusa: " + hip);
        
    }  
}
