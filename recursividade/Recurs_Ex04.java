/*
Objetivo:       Serie4 = (N/1) + (N-1 / 2 ) + (N-2 / 3) + .... + (1/N)  
Programador:    Danilo Santos
Data:           26/03/2020
*/
package recursividade;

import javax.swing.JOptionPane;

public class Recurs_Ex04
{
    public static void main(String[] args) 
    {
        float x = 1, n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        
        System.out.println("O resultado da Série é: " + SerieDiv2(n, x));
    }
    
    public static float SerieDiv2(float num, float y)
    {
        if (num == 1)
        {
            return 1/y;            
        } else 
        {
            return num/y + SerieDiv2(num-1,y+1);
        }
    }
    
    
}
