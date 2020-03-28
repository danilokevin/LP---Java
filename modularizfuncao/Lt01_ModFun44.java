/*
Objetivo:      Receba o número da base e do expoente. Calcule e mostre o 
               valor da potência.
Programador:   Danilo Santos
Data:          20/02/2020
 */
package modularizfuncao;

import javax.swing.JOptionPane;

public class Lt01_ModFun44 
{
    public static void main(String[] args) 
    {
        float base, exp;
        
        base = Float.parseFloat(JOptionPane.showInputDialog("Declare o número da base: "));
        exp = Float.parseFloat(JOptionPane.showInputDialog("Declare o expoente"));
        
        if (exp == 0) {
            System.out.println("Resultado: " + 1);
        }else
        {
            System.out.println("Resultad0: " + FunctionExp(base, exp));
        }
        
    }
    
    static float FunctionExp(float base, float exp)
    {
        int cont = 1;
        float pot = 1;
        
        while (cont <= exp)
        {
            pot *= base;
            cont += 1;
        }
        
        return pot;
    }   
}
