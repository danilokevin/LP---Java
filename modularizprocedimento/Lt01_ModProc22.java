/*
Objetivo:       Receba 2 valores inteiros e diferentes. Mostre seus valores 
                em ordem crescente.
Programador:    Danilo Santos
Data:           11/02/2020
 */
package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_ModProc22 
{
    public static void main(String[] args) 
    {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Declare outro número: "));
        
        ProcedureCresc(n1, n2);
    }
    
    static void ProcedureCresc(int num1, int num2)
    {
        if (num1 > num2)
        {
            System.out.println("Ordem crescente: " + num2 + " e " + num1);
        } else 
        {
            System.out.println("Ordem crescente: " + num1 + " e " + num2);
        }
    }
}
