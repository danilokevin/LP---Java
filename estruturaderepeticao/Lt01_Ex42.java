/*
Objetivo:      Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
Programador:   Danilo Santos
Data:          20/02/2020
 */
package estruturaderepeticao;


public class Lt01_Ex42 
{
    public static void main(String[] args) 
    {
        float x, y, f, res;
        y = 1;
        res = 0;
        
        for (x=1; x <= 50; x++)
        {
            f = x/y;
            System.out.println(f);
            res += f;
            y += 2;
        }
        
        System.out.println("Resultado final: " + res);
    }
}
