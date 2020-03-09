/*
Objetivo:      Receba 3 coeficientes A, B, e C de uma equação do 2º grau da 
               fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes 
               reais e se caso exista, calcule e mostre
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util.Scanner;

public class Lt01_Ex20
{
    public static void main(String[] args) 
    {
        Scanner tec = new Scanner(System.in);
        System.out.print("Coeficiente A: ");
        float coefA = tec.nextFloat();
        System.out.print("Coeficiente B: ");
        float coefB = tec.nextFloat();
        System.out.print("Coeficiente C: ");
        float coefC = tec.nextFloat();
        
        float delta = (float) (Math.pow(coefB,2) - 4*coefA*coefC);
        float r1, r2;
        
        if (delta<0)
        {
            System.out.println("A equação não possui raízes!");
        } else 
        {
            if (delta==0)
            {
                System.out.print("A equação possui raízes iguais!");
                
                r1 = -coefB / 2*coefA;
                
                System.out.println("Raíz: " + r1);
                
            } else 
            {
                System.out.print("A equação possui 2 raízes diferentes!");
                
                r1 = (float) (-coefB+(Math.sqrt(delta)));
                r1 /= 2*coefA;
                
                r2 = (float) (-coefB-(Math.sqrt(delta)));
                r2 /= 2*coefA;
                
                System.out.printf("As raízes são %.2f e %.2f", r1, r2);   
            }
        }   
    } 
}
