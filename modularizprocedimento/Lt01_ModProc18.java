/*
Objetivo:      Receba 2 valores inteiros. Calcule e mostre o resultado da 
               diferença do maior pelo menos valor
Programador:   Danilo Santos
Data:          06/02/2020
*/

package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_ModProc18 
{
    public static void main(String[] args) 
    {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Declare o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Declare o segundo número: "));
        
        ProcedureMaior(num1, num2);
        
    }
    
    static void ProcedureMaior(int n1, int n2)
    {
        int maior;
        
        maior = (n1 > n2) ? n1 - n2 : n2 - n1;
        
        System.out.println("O maior número é: " + maior);
    }
}
