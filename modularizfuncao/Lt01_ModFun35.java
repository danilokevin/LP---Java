/*
Objetivo:      Receba 2 números inteiros, verifique qual o maior entre eles. 
               Calcule e mostre o resultado da somatória dos números ímpares 
               entre esses valores.
Programador:   Danilo Santos
Data:          13/02/2020
*/
package modularizfuncao;

import javax.swing.JOptionPane;

public class Lt01_ModFun35 
{
    public static void main(String[] args) 
    {
        int x, y;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Declare mais um número: "));
        
        System.out.println("Soma dos ímpares entre " + x + " e " + y + " é: " + FunctionImp(x, y));
    }

    static int FunctionImp (int x1, int y1)
    {
        int resto, soma;
        
        soma = 0;
        
        if (x1 < y1)
        {
            resto = x1 % 2;
            
            if (resto == 0)
            {
                x1++;
            }    
                while (x1 <= y1)
                {
                    soma += x1;
                    x1 += 2;
                }
        } else 
        {
            resto = y1 % 2;
            
            if (resto == 0)
            {
                y1++;
            }    
                while (y1 <= x1)
                {
                    soma += y1;
                    y1 += 2;
                }
        }
        
        return soma;
    }
}
