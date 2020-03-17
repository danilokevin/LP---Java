/*
Objetivo:       Receba 3 valores obrigatoriamente em ordem crescente e um 
                4º valor não necessariamente em ordem. Mostre os 4 números em 
                ordem crescente.
Programador:    Danilo Santos
Data:           11/02/2020
*/

package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_ModProc23 
{
    public static void main(String[] args) 
    {
        float n1, n2, n3, n4;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Primeiro número: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Segundo número"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Terceiro número: "));
        n4 = Float.parseFloat(JOptionPane.showInputDialog("Quarto número: "));
        
        System.out.println("Números digitados em ordem crescente: ");
        ProcedureOrdem(n1, n2, n3, n4);
        
    }
    
    static void ProcedureOrdem(float n1, float n2, float n3, float n4)
    {
        if (n4 < n1)
        {
            System.out.println(n4 + " , " + n1 + " , " + n2 + " , " + n3);
        } else 
        {
            if (n4 < n2) 
            {
                System.out.println(n1 + " , " + n4 + " , " + n2 + " , " + n3);
            } else 
            {
                if (n4 < n3)
                {
                    System.out.println(n1 + " , " + n2 + " , " + n4 + " , " + n3);
                } else 
                {
                    System.out.println(n1 + " , " + n2 + " , " + n3 + " , " + n4);
                }
            } 
        } 
    }
    
}
