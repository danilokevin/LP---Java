/*
Objetivo:       Serie1 = (1+2+3+...+100)
Programador:    Danilo Santos
Data:           26/03/2020
*/
package recursividade;

import javax.swing.JOptionPane;

public class Recurs_Ex02 
{
    public static void main(String[] args) 
    {
        int n = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Declare o número: "));
        
        System.out.println("Resultado da Série: " + SerieSubt(n));   
    }
    
    public static int SerieSubt (int num) 
    {
        if (num == 1)
        {
            return 1;
        } else 
        {
            return num + SerieSubt(num - 1);
        }
    }
    
}
