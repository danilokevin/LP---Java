/*
Objetivo:      Receba o número da base e do expoente. Calcule e mostre o 
               valor da potência.
Programador:   Danilo Santos
Data:          20/02/2020
 */
package estruturaderepeticao;

import javax.swing.JOptionPane;

public class Lt01_Ex44 
{
    public static void main(String[] args) 
    {
        float base, exp, cont, pot;
        
        base = Float.parseFloat(JOptionPane.showInputDialog("Declare o número da base: "));
        exp = Float.parseFloat(JOptionPane.showInputDialog("Declare o expoente"));
        cont = 1;
        
        if (exp == 0) 
        {
            pot = 1;
            System.out.println("Resultado: " + pot);
        } else 
        {
            pot = 1;
            
            while (cont <= exp)
            {
                pot *= base;
                cont += 1;
            }
            
            System.out.println("Resultado: " + pot);
        }   
    }
}
