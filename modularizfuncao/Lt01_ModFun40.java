/*
Objetivo:      Receba 2 números inteiros. Verifique e mostre todos os 
               números primos existentes entre eles.
Programador:   Danilo Santos
Data:          20/02/2020
 */
package modularizfuncao;

import javax.swing.JOptionPane;

public class Lt01_ModFun40 
{
    public static void main(String[] args) 
    {
        int x, y, c1, c2;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número: "));
        
         if (x > y)
        {
            c1 = y;
            c2 = x;
        } else 
        {
            c1 = x;
            c2 = y;
        }
        
        while (c1 <= c2)
        {
            if (FunctionPrimos(c1, c2) == 2)
            {
                System.out.println(c1);
            }
            c1++;
        }
    }
    
    static int FunctionPrimos(int c1, int c2)
    {
        int div, p, resto;
        String primo;
        
        div = 1;
        p = 0;
        
        while (div <= c1)
            {
                resto = c1 % div;
                
                if (resto == 0)
                {
                    p += 1;
                }
                
                div += 1;
            }
            
            return p;  
    }
    
    
}
