/*
Objetivo:       Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
Programador:    Danilo Santos
Data:           26/03/2020
*/
package recursividade;

import javax.swing.JOptionPane;

public class Recurs_Ex03 
{
    public static void main(String[] args) 
    {
        float n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        
        System.out.println("Resultado da Série: " + SerieDiv(n));
    }
    
    public static float SerieDiv (float num)
    {        
        if (num == 1)
        {
            return 1;
        } else 
        {
            return 1/num + SerieDiv(num - 1);
        }
    }
}
