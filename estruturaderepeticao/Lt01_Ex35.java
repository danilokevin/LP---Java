/*
Objetivo:      Receba 2 números inteiros, verifique qual o maior entre eles. 
               Calcule e mostre o resultado da somatória dos números ímpares 
               entre esses valores.
Programador:   Danilo Santos
Data:          13/02/2020
*/
package estruturaderepeticao;

import javax.swing.JOptionPane;

public class Lt01_Ex35 
{
    public static void main(String[] args) 
    {
        int x, y, resto, soma;
        
        soma=0;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Declare mais um número: "));
        
        if (x<y)
        {
            resto = x%2;
            
            if (resto == 0)
            {
                x += 1;
            }    
                while (x<=y)
                {
                    soma += x;
                    x += 2;
                }
                
                System.out.println("Soma dos ímpares do intervalo: " + soma);
            
        } else 
        {
            resto = y%2;
            
            if (resto == 0)
            {
                y += 1;
            }    
                while (y<=x)
                {
                    soma += y;
                    y += 2;
                }
                
                System.out.println("Soma dos ímpares do intervalo: " + soma);
            
            
        }   
    } 
}
