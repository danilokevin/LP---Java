/*
Objetivo:      Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
Programador:   Danilo Santos
Data:          20/02/2020
 */
package modularizfuncao;


public class Lt01_ModFun42 
{
    public static void main(String[] args) 
    {
        float x, y, resultado;
        
        y = 1;
        resultado = 0;
        
        for (x = 1; x <= 50; x++)
        {
            resultado += FunctionSerie(x, y);
            y += 2;
        }
        
        System.out.println("Resultado Final da Série: " + resultado);
    }
    
    static float FunctionSerie(float x, float y)
    {
        float termo;
        
        termo = (x/y);
        System.out.println(termo);
        
        return termo;
    }
}
