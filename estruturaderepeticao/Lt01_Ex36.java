/*
Objetivo:      Receba um número N. Calcule e mostre a série 1 + 1/1! + 
               1/2! + ... + 1/N!
Programador:   Danilo Santos
Data:          20/02/2020
*/
package estruturaderepeticao;

import javax.swing.JOptionPane;

public class Lt01_Ex36 
{
    public static void main(String[] args) 
    {
        float n, x, resp, f, y;
        
        f=1;
        resp=0;
        
        n = Float.parseFloat(JOptionPane.showInputDialog("Declare um número: "));
        
        for (y=n; y >= 1; y--)
        {
            x=y;
            while (x>=1)
            {
                f=f*x;
                x-=1;
            }
            
            resp = resp + 1/f;
            f=1;
            System.out.println(resp);
        }
        
        resp += 1;
        
        System.out.println("Resultado final: " + resp);
    }  
    
}
