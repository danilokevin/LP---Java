/*
Objetivo:      Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 
               + ... + 15/225
Programador:   Danilo Santos
Data:          20/02/2020
 */
package modularizfuncao;

public class Lt01_ModFun45 
{
    public static void main(String[] args) 
    {
        float x, resultado = 1;
        
        System.out.println(resultado);
        
        for (x=2;x<=15;x++)
        {
            resultado += FunctionSerie(x);            
        }
        
        System.out.println("Resultado Final da Série: " + resultado);
    }
    
    static float FunctionSerie (float x)
    {
        float y, f;
        
        y = x*x;
        f = x/y;
        
        if (x % 2 == 0)
        {
            f *= -1;
        }
        
        System.out.println(f);
        return f;
    }
    
}
