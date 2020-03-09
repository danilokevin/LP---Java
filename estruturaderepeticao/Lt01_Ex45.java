/*
Objetivo:      Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 
               + ... + 15/225
Programador:   Danilo Santos
Data:          20/02/2020
 */
package estruturaderepeticao;

public class Lt01_Ex45 
{
    public static void main(String[] args) 
    {
        int x;
        double f, res, y;
        
        res = 1;
        y = 0;
        
        System.out.println(res);
        
        for (x=2; x<=15; x++)
        {
            y = x*x;
            f = x/y;
            
            System.out.printf("%.3f", f);
            System.out.print("\n");
            
            if (x%2==0)
            {
                res -= f;
            } else 
            {
                res += f;
            }
        }
        
        System.out.println("Resultado Final: " + res);
    } 
}
