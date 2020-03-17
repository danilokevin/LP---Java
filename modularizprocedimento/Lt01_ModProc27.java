/*
Objetivo:      Receba o número de voltas, a extensão do circuito (em metros) e 
               o tempo de duração (minutos). Calcule e mostre a velocidade 
               média em km/h.
Programador:   Danilo Santos
Data:          13/02/2020
*/

package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_ModProc27 
{
    public static void main(String[] args) 
    {
        int voltas, tempo;
        float circ;
        
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Número de voltas: "));
        circ = Float.parseFloat(JOptionPane.showInputDialog("Extensão do circuito (m): "));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Tempo de duração (min): "));
        
        ProcedureVel(voltas, tempo, circ);
        
    }
    
    static void ProcedureVel(int voltas, int tempo, float circ)
    {
        double veloc;
        
        veloc = (voltas*circ)/1000;
        veloc /= tempo/60;
        
        System.out.println("A velocidade média da corrida é de: " + veloc + " km/h");
    }
    
}
