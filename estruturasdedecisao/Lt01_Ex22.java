/*
Objetivo:       Receba 2 valores inteiros e diferentes. Mostre seus valores 
                em ordem crescente.
Programador:    Danilo Santos
Data:           11/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex22 
{
    public static void main(String[] args) 
    {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número: "));
        
        if (n1 > n2)
        {
            System.out.println("Ordem crescente: " + n2 + " e " + n1);
        } else 
        {
            System.out.println("Ordem Crescente: " + n1 + " e " + n2);
        }
    }
}
