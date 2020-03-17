/*
Objetivo:      Receba 2 valores reais. Calcule e mostre o maior deles.
Programador:   Danilo Santos
Data:          06/02/2020
*/
package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_ModProc19 
{
    public static void main(String[] args) 
    {
        float num1, num2;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Declare o primeiro número: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Declare o primeiro número: "));
        
        ProcedureMaior(num1, num2);
        
    }
     static void ProcedureMaior(float n1, float n2)
     {
         float maior;
         
         maior = (n1 > n2) ? n1 : n2;
         
         System.out.println("O maior número é: " + maior);
     }
             
}
