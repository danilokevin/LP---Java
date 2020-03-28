/*
Objetivo:      Receba um número N. Calcule e mostre a série 1 + 1/1! + 
               1/2! + ... + 1/N!
Programador:   Danilo Santos
Data:          20/02/2020
*/

package modularizfuncao;

import javax.swing.JOptionPane;

public class Lt01_ModFun36 
{
    public static void main(String[] args) 
    {
        float n, resFinal;
        
        n = Float.parseFloat(JOptionPane.showInputDialog("Declare um número: "));
        resFinal = 0;
        
        while (n >= 1)
        {
            resFinal += FunctionSerie(n);
            n--;
        }
        
        System.out.println("1");
        
        System.out.println("Resultado Final da Série: " + (resFinal+1));
    }
    
    static float FunctionSerie(float n1)
    {
        float x, resp, f;
        
        f = 1;
        resp = 0;
        
        x = n1;
        
        while (x >= 1)
        {
            f = f * x;
            x--;
        }
            
        System.out.println("1/" + f);
            
        resp += 1/f;
        
        return resp;
    }
    
}
