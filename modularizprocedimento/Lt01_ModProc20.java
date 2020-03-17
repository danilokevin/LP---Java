/*
Objetivo:      Receba 3 coeficientes A, B, e C de uma equação do 2º grau da 
               fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes 
               reais e se caso exista, calcule e mostre
Programador:   Danilo Santos
Data:          06/02/2020
*/

package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_ModProc20 
{
    public static void main(String[] args) 
    {
        float A, B, C;
        
        A = Float.parseFloat(JOptionPane.showInputDialog("Coeficiente A: "));
        B = Float.parseFloat(JOptionPane.showInputDialog("Coeficiente B: "));
        C = Float.parseFloat(JOptionPane.showInputDialog("Coeficiente C: "));
        
        ProcedureRaiz(A, B, C);
    }
    
    static void ProcedureRaiz(float a, float b, float c)
    {
        float delta, x1, x2;
        
        delta = (float) (Math.pow(b,2) - 4*a*c);
        
        if (delta<0)
        {
            System.out.println("A equação não possui raízes!");
        } else 
        {
            if (delta==0)
            {
                System.out.print("A equação possui raízes iguais!");
                
                x1 = -b / 2*a;
                
                System.out.println("Raíz: " + x1);
                
            } else 
            {
                System.out.print("A equação possui 2 raízes diferentes!");
                
                x1 = (float) (-b+(Math.sqrt(delta)));
                x1 /= 2*a;
                
                x2 = (float) (-b-(Math.sqrt(delta)));
                x2 /= 2*a;
                
                System.out.printf("As raízes são %.2f e %.2f", x1, x2);   
            }
        }   
        
    }
}
