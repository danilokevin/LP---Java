/*
Objetivo:       Receba um valor inteiro. Verifique e mostre se é divisível 
                por 2 e 3.
Programador:    Danilo Santos
Data:           11/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex24 
{
    public static void main(String[] args) 
    {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        if (n % 6 == 0)
        {
            System.out.println("Sim, o número é divisível por 2 e 3");
        } else 
        {
            System.out.println("O número não é divisível por 2 e 3");
        }
    }
}

