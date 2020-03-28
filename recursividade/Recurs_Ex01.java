/*
Objetivo:       Serie1 = (1+2+3+...+100)
Programador:    Danilo Santos
Data:           26/03/2020
*/
package recursividade;

public class Recurs_Ex01 
{
    public static void main(String[] args) 
    {
        int n = 0;
        
        System.out.println("Resultado da Série: " + SerieSoma(n));
    }
    
    public static int SerieSoma(int num)
    {
        if (num == 100)
        {
            return num;
        } else 
        {
            return num + SerieSoma (num + 1);
        }
    }
    
}
