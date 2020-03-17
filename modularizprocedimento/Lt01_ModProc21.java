/*
Objetivo:       Receba 4 notas bimestrais de um aluno. Calcule e mostre a média
                aritmética. Mostre a mensagem de acordo com a média:
                a. Se a média for >= 6,0 exibir “APROVADO”;
                b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
                c. Se a média for < 3,0 exibir “RETIDO”.
Programador:    Danilo Santos
Data:           06/02/2020
 */

package modularizprocedimento;

import javax.swing.JOptionPane;

public class Lt01_ModProc21 
{
    public static void main(String[] args) 
    {
        float nota = 0;
        ProcedureNota(nota);
       
        
    }
    
    static void ProcedureNota(float nota)
    {
        float n1, n2, n3, n4;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("1ª nota: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("2ª nota: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("3ª nota: "));
        n4 = Float.parseFloat(JOptionPane.showInputDialog("4ª nota: "));
        
        nota = (n1 + n2 + n3 + n4) / 4;
        
        System.out.println("A nota final do aluno é: " + nota);
    }
}
