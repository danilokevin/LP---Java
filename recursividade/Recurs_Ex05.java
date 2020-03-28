/*
Objetivo:       Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!  
Programador:    Danilo Santos
Data:           26/03/2020
*/
package recursividade;

import javax.swing.JOptionPane;

public class Recurs_Ex05 
{
    public static void main(String[] args) 
    {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        
        System.out.println("Resultado da Série: " + SerieSoma(n));
    }
    
    public static int SerieSoma(int num)
    {
        if (num == 1)
        {
            return 1;
        } else 
        {
            return SerieFat(num) + SerieSoma(num-1);
        }
    }
    
    public static int SerieFat(int nx)
    {        
        if (nx == 1)
        {
            return 1;
        } else 
        {
            return nx * SerieFat(nx-1);
        }
    }
    
}
