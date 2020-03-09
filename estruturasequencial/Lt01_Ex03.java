/*
Objetivo:       Receba a base e a altura de um triângulo. Calcule e mostre a 
                sua área.
Programador:    Danilo Santos
Data:           06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex03
{
    public static void main (String args [])
    {
        float base, altura, area;
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base: "));
	altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: "));
        
        area = (base * altura)/2;
        
        System.out.println("A área do triângulo é igual a: " + area);
    }
}
