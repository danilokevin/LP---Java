/*
Objetivo:      Receba um número inteiro. Calcule e mostre o seu fatorial
Programador:   Danilo Santos
Data:          13/02/2020
*/

package modularizfuncao;

import javax.swing.JOptionPane;

public class Lt01_ModFun32 
{
    public static void main(String[] args) 
    {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Declare o número: "));
        
        System.out.println("O fatorial de " + n + " é " + FunçãoFatorial(n));
        
    }
    
    static int FunçãoFatorial(int n1)
    {
        int fatorial = 1;
        
        while (n1 > 0)
        {
            fatorial *= n1;
            n1--;
        }
        
        return fatorial;
    } 
}
