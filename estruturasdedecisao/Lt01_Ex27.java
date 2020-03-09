/*
Objetivo:      Receba o número de voltas, a extensão do circuito (em metros) e 
               o tempo de duração (minutos). Calcule e mostre a velocidade 
               média em km/h.
Programador:   Danilo Santos
Data:          13/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex27 {
    public static void main(String[] args) 
    {
        int voltas, tempo;
        double circ, veloc;
        
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Número de voltas: "));
        circ = Float.parseFloat(JOptionPane.showInputDialog("Extensão do circuito (m): "));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Tempo de duração (min): "));
        
        veloc = (voltas*circ)/1000;
        veloc /= tempo/60;
        
        System.out.println("A velocidade média da corrida é de: " + veloc + " km/h");

    }    
}
