/*
Objetivo:      Receba um número inteiro. Calcule e mostre o seu fatorial
Programador:   Danilo Santos
Data:          13/02/2020
*/
package estruturaderepeticao;

import javax.swing.JOptionPane;

public class Lt01_Ex32 
{
    public static void main(String[] args) 
    {
        int n, f;
        
        f = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Declare um número: "));
        
        while (n>0){
            f *= n;
            n -= 1;
        }
        
        System.out.println("Seu fatorial é igual a: " + f);   
    }
}
