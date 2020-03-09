/*
Objetivo:       Receba a temperatura em graus Celsius. Calcule e mostre a sua
                temperatura convertida em fahrenheit F = (9*C+160) /5.
Programador:    Danilo Santos
Data:           06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex04
{
    public static void main (String args [])
    {
        float cel, fahr;
        cel = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
        
        fahr = (9 * cel + 160)/5;
        
        System.out.println("A temperatura convertida em Fahrenheit é igual a: " + fahr);
    }
}
