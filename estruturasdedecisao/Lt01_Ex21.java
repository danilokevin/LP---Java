/*
Objetivo:       Receba 4 notas bimestrais de um aluno. Calcule e mostre a média
                aritmética. Mostre a mensagem de acordo com a média:
                a. Se a média for >= 6,0 exibir “APROVADO”;
                b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
                c. Se a média for < 3,0 exibir “RETIDO”.
Programador:    Danilo Santos
Data:           06/02/2020
 */


import javax.swing.JOptionPane;

public class Lt01_Ex21 
{
    public static void main (String args[])
    {
        float n1, n2, n3, n4, media;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Primeira Nota: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Segunda nota: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Terceira nota: "));
        n4 = Float.parseFloat(JOptionPane.showInputDialog("Quarta nota: "));
        
        media = (n1 + n2 + n3 + n4)/4;
        System.out.println("Média do Aluno: " + media);
        
        if (media >= 6){
            System.out.println("ALUNO APROVADO");
        } else 
        {
            if (media >= 3)
            {
                System.out.println("ALUNO EM EXAME");
            } else 
            {
                System.out.println("ALUNO RETIDO");
            }
        }
    }
}
