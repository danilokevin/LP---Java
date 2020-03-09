/*
Objetivo:      Receba um número. Calcule e mostre os resultados da tabuada 
               desse número
Programador:   Danilo Santos
Data:          13/02/2020
*/
package estruturaderepeticao;

import javax.swing.JOptionPane;

public class Lt01_Ex34 
{
    public static void main(String[] args) 
    {
        int n, mult, res;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        res = 0;
        
        for (mult=0;mult<=10;mult++)
        {
            res = n*mult;
            System.out.println(n + " x " + mult + " = " + res);
        }  
    }
}
