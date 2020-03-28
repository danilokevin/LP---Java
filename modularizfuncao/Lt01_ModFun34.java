/*
Objetivo:      Receba um número. Calcule e mostre os resultados da tabuada 
               desse número
Programador:   Danilo Santos
Data:          13/02/2020
*/
package modularizfuncao;

import javax.swing.JOptionPane;

public class Lt01_ModFun34 
{
    public static void main(String[] args) 
    {
        int n, mult;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        
        for (mult=0;mult<=10;mult++)
        {
            System.out.println(n + " x " + mult + " = " + FunctionTabu(mult, n));
        }  
    }
    
    static int FunctionTabu(int multiplic, int n1)
    {
        int result;
        
        result = multiplic * n1;
        return result;
    }
    
}
