/*
Objetivo:      Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + 
               ... + 1/N
Programador:   Danilo Santos
Data:          13/02/2020
*/

package estruturaderepeticao;

import javax.swing.JOptionPane;

public class Lt01_Ex33 
{
    public static void main(String[] args) 
    {
        float n, resp;
        n = Float.parseFloat(JOptionPane.showInputDialog("Declare um número: "));
        resp=0;
                
        while (n > 0)
        {
            resp += 1/n; 
            n -= 1;
            System.out.println("Série= " + resp);
        }
    }
}
