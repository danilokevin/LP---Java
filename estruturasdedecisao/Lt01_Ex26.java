/*
Objetivo:      Receba 2 números inteiros. Verifique e mostre se o maior número 
               é múltiplo do menor.
Programador:   Danilo Santos
Data:          13/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex26 {
    public static void main(String[] args) 
    {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        if (n1 > n2)
        {
            if (n1 % n2 == 0)
            {
                System.out.println(n1 + " é múltiplo de " + n2);
            } else 
            {
                System.out.println(n1 + " NÃO é múltiplo de " + n2);
            }
        } else 
        {
            if (n2 % n1 == 0)
            {
                System.out.println(n2 + " é múltiplo de " + n1);
            } else 
            {
                System.out.println(n2 + " NÃO é múltiplo de " + n1);
            }
        }
    }
}
