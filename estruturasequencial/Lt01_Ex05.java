/*
Objetivo:       Receba os coeficientes A, B e C de uma equação do 2º grau 
                (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar 
                que a equação possui 2 raízes).
Programador:    Danilo Santos
Data:           06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex05
{
    public static void main (String args [])
    {
        float A, B, C, D, X1, X2;
        A = Float.parseFloat(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        B = Float.parseFloat(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        C = Float.parseFloat(JOptionPane.showInputDialog("Digite o coeficiente C: "));
        
        D = (B*B)- 4*A*C;
        
        X1 = (float) ((-B+Math.sqrt(D))/2*A);
        X2 = (float) ((-B-Math.sqrt(D))/2*A);
        
        System.out.println("As raízes são: " + X1 + " e " + X2);
    }
}